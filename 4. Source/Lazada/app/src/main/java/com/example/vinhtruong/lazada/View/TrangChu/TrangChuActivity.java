package com.example.vinhtruong.lazada.View.TrangChu;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import com.example.vinhtruong.lazada.Adapter.ExpandAdater;
import com.example.vinhtruong.lazada.Adapter.ViewPagerAdapter;
import com.example.vinhtruong.lazada.Model.DangNhap_DangKy.ModelDangNhap;
import com.example.vinhtruong.lazada.Model.ObjectClass.LoaiSanPham;
import com.example.vinhtruong.lazada.Presenter.TrangChu.XuLyMenu.PresenterLogicXuLyMenu;
import com.example.vinhtruong.lazada.R;
import com.example.vinhtruong.lazada.View.DangNhap_DangKy.DangNhapActivity;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class TrangChuActivity extends AppCompatActivity implements ViewXuLyMenu{

    public static final String SERVER_NAME = "http://192.168.43.106:81/lazada/loaisanpham.php";
    public static final String SERVER = "http://192.168.43.106:81/lazada";

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private ExpandableListView expandableListView;
    PresenterLogicXuLyMenu logicXuLyMenu;
    String tennguoidung;
    AccessToken accessToken;
    ModelDangNhap modelDangNhap;
    Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_trang_chu);
        //Ánh Xạ
        AnhXa();
        //Toolbar
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        drawerToggle.syncState();
        //Tabsss
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        //Xử lý menu
        modelDangNhap=new ModelDangNhap();
        logicXuLyMenu=new PresenterLogicXuLyMenu(this);
        logicXuLyMenu.LayDanhSachMenu();

    }

    private void AnhXa() {
        toolbar=findViewById(R.id.toolbarTrangchu);
        tabLayout=findViewById(R.id.tabs);
        viewPager=findViewById(R.id.viewpager);
        drawerLayout=findViewById(R.id.drawerlayout);
        expandableListView=findViewById(R.id.epMenu);
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.menu_trangchu,menu);
        this.menu=menu;

        accessToken=logicXuLyMenu.LayTokenNguoiDungFacebook();

        if(accessToken!=null){
            GraphRequest graphRequest=GraphRequest.newMeRequest(accessToken, new GraphRequest.GraphJSONObjectCallback() {
                @Override
                public void onCompleted(JSONObject object, GraphResponse response) {
                    try {
                        tennguoidung=object.getString("name");
                        MenuItem menuItem=menu.findItem(R.id.itDangNhap);
                        menuItem.setTitle(tennguoidung);
                        Log.d("token",tennguoidung);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });

            Bundle parameter=new Bundle();
            parameter.putString("fields","name");
            graphRequest.setParameters(parameter);
            graphRequest.executeAsync();
        }

        String tennv = modelDangNhap.LayCachedDangNhap(this);
        if(!tennv.equals("")){
            MenuItem menuItem=menu.findItem(R.id.itDangNhap);
            menuItem.setTitle(tennv);
        }

        if(accessToken!=null || !tennv.equals("")){
            MenuItem menuDangXuat = menu.findItem(R.id.itDangXuat);
            menuDangXuat.setVisible(true);
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)){
            return true;
        }

        int id = item.getItemId();
        switch (id){
            case R.id.itDangNhap:
                if(accessToken==null && modelDangNhap.LayCachedDangNhap(this).equals("")){
                    Intent iDangNhap = new Intent(this, DangNhapActivity.class);
                    startActivity(iDangNhap);
                };
                break;
            case R.id.itDangXuat:
                if(accessToken!=null){
                    LoginManager.getInstance().logOut();
                    this.menu.clear();
                    this.onCreateOptionsMenu(this.menu);
                }

                if(!modelDangNhap.LayCachedDangNhap(this).equals("")){
                    modelDangNhap.CapNhatCachedDangNhap(this,"");
                    this.menu.clear();
                    this.onCreateOptionsMenu(this.menu);
                }

                break;
        }
        return true;
    }

    @Override
    public void HienThiDanhSachMenu(List<LoaiSanPham> loaiSanPhamList) {
        ExpandAdater expandAdater=new ExpandAdater(this,loaiSanPhamList);
        expandableListView.setAdapter(expandAdater);
        expandAdater.notifyDataSetChanged();

    }
}
