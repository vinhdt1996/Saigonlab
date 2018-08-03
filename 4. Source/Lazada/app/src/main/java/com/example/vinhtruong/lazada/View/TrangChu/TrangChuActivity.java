package com.example.vinhtruong.lazada.View.TrangChu;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.vinhtruong.lazada.Adapter.ViewPagerAdapter;
import com.example.vinhtruong.lazada.Model.DangNhap_DangKy.ModelDangNhap;
import com.example.vinhtruong.lazada.Presenter.ChiTietSanPham.PresenterLogicChiTietSanPham;
import com.example.vinhtruong.lazada.R;
import com.example.vinhtruong.lazada.View.DangNhap_DangKy.DangNhapActivity;
import com.example.vinhtruong.lazada.View.GioHang.GioHangActivity;
import com.example.vinhtruong.lazada.View.TimKiem.TimKiemActivity;

public class TrangChuActivity extends AppCompatActivity implements View.OnClickListener{
    //SERVER
    public static final String SERVER = "http://192.168.40.33:81/weblazada";
    public static final String SERVER_NAME = SERVER+"/loaisanpham.php";
    //Layout
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TextView txtGioHang;;
    private Button btnSearch;
    //
    private ModelDangNhap modelDangNhap;
    public String tennv;

    private Menu menu;
    boolean onPause=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        //Ánh Xạ
        AnhXa();
        //Toolbar
        setSupportActionBar(toolbar);
        //Tabsss
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        modelDangNhap=new ModelDangNhap();
        btnSearch.setOnClickListener(this);

    }

    private void AnhXa() {
        toolbar=findViewById(R.id.toolbarTrangchu);
        tabLayout=findViewById(R.id.tabs);
        viewPager=findViewById(R.id.viewpager);
        btnSearch=findViewById(R.id.btnSearch);
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.menu_trangchu,menu);
        this.menu=menu;

        MenuItem iGioHang = menu.findItem(R.id.itGioHang);
        View giaoDienCustomGioHang = MenuItemCompat.getActionView(iGioHang);
        txtGioHang = (TextView) giaoDienCustomGioHang.findViewById(R.id.txtSoLuongSanPhamGioHang);

        giaoDienCustomGioHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGioHang=new Intent(TrangChuActivity.this, GioHangActivity.class);
                startActivity(iGioHang);
            }
        });

        PresenterLogicChiTietSanPham presenterLogicChiTietSanPham=new PresenterLogicChiTietSanPham();
        txtGioHang.setText(String.valueOf(presenterLogicChiTietSanPham.DemSanPhamCoTrongGioHang(this)));



        tennv = modelDangNhap.LayTenDangNhap(this);
        if(!tennv.equals("")){
            MenuItem menuDangNhap=menu.findItem(R.id.itDangNhap);
            menuDangNhap.setTitle(tennv);

            MenuItem menuDangKy = menu.findItem(R.id.itDangKy);
            menuDangKy.setVisible(false);
        }

        if(!tennv.equals("")){
            MenuItem menuDangXuat = menu.findItem(R.id.itDangXuat);
            menuDangXuat.setVisible(true);
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id){
            case R.id.itDangNhap:
            case R.id.itDangKy:
                if(modelDangNhap.LayTenDangNhap(this).equals("")){
                    Intent iDangNhap = new Intent(this, DangNhapActivity.class);
                    startActivity(iDangNhap);
                };
                break;

            case R.id.itDangXuat:
                if(!modelDangNhap.LayTenDangNhap(this).equals("")){
                    modelDangNhap.CapNhatCachedDangNhap(this,"",0);
                    this.menu.clear();
                    this.onCreateOptionsMenu(this.menu);
                    Intent iDangNhap = new Intent(this, DangNhapActivity.class);
                    iDangNhap.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(iDangNhap);
                    finish();
                }
                break;
        }
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(onPause){
            PresenterLogicChiTietSanPham presenterLogicChiTietSanPham=new PresenterLogicChiTietSanPham();
            txtGioHang.setText(String.valueOf(presenterLogicChiTietSanPham.DemSanPhamCoTrongGioHang(this)));
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        onPause=true;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id){
            case R.id.btnSearch:
                Intent iTimKiem = new Intent(TrangChuActivity.this, TimKiemActivity.class);
                startActivity(iTimKiem);
                break;
        }
    }
}
