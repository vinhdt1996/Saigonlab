package com.example.vinhtruong.lazada.View.DangNhap_DangKy.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.example.vinhtruong.lazada.Model.ObjectClass.NhanVien;
import com.example.vinhtruong.lazada.Presenter.DangKy.PresenterLogicDangKy;
import com.example.vinhtruong.lazada.R;
import com.example.vinhtruong.lazada.View.DangNhap_DangKy.ViewDangKy;

/**
 * Created by vinhtruong on 6/8/2018.
 */

public class FragmentDangKy extends Fragment implements ViewDangKy, View.OnClickListener, View.OnFocusChangeListener{
    PresenterLogicDangKy presenterLogicDangKy;
    View view;
    Boolean kiemTraThongTin = false;
    //Layout
    Button btnDangKy;
    EditText edHoTen,edEmail , edMatKhau, edNhapLaiMatKhau;
    SwitchCompat sEmailDocQuyen;
    TextInputLayout inputEdMatKhauDk, inputEdNhapLaiMatKhauDK, inputEdHoten, inputEdEmail;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view=inflater.inflate(R.layout.fragment_dangky,container,false);
        //Ánh xạ
        AnhXa();

        presenterLogicDangKy=new PresenterLogicDangKy(this);

        btnDangKy.setOnClickListener(this);
        edHoTen.setOnFocusChangeListener(this);
        edMatKhau.setOnFocusChangeListener(this);
        edNhapLaiMatKhau.setOnFocusChangeListener(this);
        edEmail.setOnFocusChangeListener(this);

        return view;
    }

    private void AnhXa() {
        btnDangKy=view.findViewById(R.id.btnDangKy);
        edHoTen=view.findViewById(R.id.edHoTenDK);
        edMatKhau=view.findViewById(R.id.edMatKhauDK);
        edNhapLaiMatKhau=view.findViewById(R.id.edNhapLaiMatKhauDK);
        sEmailDocQuyen=view.findViewById(R.id.sEmailDocQuyen);
        inputEdMatKhauDk=view.findViewById(R.id.input_edMatKhauDK);
        inputEdNhapLaiMatKhauDK=view.findViewById(R.id.input_edNhapLaiMatKhauDK);
        edEmail=view.findViewById(R.id.edDiaChiEmailDK);
        inputEdHoten=view.findViewById(R.id.input_edHoTenDK);
        inputEdEmail=view.findViewById(R.id.input_edDiaChiEmailDK);
    }

    @Override
    public void DangKyThanhCong() {
        Toast.makeText(getActivity(), "Đăng ký thành công", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void DangKyThatBai() {
        Toast.makeText(getActivity(), "Đăng ký thất bại", Toast.LENGTH_SHORT).show();
    }

    String emaildocquyen="";
    @Override
    public void onClick(View view) {
        String hoten =edHoTen.getText().toString();
        String email =edEmail.getText().toString();
        String matkhau =edMatKhau.getText().toString();
        String nhaplaimatkhau =edNhapLaiMatKhau.getText().toString();

        sEmailDocQuyen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                emaildocquyen=b+"";
            }
        });

        if(kiemTraThongTin){
            NhanVien nhanVien=new NhanVien();
            nhanVien.setTenNV(hoten);
            nhanVien.setTenDN(email);
            nhanVien.setMatKhau(matkhau);
            nhanVien.setEmailDocQuyen(emaildocquyen);
            nhanVien.setMaLoaiNV(2);

            presenterLogicDangKy.ThucHienDangKy(nhanVien);
        }else{
            Log.d("kiemtra","Dang ky that bai");
        }
    }

    @Override
    public void onFocusChange(View view, boolean b) {
        int id=view.getId();
        switch (id){
            case R.id.edHoTenDK:
                if(!b){
                    String chuoi = ((EditText)view).getText().toString();
                    if(chuoi.trim().equals("") || chuoi.equals(null)){
                        inputEdHoten.setErrorEnabled(true);
                        inputEdHoten.setError("Vui lòng điền mục này");
                        kiemTraThongTin=false;
                    }else{
                        inputEdHoten.setErrorEnabled(false);
                        inputEdHoten.setError("");
                        kiemTraThongTin=true;
                    }
                }
                break;
            case R.id.edDiaChiEmailDK:
                if(!b){

                    String chuoi = ((EditText)view).getText().toString();


                    if(chuoi.trim().equals("") || chuoi.equals(null)){
                        inputEdEmail.setErrorEnabled(true);
                        inputEdEmail.setError("Vui lòng điền mục này.");
                        kiemTraThongTin=false;
                    }else{
                        Boolean kiemTraEmail = Patterns.EMAIL_ADDRESS.matcher(chuoi).matches();
                        if(!kiemTraEmail){
                            inputEdEmail.setErrorEnabled(true);
                            inputEdEmail.setError("Email không hợp lệ!");
                            kiemTraThongTin=false;
                        }else{
                            inputEdEmail.setErrorEnabled(false);
                            inputEdEmail.setError("");
                            kiemTraThongTin=true;
                        }
                    }
                }
                break;
            case R.id.edMatKhauDK:
                if(!b){
                    String chuoi = ((EditText)view).getText().toString();
                    if(chuoi.trim().equals("") || chuoi.equals(null)){
                        inputEdMatKhauDk.setErrorEnabled(true);
                        inputEdMatKhauDk.setError("Vui lòng điền mục này");
                        kiemTraThongTin=false;
                    }else{
                        inputEdMatKhauDk.setErrorEnabled(false);
                        inputEdMatKhauDk.setError("");
                        kiemTraThongTin=true;
                    }
                }
                break;
            case R.id.edNhapLaiMatKhauDK:
                if(!b){
                    String chuoi = ((EditText)view).getText().toString();
                    String matkhau = edMatKhau.getText().toString();

                    if(!chuoi.equals(matkhau)){
                        inputEdNhapLaiMatKhauDK.setErrorEnabled(true);
                        inputEdNhapLaiMatKhauDK.setError("Mật khẩu không trùng khớp!!");
                        kiemTraThongTin=false;
                    }else{
                        inputEdNhapLaiMatKhauDK.setErrorEnabled(false);
                        inputEdNhapLaiMatKhauDK.setError("");
                        kiemTraThongTin=true;
                    }
                }
                break;
        }
    }
}
