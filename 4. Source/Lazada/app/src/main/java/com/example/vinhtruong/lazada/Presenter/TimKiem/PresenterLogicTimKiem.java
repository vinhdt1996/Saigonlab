package com.example.vinhtruong.lazada.Presenter.TimKiem;

import com.example.vinhtruong.lazada.Model.ObjectClass.SanPham;
import com.example.vinhtruong.lazada.Model.TimKiem.ModelTimKiem;
import com.example.vinhtruong.lazada.View.TimKiem.ViewTimKiem;

import java.util.List;

/**
 * Created by vinhtruong on 7/19/2018.
 */

public class PresenterLogicTimKiem implements IPresenterTimKiem {

    ViewTimKiem viewTimKiem;
    ModelTimKiem modelTimKiem;

    public PresenterLogicTimKiem(ViewTimKiem viewTimKiem){
        this.viewTimKiem = viewTimKiem;
        modelTimKiem = new ModelTimKiem();
    }

    @Override
    public void TimKiemSanPhamTheoTenSP(String tensp, int limit) {
        List<SanPham> sanPhamList = modelTimKiem.TimKiemSanPhamTheoTen(tensp,"DANHSACHSANPHAM","TimKiemSanPhamTheoTenSP",limit);

        if(sanPhamList.size() > 0){
            viewTimKiem.TimKiemThanhCong(sanPhamList);

        }else{
            viewTimKiem.TimKiemThatBai();
        }
    }
}