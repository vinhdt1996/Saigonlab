package com.example.vinhtruong.lazada.View.TrangChu.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vinhtruong.lazada.R;

/**
 * Created by vinhtruong on 6/7/2018.
 */

public class FragmentMeVaBe extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_mevabe,container,false);
        return view;
    }
}
