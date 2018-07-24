package com.example.vinhtruong.lazada.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vinhtruong.lazada.Model.ObjectClass.ChiTietKhuyenMai;
import com.example.vinhtruong.lazada.Model.ObjectClass.SanPham;
import com.example.vinhtruong.lazada.R;
import com.example.vinhtruong.lazada.View.ChiTietSanPham.ChiTietSanPhamActivity;
import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

/**
 * Created by vinhtruong on 6/19/2018.
 */

public class AdapterTopDienThoaiDienTu extends RecyclerView.Adapter<AdapterTopDienThoaiDienTu.ViewHolderTopDienThoai> {

    Context context;
    List<SanPham> sanPhamList;
    int layout;


    public AdapterTopDienThoaiDienTu(Context context,int layout, List<SanPham> sanPhamList){
        this.context = context;
        this.sanPhamList = sanPhamList;
        this.layout=layout;
    }

    public class ViewHolderTopDienThoai extends RecyclerView.ViewHolder {
        ImageView imHinhSanPham;
        TextView txtTenSP,txtGiaTien,txtGiamGia;
        CardView cardView;

        public ViewHolderTopDienThoai(View itemView) {
            super(itemView);

            imHinhSanPham = (ImageView) itemView.findViewById(R.id.imTopDienThoaiDienTu);
            txtTenSP = (TextView) itemView.findViewById(R.id.txtTieuDeTopDienThoaiDienTu);
            txtGiaTien = (TextView) itemView.findViewById(R.id.txtGiaDienTu);
            txtGiamGia = (TextView) itemView.findViewById(R.id.txtGiamGiaDienTu);
            cardView = (CardView) itemView.findViewById(R.id.cardView);
        }
    }

    @Override
    public ViewHolderTopDienThoai onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(layout,parent,false);

        ViewHolderTopDienThoai viewHolderTopDienThoai = new ViewHolderTopDienThoai(view);

        return viewHolderTopDienThoai;
    }

    @Override
    public void onBindViewHolder(ViewHolderTopDienThoai holder, int position) {
        SanPham sanPham = sanPhamList.get(position);
        Log.d("hinhsanpham",sanPham.getANHLON());
        Picasso.get().load(sanPham.getANHLON()).resize(140,140).centerInside().into(holder.imHinhSanPham);
        //Picasso.get().load(R.drawable.x1).resize(140,140).centerInside().into(holder.imHinhSanPham);
        holder.txtTenSP.setText(sanPham.getTENSP());

        ChiTietKhuyenMai chiTietKhuyenMai = sanPham.getChiTietKhuyenMai();
        int giatien = sanPham.getGIA();

        if(chiTietKhuyenMai !=null){
            int phamtramkm = chiTietKhuyenMai.getPHANTRAMKM();

            NumberFormat numberFormat = new DecimalFormat("###,###");
            String gia = numberFormat.format(giatien);
            holder.txtGiamGia.setVisibility(View.VISIBLE);
            holder.txtGiamGia.setPaintFlags(holder.txtGiamGia.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            holder.txtGiamGia.setText(gia + " VNĐ");

            giatien = giatien * phamtramkm/100;


        }

        NumberFormat numberFormat = new DecimalFormat("###,###");
        String gia = numberFormat.format(giatien);
        holder.txtGiaTien.setText(gia + " VNĐ ");
        holder.cardView.setTag(sanPham.getMASP());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iChitietSanPham =new Intent(context, ChiTietSanPhamActivity.class);
                iChitietSanPham.putExtra("masp",(int)v.getTag());
                context.startActivity(iChitietSanPham);
            }
        });

    }

    @Override
    public int getItemCount() {
        return sanPhamList.size();
    }



}