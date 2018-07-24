package com.example.vinhtruong.lazada.Model.DangNhap_DangKy;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.example.vinhtruong.lazada.ConnectInternet.DownloadJSON;
import com.example.vinhtruong.lazada.View.TrangChu.TrangChuActivity;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by vinhtruong on 6/8/2018.
 */

public class ModelDangNhap {


    public String LayTenDangNhap(Context context){
        SharedPreferences cachedDangNhap = context.getSharedPreferences("dangnhap",Context.MODE_PRIVATE);
        String tennv = cachedDangNhap.getString("tennv","");
        return tennv;
    }
    public int LayMaDangNhap(Context context){
        SharedPreferences cachedDangNhap = context.getSharedPreferences("dangnhap",Context.MODE_PRIVATE);
        int manv = cachedDangNhap.getInt("manv",0);
        return manv;
    }

    public void CapNhatCachedDangNhap(Context context,String tenv, int manv){
        SharedPreferences cachedDangNhap = context.getSharedPreferences("dangnhap",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = cachedDangNhap.edit();
        editor.putString("tennv",tenv);
        editor.putInt("manv",manv);
        editor.commit();
    }

    public boolean KiemTraDangNhap(Context context,String tendangnhap, String matkhau){
        boolean kiemtra = false;
        String duongdan = TrangChuActivity.SERVER_NAME;
        List<HashMap<String,String>> attrs = new ArrayList<>();

        HashMap<String,String> hsHam = new HashMap<>();
        hsHam.put("ham","KiemTraDangNhap");

        HashMap<String,String> hsTenDangNhap = new HashMap<>();
        hsTenDangNhap.put("tendangnhap",tendangnhap);

        HashMap<String,String> hsMatKhau = new HashMap<>();
        hsMatKhau.put("matkhau",matkhau);

        attrs.add(hsHam);
        attrs.add(hsTenDangNhap);
        attrs.add(hsMatKhau);

        DownloadJSON downloadJSON = new DownloadJSON(duongdan,attrs);
        downloadJSON.execute();

        try {
            String dulieu = downloadJSON.get();
            JSONObject jsonObject = new JSONObject(dulieu);
            String jsonKetQua = jsonObject.getString("ketqua");
            if(jsonKetQua.equals("true")){
                kiemtra = true;
                String tennv = jsonObject.getString("tennv");
                int manv = jsonObject.getInt("manv");

                CapNhatCachedDangNhap(context,tennv, manv);

            }else{
                kiemtra = false;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return kiemtra;
    }
}
