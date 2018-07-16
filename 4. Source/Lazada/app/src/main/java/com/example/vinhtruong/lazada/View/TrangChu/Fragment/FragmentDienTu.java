package com.example.vinhtruong.lazada.View.TrangChu.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vinhtruong.lazada.Adapter.AdapterDienTu;
import com.example.vinhtruong.lazada.Adapter.AdapterThuongHieuLonDienTu;
import com.example.vinhtruong.lazada.Adapter.AdapterTopDienThoaiDienTu;
import com.example.vinhtruong.lazada.Model.ObjectClass.DienTu;
import com.example.vinhtruong.lazada.Model.ObjectClass.SanPham;
import com.example.vinhtruong.lazada.Model.ObjectClass.ThuongHieu;
import com.example.vinhtruong.lazada.Presenter.TrangChu_DienTu.PresenterLogicDienTu;
import com.example.vinhtruong.lazada.R;
import com.example.vinhtruong.lazada.View.TrangChu.ViewDienTu;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by vinhtruong on 6/7/2018.
 */

public class FragmentDienTu extends Fragment implements ViewDienTu{
    RecyclerView recyclerView, recyclerTopCacThuongHieuLon, recyclerHangMoiVe;
    List<DienTu> dienTuList;
    PresenterLogicDienTu presenterLogicDienTu;
    ImageView imgSanPham1, imgSanPham2, imgSanPham3;
    TextView txtSanPham1, txtSanPham2, txtSanPham3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dientu,container,false);

        imgSanPham1=view.findViewById(R.id.imSanPham1);
        imgSanPham2=view.findViewById(R.id.imSanPham2);
        imgSanPham3=view.findViewById(R.id.imSanPham3);
        txtSanPham1=view.findViewById(R.id.txtSanPham1);
        txtSanPham2=view.findViewById(R.id.txtSanPham2);
        txtSanPham3=view.findViewById(R.id.txtSanPham3);
        recyclerTopCacThuongHieuLon=view.findViewById(R.id.recylerTopCacThuongHieuLon);
        recyclerHangMoiVe=view.findViewById(R.id.recylerHangMoiVe);
        recyclerView=view.findViewById(R.id.recyclerDienTu);
        dienTuList=new ArrayList<>();

        presenterLogicDienTu=new PresenterLogicDienTu(this);
        presenterLogicDienTu.LayDanhSachDienTu();
        presenterLogicDienTu.LayDanhSachLogoThuongHieu();
        presenterLogicDienTu.LayDanhSachSanPhamMoi();

        return view;
    }

    @Override
    public void HienThiDanhSach(List<DienTu> dienTus) {

        dienTuList=dienTus;

        AdapterDienTu adapterDienTu=new AdapterDienTu(getContext(),dienTuList);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterDienTu);
        adapterDienTu.notifyDataSetChanged();

    }

    @Override
    public void HienThiLogoThuongHieu(List<ThuongHieu> thuongHieus) {
        AdapterThuongHieuLonDienTu adapterThuongHieuLonDienTu=new AdapterThuongHieuLonDienTu(getContext(),thuongHieus);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getContext(),2,GridLayoutManager.HORIZONTAL,false);
        recyclerTopCacThuongHieuLon.setLayoutManager(layoutManager);
        recyclerTopCacThuongHieuLon.setAdapter(adapterThuongHieuLonDienTu);
        adapterThuongHieuLonDienTu.notifyDataSetChanged();
    }

    @Override
    public void LoiLayDuLieu() {

    }

    @Override
    public void HienThiSanPhamMoiVe(List<SanPham> sanPhams) {
        AdapterTopDienThoaiDienTu adapterTopDienThoaiDienTu=new AdapterTopDienThoaiDienTu(getContext(),R.layout.custom_topdienthoaivamaytinhbang,sanPhams);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerHangMoiVe.setLayoutManager(layoutManager);
        recyclerHangMoiVe.setAdapter(adapterTopDienThoaiDienTu);
        adapterTopDienThoaiDienTu.notifyDataSetChanged();

        Random random=new Random();

        int vitri1 = random.nextInt(sanPhams.size());
        SanPham sanPham1=sanPhams.get(vitri1);
        Picasso.get().load(sanPham1.getANHLON()).fit().centerInside().into(imgSanPham1);
        txtSanPham1.setText(sanPham1.getTENSP());

        int vitri2 = random.nextInt(sanPhams.size());
        SanPham sanPham2=sanPhams.get(vitri2);
        Picasso.get().load(sanPham2.getANHLON()).fit().centerInside().into(imgSanPham2);
        txtSanPham2.setText(sanPham2.getTENSP());

        int vitri3 = random.nextInt(sanPhams.size());
        SanPham sanPham3=sanPhams.get(vitri3);
        Picasso.get().load(sanPham3.getANHLON()).fit().centerInside().into(imgSanPham3);
        txtSanPham3.setText(sanPham3.getTENSP());
    }
}
