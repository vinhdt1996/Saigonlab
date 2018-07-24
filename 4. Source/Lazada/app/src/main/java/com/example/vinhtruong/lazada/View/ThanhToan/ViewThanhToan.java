package com.example.vinhtruong.lazada.View.ThanhToan;

import com.example.vinhtruong.lazada.Model.ObjectClass.SanPham;

import java.util.List;

/**
 * Created by vinhtruong on 7/19/2018.
 */

public interface ViewThanhToan {
    void DatHangThanhCong();
    void DatHangThatBai();
    void LayDanhSachSanPhamTrongGioHang(List<SanPham> sanPhamList);
}
