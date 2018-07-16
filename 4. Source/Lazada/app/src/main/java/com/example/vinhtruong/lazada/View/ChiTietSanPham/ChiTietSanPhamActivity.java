package com.example.vinhtruong.lazada.View.ChiTietSanPham;

import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.vinhtruong.lazada.Adapter.AdapterViewPagerSlider;
import com.example.vinhtruong.lazada.Model.ObjectClass.DanhGia;
import com.example.vinhtruong.lazada.Model.ObjectClass.SanPham;
import com.example.vinhtruong.lazada.Presenter.ChiTietSanPham.PresenterLogicChiTietSanPham;
import com.example.vinhtruong.lazada.R;
import com.example.vinhtruong.lazada.View.TrangChu.TrangChuActivity;

import java.util.ArrayList;
import java.util.List;

public class ChiTietSanPhamActivity extends AppCompatActivity implements ViewChiTietSanPham, ViewPager.OnPageChangeListener{
    ViewPager viewPager;
    PresenterLogicChiTietSanPham presenterLogicChiTietSanPham;
    TextView[] txtDots;
    LinearLayout layoutDots;
    List<Fragment> fragmentList;
    TextView txtTenSanPham,txtGiaTien,txtTenCHDongGoi,txtThongTinChiTiet,txtXemTatCaNhanXet,txtGioHang,txtGiamGia;
    Toolbar toolbar;
    ImageView imXemThemChiTiet,imThemGioHang;
    Button btnMuaNgay;
    boolean kiemtraxochitiet = false;
    LinearLayout lnThongSoKyThuat;
    TextView txtVietDanhGia;
    int masp;
    List<DanhGia> danhGiaList;
    RecyclerView recyclerDanhGiaChiTiet;
    SanPham sanPhamGioHang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_san_pham);

        viewPager = (ViewPager) findViewById(R.id.viewpagerSlider);
        layoutDots = (LinearLayout) findViewById(R.id.layoutDots);
        txtTenSanPham = (TextView) findViewById(R.id.txtTenSanPham);
        txtGiaTien = (TextView) findViewById(R.id.txtGiaTien);
        txtTenCHDongGoi = (TextView) findViewById(R.id.txtTenCHDongGoi);
        txtGiamGia = (TextView) findViewById(R.id.txtGiamGia);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        txtThongTinChiTiet = (TextView) findViewById(R.id.txtThongTinChiTiet);
        imXemThemChiTiet = (ImageView) findViewById(R.id.imXemThemChiTiet);
        lnThongSoKyThuat = (LinearLayout) findViewById(R.id.lnThongSoKyThuat);
        txtVietDanhGia = (TextView) findViewById(R.id.txtVietDanhGia);
        recyclerDanhGiaChiTiet = (RecyclerView) findViewById(R.id.recyclerDanhGiaChiTiet);
        txtXemTatCaNhanXet = (TextView) findViewById(R.id.txtXemTatCaNhanXet);
        imThemGioHang = (ImageView) findViewById(R.id.imThemGioHang);
        btnMuaNgay = (Button) findViewById(R.id.btnMuaNgay);

        setSupportActionBar(toolbar);

        masp = getIntent().getIntExtra("masp",0);

        presenterLogicChiTietSanPham = new PresenterLogicChiTietSanPham(this);
        presenterLogicChiTietSanPham.LayChiTietSanPham(masp);
        presenterLogicChiTietSanPham.LayDanhSachDanhGiaTheoCuaSanPham(masp,0);
    }

    @Override
    public void HienChiTietSanPham(SanPham sanPham) {

    }

    @Override
    public void HienSliderSanPham(String[] linkhinhsanpham) {
        fragmentList = new ArrayList<>();

        for (int i=0;i<linkhinhsanpham.length ;i++){
            FragmentSliderChiTietSanPham fragmentSliderChiTietSanPham = new FragmentSliderChiTietSanPham();
            Bundle bundle = new Bundle();
            bundle.putString("linkhinh", TrangChuActivity.SERVER + linkhinhsanpham[i]);
            fragmentSliderChiTietSanPham.setArguments(bundle);

            fragmentList.add(fragmentSliderChiTietSanPham);

        }

        AdapterViewPagerSlider adapterViewPagerSlider = new AdapterViewPagerSlider(getSupportFragmentManager(),fragmentList);
        viewPager.setAdapter(adapterViewPagerSlider);
        adapterViewPagerSlider.notifyDataSetChanged();

        ThemDotSlider(0);
        viewPager.addOnPageChangeListener(this);
    }

    private void ThemDotSlider(int vitrihientai){
        txtDots = new TextView[fragmentList.size()];

        layoutDots.removeAllViews();
        for (int i=0 ; i<fragmentList.size(); i++){
            txtDots[i] = new TextView(this);
            txtDots[i].setText(Html.fromHtml("&#8226;"));
            txtDots[i].setTextSize(40);
            txtDots[i].setTextColor(getIdColor(R.color.colorSliderInActive));

            layoutDots.addView(txtDots[i]);
        }

        txtDots[vitrihientai].setTextColor(getIdColor(R.color.bgToolbar));
    }
    private int getIdColor(int idcolor){

        int color =0;
        if(Build.VERSION.SDK_INT > 21){
            color = ContextCompat.getColor(this,idcolor);
        }else{
            color = getResources().getColor(idcolor);
        }

        return color;
    }


    @Override
    public void HienThiDanhGia(List<DanhGia> danhGiaList) {

    }

    @Override
    public void ThemGioHangThanhCong() {

    }

    @Override
    public void ThemGiohangThatBai() {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        ThemDotSlider(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
