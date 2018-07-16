package com.example.vinhtruong.lazada.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vinhtruong.lazada.Model.ObjectClass.ThuongHieu;
import com.example.vinhtruong.lazada.R;
import com.example.vinhtruong.lazada.View.HienThiSanPhamTheoDanhMuc.HienThiSanPhamTheoDanhMucActivity;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by vinhtruong on 6/9/2018.
 */

public class AdapterThuongHieuLon extends RecyclerView.Adapter<AdapterThuongHieuLon.ViewHolderThuongHieu>{

    Context context;
    List<ThuongHieu> thuongHieus;
    boolean kiemtra;


    public AdapterThuongHieuLon(Context context, List<ThuongHieu> thuongHieus, boolean kiemtra){
        this.context = context;
        this.thuongHieus = thuongHieus;
        this.kiemtra=kiemtra;
    }


    public class ViewHolderThuongHieu extends RecyclerView.ViewHolder {
        TextView txtTieuDeThuongHieu;
        ImageView imHinhThuongHieu;
        ProgressBar progressBar;
        LinearLayout linearLayout;

        public ViewHolderThuongHieu(View itemView) {
            super(itemView);

            txtTieuDeThuongHieu = (TextView) itemView.findViewById(R.id.txtTieuDeThuongHieuLonDienTu);
            imHinhThuongHieu = (ImageView) itemView.findViewById(R.id.imHinhThuongHieuLonDienTu);
            progressBar = (ProgressBar) itemView.findViewById(R.id.progress_bar_download);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.lnthuonghieulon);
        }
    }

    @Override
    public ViewHolderThuongHieu onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_thuonghieulon,parent,false);

        ViewHolderThuongHieu viewHolder = new ViewHolderThuongHieu(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolderThuongHieu holder, int position) {
        final ThuongHieu thuongHieu = thuongHieus.get(position);
        holder.txtTieuDeThuongHieu.setText(thuongHieu.getTENTHUONGHIEU());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHienThiSpTheoDanhMuc=new Intent(context,HienThiSanPhamTheoDanhMucActivity.class);
                intentHienThiSpTheoDanhMuc.putExtra("MALOAI",thuongHieu.getMATHUONGHIEU());
                intentHienThiSpTheoDanhMuc.putExtra("TENLOAI",thuongHieu.getTENTHUONGHIEU());
                intentHienThiSpTheoDanhMuc.putExtra("KIEMTRA",kiemtra);
                context.startActivity(intentHienThiSpTheoDanhMuc);
            }
        });

        Picasso.get().load(thuongHieu.getHINHTHUONGHIEU()).resize(120,120).into(holder.imHinhThuongHieu, new Callback() {
            @Override
            public void onSuccess() {
                holder.progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return thuongHieus.size();
    }


}