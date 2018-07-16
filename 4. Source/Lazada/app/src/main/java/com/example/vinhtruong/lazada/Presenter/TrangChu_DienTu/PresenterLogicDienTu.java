package com.example.vinhtruong.lazada.Presenter.TrangChu_DienTu;

import android.view.View;

import com.example.vinhtruong.lazada.Model.ObjectClass.DienTu;
import com.example.vinhtruong.lazada.Model.ObjectClass.SanPham;
import com.example.vinhtruong.lazada.Model.ObjectClass.ThuongHieu;
import com.example.vinhtruong.lazada.Model.TrangChu_DienTu.ModelDienTu;
import com.example.vinhtruong.lazada.View.TrangChu.ViewDienTu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vinhtruong on 6/9/2018.
 */

public class PresenterLogicDienTu implements IPresenter_DienTu{

    ViewDienTu viewDienTu;
    ModelDienTu modelDienTu;

    public PresenterLogicDienTu(ViewDienTu viewDienTu) {
        this.viewDienTu = viewDienTu;
        modelDienTu=new ModelDienTu();
    }

    @Override
    public void LayDanhSachDienTu() {

        List<DienTu> dienTus=new ArrayList<>();

        List<ThuongHieu> thuongHieuList = modelDienTu.LayDanhSachThuongHieuLon("LayDanhSachCacThuongHieuLon","DANHSACHTHUONGHIEU");
        List<SanPham> sanPhamList = modelDienTu.LayDanhSachSanPhamTOP("LayDanhSachTopDienThoaiVaMayTinhBang","TOPDIENTHOAI&MAYTINHBANG");

        DienTu dienTu=new DienTu();
        dienTu.setThuongHieus(thuongHieuList);
        dienTu.setSanPhams(sanPhamList);
        dienTu.setTennoibat("Thương hiệu lớn");
        dienTu.setTentopnoibat("Top điện thoại và máy tính bảng");
        dienTu.setThuonghieu(true);
        dienTus.add(dienTu);

        List<ThuongHieu> phukienList = modelDienTu.LayDanhSachThuongHieuLon("LayDanhSachPhuKien","DANHSACHPHUKIEN");
        List<SanPham> topphukienList = modelDienTu.LayDanhSachSanPhamTOP("LayDanhSachTopPhuKien","TOPPHUKIEN");

        DienTu dienTu1=new DienTu();
        dienTu1.setThuongHieus(phukienList);
        dienTu1.setSanPhams(topphukienList);
        dienTu1.setTennoibat("Phụ kiện");
        dienTu1.setTentopnoibat("Top phụ kiện");
        dienTu1.setThuonghieu(false);
        dienTus.add(dienTu1);

        List<ThuongHieu> tienichList = modelDienTu.LayDanhSachThuongHieuLon("LayDanhSachTienIch","DANHSACHTIENICH");
        List<SanPham> toptienichList = modelDienTu.LayDanhSachSanPhamTOP("LayTopTienIch","TOPTIENICH");

        DienTu dienTu2=new DienTu();
        dienTu2.setThuongHieus(tienichList);
        dienTu2.setSanPhams(toptienichList);
        dienTu2.setTennoibat("Tiện ích");
        dienTu2.setTentopnoibat("Top Video & Tivi");
        dienTu2.setThuonghieu(false);
        dienTus.add(dienTu2);

        if(thuongHieuList.size()>0 && sanPhamList.size()>0){
            viewDienTu.HienThiDanhSach(dienTus);
        }
    }

    @Override
    public void LayDanhSachLogoThuongHieu() {
        List<ThuongHieu> thuongHieuList = modelDienTu.LayDanhSachThuongHieuLon("LayLogoThuongHieuLon","DANHSACHTHUONGHIEU");
        if(thuongHieuList.size() > 0){
            viewDienTu.HienThiLogoThuongHieu(thuongHieuList);
        }else{
            viewDienTu.LoiLayDuLieu();
        }
    }

    @Override
    public void LayDanhSachSanPhamMoi() {
        List<SanPham> sanPhamList = modelDienTu.LayDanhSachSanPhamTOP("LayDanhSachSanPhamMoi","DANHSACHSANPHAMMOIVE");
        if(sanPhamList.size() > 0){
            viewDienTu.HienThiSanPhamMoiVe(sanPhamList);
        }else{
            viewDienTu.LoiLayDuLieu();
        }
    }
}
