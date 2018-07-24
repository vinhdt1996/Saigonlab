package com.example.vinhtruong.lazada.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.vinhtruong.lazada.View.DangNhap_DangKy.Fragment.FragmentDangKy;
import com.example.vinhtruong.lazada.View.DangNhap_DangKy.Fragment.FragmentDangNhap;
import com.example.vinhtruong.lazada.View.TrangChu.Fragment.FragmentChuongTrinhKhuyenMai;
import com.example.vinhtruong.lazada.View.TrangChu.Fragment.FragmentDienTu;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vinhtruong on 6/7/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentDienTu fragmentDienTu=new FragmentDienTu();
                return fragmentDienTu;
            case 1:
                FragmentChuongTrinhKhuyenMai fragmentChuongTrinhKhuyenMai=new FragmentChuongTrinhKhuyenMai();
                return fragmentChuongTrinhKhuyenMai;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Sản phẩm";
            case 1:
                return "Chương trình khuyến mãi";
            default:
                return null;
        }
    }

}
