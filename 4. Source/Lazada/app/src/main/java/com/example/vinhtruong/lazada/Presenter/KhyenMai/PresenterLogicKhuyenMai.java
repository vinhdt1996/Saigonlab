package com.example.vinhtruong.lazada.Presenter.KhyenMai;

import com.example.vinhtruong.lazada.Model.KhuyenMai.ModelKhuyenMai;
import com.example.vinhtruong.lazada.Model.ObjectClass.KhuyenMai;
import com.example.vinhtruong.lazada.View.TrangChu.ViewKhuyenMai;

import java.util.List;

/**
 * Created by vinhtruong on 7/19/2018.
 */

public class PresenterLogicKhuyenMai implements IPresenterKhuyenMai {

    ViewKhuyenMai viewKhuyenMai;
    ModelKhuyenMai modelKhuyenMai;

    public PresenterLogicKhuyenMai(ViewKhuyenMai viewKhuyenMai){
        this.viewKhuyenMai = viewKhuyenMai;
        modelKhuyenMai = new ModelKhuyenMai();
    }

    @Override
    public void LayDanhSachKhuyenMai() {
        List<KhuyenMai> khuyenMaiList = modelKhuyenMai.LayDanhSachSanPhamTheoMaLoai("LayDanhSachKhuyenMai","DANHSACHKHUYENMAI");
        if(khuyenMaiList.size() > 0){
            viewKhuyenMai.HienThiDanhSachKhuyenMai(khuyenMaiList);
        }
    }
}