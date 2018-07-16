package com.example.vinhtruong.lazada.Model.TrangChu.XuLyMenu;

import android.os.Bundle;
import android.util.Log;

import com.example.vinhtruong.lazada.ConnectInternet.DownloadJSON;
import com.example.vinhtruong.lazada.Model.ObjectClass.LoaiSanPham;
import com.example.vinhtruong.lazada.View.TrangChu.TrangChuActivity;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by vinhtruong on 6/7/2018.
 */

public class XuLyJSONMenu {
    String tennguoidung="";
    public List<LoaiSanPham> ParserJSONMenu(String dulieujson){
        List<LoaiSanPham> loaiSanPhamList = new ArrayList<>();

        try {
            JSONObject jsonObject = new JSONObject(dulieujson);
            JSONArray loaisanpham = jsonObject.getJSONArray("LOAISANPHAM");
            int count = loaisanpham.length();
            Log.d("dem",dulieujson);
            Log.d("dem", String.valueOf(count));

            for(int i=0;i<count;i++){
                JSONObject value = loaisanpham.getJSONObject(i);

                LoaiSanPham dataloaiSanPham = new LoaiSanPham();
                dataloaiSanPham.setMALOAISP(Integer.parseInt(value.getString("MALOAISP")));
                dataloaiSanPham.setMALOAICHA(Integer.parseInt(value.getString("MALOAI_CHA")));
                dataloaiSanPham.setTENLOAISP(value.getString("TENLOAISP"));

                loaiSanPhamList.add(dataloaiSanPham);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return loaiSanPhamList;
    }

    public List<LoaiSanPham> LayLoaiSanPhamTheoMaLoai(int maloaisp){

        List<LoaiSanPham> loaiSanPhamList=new ArrayList<>();
        List<HashMap<String,String>> attrs=new ArrayList<>();
        String dataJSON="";

        String duongdan = TrangChuActivity.SERVER_NAME;

        HashMap<String,String> hsHam=new HashMap<>();
        hsHam.put("ham", "LayDanhSachMenu");

        HashMap<String,String> hsMaLoaiCha=new HashMap<>();
        hsMaLoaiCha.put("maloaicha", String.valueOf(maloaisp));

        attrs.add(hsMaLoaiCha);
        attrs.add(hsHam);

        DownloadJSON downloadJSON=new DownloadJSON(duongdan,attrs);
        downloadJSON.execute();

        try {
            dataJSON = downloadJSON.get();
            XuLyJSONMenu xuLyJSONMenu = new XuLyJSONMenu();
            loaiSanPhamList = xuLyJSONMenu.ParserJSONMenu(dataJSON);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return loaiSanPhamList;
    }

}
