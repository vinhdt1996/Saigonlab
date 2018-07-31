package com.example.vinhtruong.lazada.View.ManHinhChao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.vinhtruong.lazada.R;
import com.example.vinhtruong.lazada.View.DangNhap_DangKy.DangNhapActivity;
import com.example.vinhtruong.lazada.View.TrangChu.TrangChuActivity;

public class ManHinhChaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chao);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(2000);
                }catch (Exception e){

                }finally {
                    Intent iDangNhap = new Intent(ManHinhChaoActivity.this, DangNhapActivity.class);
                    iDangNhap.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(iDangNhap);
                    finish();
                }
            }
        });

        thread.start();
    }
}
