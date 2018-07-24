package com.example.vinhtruong.lazada.View.DanhGia;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.vinhtruong.lazada.Model.DangNhap_DangKy.ModelDangNhap;
import com.example.vinhtruong.lazada.Model.ObjectClass.DanhGia;
import com.example.vinhtruong.lazada.Presenter.DanhGia.PresenterLogicDanhGia;
import com.example.vinhtruong.lazada.R;

import java.util.List;

public class ThemDanhGiaActivity extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener, ViewDanhGia,View.OnClickListener{
    TextInputLayout input_edNoiDung;
    EditText edNoiDung;
    RatingBar rbDanhGia;
    int masp = 0;
    int sosao = 0;
    Button btnDongYDanhGia;
    PresenterLogicDanhGia presenterLogicDanhGia;
    ModelDangNhap modelDangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_danh_gia);

        modelDangNhap=new ModelDangNhap();

        input_edNoiDung = (TextInputLayout) findViewById(R.id.input_edNoiDungDanhGia);

        edNoiDung = (EditText) findViewById(R.id.edNoiDung);
        rbDanhGia = (RatingBar) findViewById(R.id.rbDanhGia);
        btnDongYDanhGia = (Button) findViewById(R.id.btnDongYDanhGia);


        masp = getIntent().getIntExtra("masp",0);

        presenterLogicDanhGia = new PresenterLogicDanhGia(this);

        rbDanhGia.setOnRatingBarChangeListener(this);
        btnDongYDanhGia.setOnClickListener(this);
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        sosao = (int)rating;
    }

    @Override
    public void DanhGiaThanhCong() {
        Toast.makeText(this,"Đánh giá thành công !",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void DanhGiaThatBai() {
        Toast.makeText(this,"Bạn không thể đánh giá sản phẩm này!",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void HienThiDanhSachDanhGiaTheoSanPham(List<DanhGia> danhGiaList) {

    }



    @Override
    public void onClick(View v) {
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
        //String madg = telephonyManager.getDeviceId();
        //String madg="112233";

        //String tenthietbi = Build.MODEL;
        int manv=modelDangNhap.LayMaDangNhap(this);
        String madg=String.valueOf(manv);

        String tenDanhGia = modelDangNhap.LayTenDangNhap(this);

        String noidung = edNoiDung.getText().toString();


        if(noidung.trim().length() > 0){
            input_edNoiDung.setError("");
            input_edNoiDung.setErrorEnabled(false);
        }else{
            input_edNoiDung.setErrorEnabled(true);
            input_edNoiDung.setError("Bạn chưa nhập nội dung");
        }

        if(!input_edNoiDung.isErrorEnabled()){
            DanhGia danhGia = new DanhGia();
            danhGia.setMASP(masp);
            danhGia.setMADG(madg);

            danhGia.setNOIDUNG(noidung);
            danhGia.setSOSAO(sosao);
            danhGia.setTENTHIETBI(tenDanhGia);

            presenterLogicDanhGia.ThemDanhGia(danhGia);
            finish();

        }

    }
}
