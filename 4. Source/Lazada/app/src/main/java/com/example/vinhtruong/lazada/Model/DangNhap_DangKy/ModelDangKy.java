package com.example.vinhtruong.lazada.Model.DangNhap_DangKy;

import android.util.Log;

import com.example.vinhtruong.lazada.ConnectInternet.DownloadJSON;
import com.example.vinhtruong.lazada.Model.ObjectClass.NhanVien;
import com.example.vinhtruong.lazada.View.TrangChu.TrangChuActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by vinhtruong on 6/8/2018.
 */

public class ModelDangKy {
    public String DangKyThanhVien(NhanVien nhanVien){
        String duongdan = TrangChuActivity.SERVER_NAME;
        String  kqKiemtra="";
        List<HashMap<String,String>> attrs=new ArrayList<>();

        HashMap<String,String> hsHam=new HashMap<>();
        hsHam.put("ham", "DangKyThanhVien");

        HashMap<String,String> hsTenNV=new HashMap<>();
        hsTenNV.put("tennv", nhanVien.getTenNV());

        HashMap<String,String> hsTenDN=new HashMap<>();
        hsTenDN.put("tendangnhap", nhanVien.getTenDN());

        HashMap<String,String> hsMatKhau=new HashMap<>();
        hsMatKhau.put("matkhau", nhanVien.getMatKhau());

        HashMap<String,String> hsMaLoaiNV=new HashMap<>();
        hsMaLoaiNV.put("maloainv", String.valueOf(nhanVien.getMaLoaiNV()));

        attrs.add(hsHam);
        attrs.add(hsTenNV);
        attrs.add(hsTenDN);
        attrs.add(hsMatKhau);
        attrs.add(hsMaLoaiNV);

        DownloadJSON downloadJSON=new DownloadJSON(duongdan,attrs);
        downloadJSON.execute();

        try {
            String dulieuJSON =downloadJSON.get();

            JSONObject jsonObject=new JSONObject(dulieuJSON);
            String ketqua=jsonObject.getString("ketqua");


            if(ketqua.equals("true")){
                kqKiemtra= "true";
            } else if(ketqua.equals("datontai")){
                kqKiemtra= "datontai";
            } else{
                kqKiemtra= "false";
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return kqKiemtra;
    }
}
