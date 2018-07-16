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

import com.example.vinhtruong.lazada.Adapter.AdapterNoiBat;
import com.example.vinhtruong.lazada.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vinhtruong on 6/7/2018.
 */

public class FragmentNoiBat extends Fragment {
    RecyclerView recyclerView;
    AdapterNoiBat adapterNoiBat;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_noibat,container,false);

        recyclerView=view.findViewById(R.id.recyclerNoiBat);
        List<String> dulieu =new ArrayList<>();

        for(int i=0;i<20;i++){
            String ten ="Nổi bật "+i;
            dulieu.add(ten);
        }
        //RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity());
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(getActivity(),3);
        adapterNoiBat=new AdapterNoiBat(getActivity(),dulieu);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterNoiBat);
        adapterNoiBat.notifyDataSetChanged();

        return view;
    }
}
