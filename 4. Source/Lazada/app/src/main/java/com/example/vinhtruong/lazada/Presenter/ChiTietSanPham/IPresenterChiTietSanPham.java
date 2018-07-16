package com.example.vinhtruong.lazada.Presenter.ChiTietSanPham;

import android.content.Context;

import com.example.vinhtruong.lazada.Model.ObjectClass.SanPham;

/**
 * Created by vinhtruong on 7/13/2018.
 */

public interface IPresenterChiTietSanPham {
    void LayChiTietSanPham(int masp);
    void LayDanhSachDanhGiaTheoCuaSanPham(int masp, int limit);
    void ThemGioHang(SanPham sanPham, Context context);
}

