package com.example.vinhtruong.lazada.View.ChiTietSanPham;

import com.example.vinhtruong.lazada.Model.ObjectClass.DanhGia;
import com.example.vinhtruong.lazada.Model.ObjectClass.SanPham;

import java.util.List;

/**
 * Created by vinhtruong on 7/13/2018.
 */

public interface ViewChiTietSanPham {
    void HienChiTietSanPham(SanPham sanPham);
    void HienSliderSanPham(String[] linkhinhsanpham);
    void HienThiDanhGia(List<DanhGia> danhGiaList);
    void ThemGioHangThanhCong();
    void ThemGiohangThatBai();
}
