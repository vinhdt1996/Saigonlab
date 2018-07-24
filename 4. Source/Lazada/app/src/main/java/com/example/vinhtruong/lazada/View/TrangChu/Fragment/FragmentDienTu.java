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
    RecyclerView recyclerView;
    List<DienTu> dienTuList;
    PresenterLogicDienTu presenterLogicDienTu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dientu,container,false);



        recyclerView=view.findViewById(R.id.recyclerDienTu);
        dienTuList=new ArrayList<>();

        presenterLogicDienTu=new PresenterLogicDienTu(this);
        presenterLogicDienTu.LayDanhSachDienTu();


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
}
