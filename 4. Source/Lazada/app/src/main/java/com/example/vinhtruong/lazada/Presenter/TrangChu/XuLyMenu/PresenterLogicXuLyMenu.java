package com.example.vinhtruong.lazada.Presenter.TrangChu.XuLyMenu;

import android.util.Log;

import com.example.vinhtruong.lazada.ConnectInternet.DownloadJSON;
import com.example.vinhtruong.lazada.Model.DangNhap_DangKy.ModelDangNhap;
import com.example.vinhtruong.lazada.Model.ObjectClass.LoaiSanPham;
import com.example.vinhtruong.lazada.Model.TrangChu.XuLyMenu.XuLyJSONMenu;
import com.example.vinhtruong.lazada.View.TrangChu.TrangChuActivity;
import com.example.vinhtruong.lazada.View.TrangChu.ViewXuLyMenu;
import com.facebook.AccessToken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by vinhtruong on 6/7/2018.
 */

public class PresenterLogicXuLyMenu implements IPresenterXuLyMenu {

    ViewXuLyMenu viewXuLyMenu;
    String tennguoidung="";

    public PresenterLogicXuLyMenu(ViewXuLyMenu viewXuLyMenu) {
        this.viewXuLyMenu = viewXuLyMenu;
    }

    @Override
    public void LayDanhSachMenu() {

        List<LoaiSanPham> loaiSanPhamList;
        String dataJSON ="";
        List<HashMap<String,String>> attrs=new ArrayList<>();
        //GET
        //String duongdan ="http://192.168.1.3:81/lazada/loaisanpham.php?maloaicha=1";
        //DownloadJSON downloadJSON=new DownloadJSON(duongdan);

        //POST
        String duongdan = TrangChuActivity.SERVER_NAME;

        HashMap<String,String> hsHam=new HashMap<>();
        hsHam.put("ham","LayDanhSachMenu");

        HashMap<String,String> hsMaLoaiCha=new HashMap<>();
        hsMaLoaiCha.put("maloaicha","0");

        attrs.add(hsMaLoaiCha);
        attrs.add(hsHam);

        DownloadJSON downloadJSON=new DownloadJSON(duongdan,attrs);
        downloadJSON.execute();

        try {
            dataJSON = downloadJSON.get();

            XuLyJSONMenu xuLyJSONMenu = new XuLyJSONMenu();
            loaiSanPhamList = xuLyJSONMenu.ParserJSONMenu(dataJSON);
            Log.d("cc", String.valueOf(loaiSanPhamList));
            viewXuLyMenu.HienThiDanhSachMenu(loaiSanPhamList);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    @Override
    public AccessToken LayTokenNguoiDungFacebook() {
        ModelDangNhap modelDangNhap=new ModelDangNhap();
        AccessToken accessToken = modelDangNhap.LayTokenFacebookHienTai();



        return accessToken;
    };
}
