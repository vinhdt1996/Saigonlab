package com.example.vinhtruong.lazada.View.DanhGia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import com.example.vinhtruong.lazada.Adapter.AdapterDanhGia;
import com.example.vinhtruong.lazada.Model.ObjectClass.DanhGia;
import com.example.vinhtruong.lazada.Model.ObjectClass.ILoadMore;
import com.example.vinhtruong.lazada.Model.ObjectClass.LoadMoreScroll;
import com.example.vinhtruong.lazada.Presenter.DanhGia.PresenterLogicDanhGia;
import com.example.vinhtruong.lazada.R;

import java.util.ArrayList;
import java.util.List;

public class DanhSachDanhGiaActivity extends AppCompatActivity implements ViewDanhGia{
    RecyclerView recyclerDanhSachDanhGia;
    int masp = 0;
    PresenterLogicDanhGia presenterLogicDanhGia;
    List<DanhGia> tatcaDanhGia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_danh_gia);

        recyclerDanhSachDanhGia = (RecyclerView) findViewById(R.id.recyclerDanhSachDanhGia);


        masp = getIntent().getIntExtra("masp",0);
        tatcaDanhGia = new ArrayList<>();

        presenterLogicDanhGia = new PresenterLogicDanhGia(this);
        presenterLogicDanhGia.LayDanhSachDanhGiaCuaSanPham(masp,0);
    }

    @Override
    public void DanhGiaThanhCong() {

    }

    @Override
    public void DanhGiaThatBai() {

    }

    @Override
    public void HienThiDanhSachDanhGiaTheoSanPham(List<DanhGia> danhGiaList) {
        tatcaDanhGia.addAll(danhGiaList);
        AdapterDanhGia adapterDanhGia = new AdapterDanhGia(this,tatcaDanhGia,0);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerDanhSachDanhGia.setLayoutManager(layoutManager);
        recyclerDanhSachDanhGia.setAdapter(adapterDanhGia);
        adapterDanhGia.notifyDataSetChanged();
    }


}
