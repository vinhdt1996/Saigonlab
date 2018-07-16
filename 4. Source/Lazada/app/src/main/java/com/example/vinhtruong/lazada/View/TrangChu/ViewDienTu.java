package com.example.vinhtruong.lazada.View.TrangChu;

import com.example.vinhtruong.lazada.Model.ObjectClass.DienTu;
import com.example.vinhtruong.lazada.Model.ObjectClass.SanPham;
import com.example.vinhtruong.lazada.Model.ObjectClass.ThuongHieu;

import java.util.List;

/**
 * Created by vinhtruong on 6/9/2018.
 */

public interface ViewDienTu {
 void HienThiDanhSach(List<DienTu> dienTus);
 void HienThiLogoThuongHieu(List<ThuongHieu> thuongHieus);
 void LoiLayDuLieu();
 void HienThiSanPhamMoiVe(List<SanPham> sanPhams);
}
