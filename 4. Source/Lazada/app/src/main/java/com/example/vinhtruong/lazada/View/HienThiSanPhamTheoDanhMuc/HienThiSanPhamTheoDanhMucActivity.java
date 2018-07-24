package com.example.vinhtruong.lazada.View.HienThiSanPhamTheoDanhMuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.vinhtruong.lazada.Adapter.AdapterTopDienThoaiDienTu;
import com.example.vinhtruong.lazada.Model.ObjectClass.ILoadMore;
import com.example.vinhtruong.lazada.Model.ObjectClass.LoadMoreScroll;
import com.example.vinhtruong.lazada.Model.ObjectClass.SanPham;
import com.example.vinhtruong.lazada.Presenter.HienThiSanPhamTheoDanhMuc.PresenterLogicHienThiSanPhamTheoDanhMuc;
import com.example.vinhtruong.lazada.R;

import java.util.List;

public class HienThiSanPhamTheoDanhMucActivity extends AppCompatActivity implements ViewHienThiSpTheoDanhMuc, View.OnClickListener{

    RecyclerView recyclerView;
    ImageButton btnThayDoiTrangThaiRecycler;
    Boolean dangGrid =true;
    RecyclerView.LayoutManager layoutManager;
    PresenterLogicHienThiSanPhamTheoDanhMuc presenterLogicHienThiSanPhamTheoDanhMuc;
    int masp;
    boolean kiemtra;
    AdapterTopDienThoaiDienTu adapterTopDienThoaiDienTu;
    Toolbar toolbar;
    List<SanPham> sanPhamList1;
    ProgressBar progressBar;
    String tensp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_thi_san_pham_theo_danh_muc);

        btnThayDoiTrangThaiRecycler=findViewById(R.id.btnThayDoiTrangThaiRecycler);
        recyclerView=findViewById(R.id.recycleViewHienThiSanPhamTheoDanhMuc);
        toolbar=findViewById(R.id.toolbarDanhMuc);
        progressBar = findViewById(R.id.progress_bar);

        Intent intent=getIntent();
        masp = intent.getIntExtra("MALOAI",0);
        tensp = intent.getStringExtra("TENLOAI");
        kiemtra = intent.getBooleanExtra("KIEMTRA",false);

        presenterLogicHienThiSanPhamTheoDanhMuc=new PresenterLogicHienThiSanPhamTheoDanhMuc(this);
        presenterLogicHienThiSanPhamTheoDanhMuc.LayDanhSachSanPhamTheoMaLoai(masp,kiemtra);

        btnThayDoiTrangThaiRecycler.setOnClickListener(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(tensp);

    }


    @Override
    public void HienThiDanhSachSanPham(List<SanPham> sanPhamList) {
        sanPhamList1=sanPhamList;
        if(dangGrid==true){
            btnThayDoiTrangThaiRecycler.setImageResource(R.drawable.ic_apps_black_24dp);
            layoutManager=new GridLayoutManager(this,2);
            adapterTopDienThoaiDienTu=new AdapterTopDienThoaiDienTu(this,R.layout.custom_topdienthoaivamaytinhbang,sanPhamList1);
        }else{
            btnThayDoiTrangThaiRecycler.setImageResource(R.drawable.ic_view_list_black_24dp);
            layoutManager=new LinearLayoutManager(this);
            adapterTopDienThoaiDienTu=new AdapterTopDienThoaiDienTu(this,R.layout.custom_list_topdienthoaivamaytinhbang,sanPhamList1);
        }

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterTopDienThoaiDienTu);
        adapterTopDienThoaiDienTu.notifyDataSetChanged();
    }

    @Override
    public void LoiHienThiDanhSachSpTheoDanhMuc() {

    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.btnThayDoiTrangThaiRecycler:
                dangGrid=!dangGrid;
                presenterLogicHienThiSanPhamTheoDanhMuc.LayDanhSachSanPhamTheoMaLoai(masp,kiemtra);
                break;
        }
    }


}
