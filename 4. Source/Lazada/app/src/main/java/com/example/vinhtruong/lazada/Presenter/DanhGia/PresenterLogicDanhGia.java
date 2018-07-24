package com.example.vinhtruong.lazada.Presenter.DanhGia;

import android.view.View;
import android.widget.ProgressBar;

import com.example.vinhtruong.lazada.Model.DanhGia.ModelDanhGia;
import com.example.vinhtruong.lazada.Model.ObjectClass.DanhGia;
import com.example.vinhtruong.lazada.View.DanhGia.ViewDanhGia;

import java.util.List;

/**
 * Created by vinhtruong on 7/17/2018.
 */

public class PresenterLogicDanhGia implements IPresenterDanhGia {
    ViewDanhGia viewDanhGia;
    ModelDanhGia modelDanhGia;

    public PresenterLogicDanhGia(ViewDanhGia viewDanhGia){
        this.viewDanhGia = viewDanhGia;
        modelDanhGia = new ModelDanhGia();
    }

    @Override
    public void ThemDanhGia(DanhGia danhGia) {
        boolean kiemtra = modelDanhGia.ThemDanhGia(danhGia);
        if (kiemtra){
            viewDanhGia.DanhGiaThanhCong();
        }else{
            viewDanhGia.DanhGiaThatBai();
        }
    }

    @Override
    public void LayDanhSachDanhGiaCuaSanPham(int masp, int limit) {

        List<DanhGia> danhGiaList = modelDanhGia.LayDanhSachDanhGiaCuaSanPham(masp,limit);
        if (danhGiaList.size() > 0){
            viewDanhGia.HienThiDanhSachDanhGiaTheoSanPham(danhGiaList);
        }
    }
}
