package com.example.vinhtruong.lazada.View.DanhGia;

import com.example.vinhtruong.lazada.Model.ObjectClass.DanhGia;

import java.util.List;

/**
 * Created by vinhtruong on 7/17/2018.
 */

public interface ViewDanhGia {
    void DanhGiaThanhCong();
    void DanhGiaThatBai();
    void HienThiDanhSachDanhGiaTheoSanPham(List<DanhGia> danhGiaList);
}
