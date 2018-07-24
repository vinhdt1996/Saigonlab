package com.example.vinhtruong.lazada.Presenter.DanhGia;

import android.widget.ProgressBar;

import com.example.vinhtruong.lazada.Model.ObjectClass.DanhGia;

/**
 * Created by vinhtruong on 7/17/2018.
 */

public interface IPresenterDanhGia {
    void ThemDanhGia(DanhGia danhGia);
    void LayDanhSachDanhGiaCuaSanPham(int masp, int limit);
}
