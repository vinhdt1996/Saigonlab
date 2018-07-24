package com.example.vinhtruong.lazada.Presenter.DangKy;

import com.example.vinhtruong.lazada.Model.DangNhap_DangKy.ModelDangKy;
import com.example.vinhtruong.lazada.Model.DangNhap_DangKy.ModelDangNhap;
import com.example.vinhtruong.lazada.Model.ObjectClass.NhanVien;
import com.example.vinhtruong.lazada.View.DangNhap_DangKy.ViewDangKy;

/**
 * Created by vinhtruong on 6/8/2018.
 */

public class PresenterLogicDangKy implements IPresenterDangKy {
    ViewDangKy viewDangKy;
    ModelDangKy modelDangKy;


    public PresenterLogicDangKy(ViewDangKy viewDangKy) {
        this.viewDangKy = viewDangKy;
        modelDangKy=new ModelDangKy();
    }

    @Override
    public void ThucHienDangKy(NhanVien nhanVien) {
        String kiemtra = modelDangKy.DangKyThanhVien(nhanVien);
        if(kiemtra.equals("true")){
            viewDangKy.DangKyThanhCong();
        } else if(kiemtra.equals("datontai")){
            viewDangKy.TaiKhoanDaTonTai();
        } else{
            viewDangKy.DangKyThatBai();
        }
    }
}
