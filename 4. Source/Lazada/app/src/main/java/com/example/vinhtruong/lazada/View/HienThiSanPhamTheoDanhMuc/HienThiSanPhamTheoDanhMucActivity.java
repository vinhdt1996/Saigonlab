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
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.vinhtruong.lazada.Adapter.AdapterTopDienThoaiDienTu;
import com.example.vinhtruong.lazada.Model.ObjectClass.ILoadMore;
import com.example.vinhtruong.lazada.Model.ObjectClass.LoadMoreScroll;
import com.example.vinhtruong.lazada.Model.ObjectClass.SanPham;
import com.example.vinhtruong.lazada.Presenter.HienThiSanPhamTheoDanhMuc.PresenterLogicHienThiSanPhamTheoDanhMuc;
import com.example.vinhtruong.lazada.R;

import java.util.List;

public class HienThiSanPhamTheoDanhMucActivity extends AppCompatActivity implements ViewHienThiSpTheoDanhMuc, View.OnClickListener,ILoadMore{

    RecyclerView recyclerView;
    Button btnThayDoiTrangThaiRecycler;
    Boolean dangGrid =true;
    RecyclerView.LayoutManager layoutManager;
    PresenterLogicHienThiSanPhamTheoDanhMuc presenterLogicHienThiSanPhamTheoDanhMuc;
    int masp;
    boolean kiemtra;
    AdapterTopDienThoaiDienTu adapterTopDienThoaiDienTu;
    Toolbar toolbar;
    List<SanPham> sanPhamList1;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hien_thi_san_pham_theo_danh_muc);

        btnThayDoiTrangThaiRecycler=findViewById(R.id.btnThayDoiTrangThaiRecycler);
        recyclerView=findViewById(R.id.recycleViewHienThiSanPhamTheoDanhMuc);
        toolbar=findViewById(R.id.toolbar);
        progressBar = findViewById(R.id.progress_bar);

        Intent intent=getIntent();
        masp = intent.getIntExtra("MALOAI",0);
        String tensp = intent.getStringExtra("TENLOAI");
        kiemtra = intent.getBooleanExtra("KIEMTRA",false);

        presenterLogicHienThiSanPhamTheoDanhMuc=new PresenterLogicHienThiSanPhamTheoDanhMuc(this);
        presenterLogicHienThiSanPhamTheoDanhMuc.LayDanhSachSanPhamTheoMaLoai(masp,kiemtra);

        btnThayDoiTrangThaiRecycler.setOnClickListener(this);
        toolbar.setTitle(tensp);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_trangchu,menu);
        return true;
    }

    @Override
    public void HienThiDanhSachSanPham(List<SanPham> sanPhamList) {
        sanPhamList1=sanPhamList;
        if(dangGrid==true){
            layoutManager=new GridLayoutManager(this,2);
            adapterTopDienThoaiDienTu=new AdapterTopDienThoaiDienTu(this,R.layout.custom_topdienthoaivamaytinhbang,sanPhamList1);
        }else{
            layoutManager=new LinearLayoutManager(this);
            adapterTopDienThoaiDienTu=new AdapterTopDienThoaiDienTu(this,R.layout.custom_list_topdienthoaivamaytinhbang,sanPhamList1);
        }

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterTopDienThoaiDienTu);
        recyclerView.addOnScrollListener(new LoadMoreScroll(layoutManager,this));
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

    @Override
    public void LoadMore(int tongitem) {
        List<SanPham> listsanPhamsLoadMore = presenterLogicHienThiSanPhamTheoDanhMuc.LayDanhSachSanPhamTheoMaLoaiLoadMore(masp,kiemtra,tongitem,progressBar);
        sanPhamList1.addAll(listsanPhamsLoadMore);

        adapterTopDienThoaiDienTu.notifyDataSetChanged();
    }
}
