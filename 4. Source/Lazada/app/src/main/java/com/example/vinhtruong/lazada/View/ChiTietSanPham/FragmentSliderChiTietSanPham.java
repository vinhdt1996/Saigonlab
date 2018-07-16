package com.example.vinhtruong.lazada.View.ChiTietSanPham;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.vinhtruong.lazada.R;
import com.squareup.picasso.Picasso;

/**
 * Created by vinhtruong on 7/13/2018.
 */

public class FragmentSliderChiTietSanPham extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_slider_chitietsanpham,container,false);

        Bundle bundle=getArguments();
        String linkhinh=bundle.getString("linkhinh");

        ImageView imgView = view.findViewById(R.id.imHinhSlider);

        Picasso.get().load(linkhinh).into(imgView);

        return view;
    }
}
