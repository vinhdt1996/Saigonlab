package com.example.vinhtruong.lazada.Presenter.HienThiSanPhamTheoDanhMuc;

import android.view.View;
import android.widget.ProgressBar;

import com.example.vinhtruong.lazada.Model.HienThiSanPhamTheoDanhMuc.ModelHienThiSanPhamTheoDanhMuc;
import com.example.vinhtruong.lazada.Model.ObjectClass.SanPham;
import com.example.vinhtruong.lazada.View.HienThiSanPhamTheoDanhMuc.ViewHienThiSpTheoDanhMuc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vinhtruong on 6/21/2018.
 */

public class PresenterLogicHienThiSanPhamTheoDanhMuc implements IPresenterHienThiSanPhamTheoDanhMuc {

    ViewHienThiSpTheoDanhMuc viewHienThiSpTheoDanhMuc;
    ModelHienThiSanPhamTheoDanhMuc modelHienThiSanPhamTheoDanhMuc;

    public PresenterLogicHienThiSanPhamTheoDanhMuc(ViewHienThiSpTheoDanhMuc viewHienThiSpTheoDanhMuc) {
        this.viewHienThiSpTheoDanhMuc = viewHienThiSpTheoDanhMuc;
        modelHienThiSanPhamTheoDanhMuc=new ModelHienThiSanPhamTheoDanhMuc();
    }

    @Override
    public void LayDanhSachSanPhamTheoMaLoai(int masp, boolean kiemtra) {
        List<SanPham> sanPhamList = new ArrayList<>();
        if(kiemtra){
            sanPhamList = modelHienThiSanPhamTheoDanhMuc.LayDanhSachSanPhamTheoMaLoai(masp,"DANHSACHSANPHAM","LayDanhSachSanPhamTheoMaThuongHieu",0);
        }else{
            sanPhamList = modelHienThiSanPhamTheoDanhMuc.LayDanhSachSanPhamTheoMaLoai(masp,"DANHSACHSANPHAM","LayDanhSachSanPhamTheoMaLoaiDanhMuc",0);
        }

        if(sanPhamList.size() > 0){
            viewHienThiSpTheoDanhMuc.HienThiDanhSachSanPham(sanPhamList);
        }else{
            viewHienThiSpTheoDanhMuc.LoiHienThiDanhSachSpTheoDanhMuc();
        }
    }

    public List<SanPham> LayDanhSachSanPhamTheoMaLoaiLoadMore(int masp, boolean kiemtra, int limit, ProgressBar progressBar){
        progressBar.setVisibility(View.VISIBLE);
        List<SanPham> sanPhamList=new ArrayList<>();
        if(kiemtra){
            sanPhamList = modelHienThiSanPhamTheoDanhMuc.LayDanhSachSanPhamTheoMaLoai(masp,"DANHSACHSANPHAM","LayDanhSachSanPhamTheoMaThuongHieu",limit);
        }else{
            sanPhamList = modelHienThiSanPhamTheoDanhMuc.LayDanhSachSanPhamTheoMaLoai(masp,"DANHSACHSANPHAM","LayDanhSachSanPhamTheoMaLoaiDanhMuc",limit);
        }

        if(sanPhamList.size() != 0){
            progressBar.setVisibility(View.GONE);
        }

        return sanPhamList;
    }
}
