package com.example.vinhtruong.lazada.View.DangNhap_DangKy;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.vinhtruong.lazada.Adapter.ViewpagerAdapterDangNhap;
import com.example.vinhtruong.lazada.R;

public class DangNhapActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        tabLayout=findViewById(R.id.tabDangNhap);
        viewPager=findViewById(R.id.viewpagerDangNhap);
        toolbar=findViewById(R.id.toolbarDangNhap);

        setSupportActionBar(toolbar);

        ViewpagerAdapterDangNhap viewpagerAdapterDangNhap=new ViewpagerAdapterDangNhap(getSupportFragmentManager());
        viewPager.setAdapter(viewpagerAdapterDangNhap);
        viewpagerAdapterDangNhap.notifyDataSetChanged();

        tabLayout.setupWithViewPager(viewPager);
    }
}
