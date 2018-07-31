package com.example.vinhtruong.lazada.View.DangNhap_DangKy.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vinhtruong.lazada.Model.DangNhap_DangKy.ModelDangNhap;
import com.example.vinhtruong.lazada.R;
import com.example.vinhtruong.lazada.View.TrangChu.TrangChuActivity;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

import java.util.Arrays;

/**
 * Created by vinhtruong on 6/8/2018.
 */

public class FragmentDangNhap extends Fragment implements View.OnClickListener{
    private Button btnDangNhap;
    ModelDangNhap modelDangNhap;
    EditText edtTenDangNhap, edtMatkhauDN;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dangnhap,container,false);

        modelDangNhap=new ModelDangNhap();

        btnDangNhap=view.findViewById(R.id.btnDangNhap);
        edtTenDangNhap=view.findViewById(R.id.edDiaChiEmailDangNhap);
        edtMatkhauDN=view.findViewById(R.id.edMatKhauDangNhap);

        btnDangNhap.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        int id =view.getId();
        switch (id){
            case R.id.btnDangNhap:
                String tendangnhap=edtTenDangNhap.getText().toString().trim();
                String matkhau=edtMatkhauDN.getText().toString().trim();
                boolean kiemtra = modelDangNhap.KiemTraDangNhap(getActivity(),tendangnhap,matkhau);
                if(kiemtra){
                    Intent iTrangChu = new Intent(getActivity(), TrangChuActivity.class);
                    iTrangChu.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(iTrangChu);
                    getActivity().finish();
                }else{
                    Toast.makeText(getActivity(), "Email hoặc mật khẩu không đúng!", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
