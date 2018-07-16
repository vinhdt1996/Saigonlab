package com.example.vinhtruong.lazada.Adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vinhtruong.lazada.Model.ObjectClass.DienTu;
import com.example.vinhtruong.lazada.R;

import java.util.List;

/**
 * Created by vinhtruong on 6/9/2018.
 */

public class AdapterDienTu extends RecyclerView.Adapter<AdapterDienTu.ViewHolderDienTu> {

    Context context;
    List<DienTu> dienTuList;

    public AdapterDienTu(Context context, List<DienTu> dienTuList) {
        this.context = context;
        this.dienTuList = dienTuList;
    }

    public class ViewHolderDienTu extends RecyclerView.ViewHolder {
        ImageView imgHinhKhuyenMaiDienTu;
        RecyclerView recyclerViewThuongHieuLon, recyclerViewTopSanPham;
        TextView txtTieuDeSanPhamNoiBat, txtTopSanPhamNoiBat;
        public ViewHolderDienTu(View itemView) {
            super(itemView);
            recyclerViewThuongHieuLon=itemView.findViewById(R.id.recyclerThuongHieuLon);
            recyclerViewTopSanPham=itemView.findViewById(R.id.recyclerTopDienThoaiMayTinhBang);
            imgHinhKhuyenMaiDienTu=itemView.findViewById(R.id.imKhuyenMaiDienTu);
            txtTopSanPhamNoiBat=itemView.findViewById(R.id.txtTenTopSanPhamNoiBat);
            txtTieuDeSanPhamNoiBat=itemView.findViewById(R.id.txtTenSanPhamNoiBat);
        }
    }
    @Override
    public ViewHolderDienTu onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.custom_dientu,parent,false);
        ViewHolderDienTu viewHolderDienTu=new ViewHolderDienTu(view);
        return viewHolderDienTu;
    }

    @Override
    public void onBindViewHolder(ViewHolderDienTu holder, int position) {
        DienTu dienTu=dienTuList.get(position);

        holder.txtTieuDeSanPhamNoiBat.setText(dienTu.getTennoibat().toString());
        holder.txtTopSanPhamNoiBat.setText(dienTu.getTentopnoibat().toString());

        //Hiển thị sanh sách thương hiệu lớn (Recycler Thuong hiệu lớn)
        AdapterThuongHieuLon adapterThuongHieuLon=new AdapterThuongHieuLon(context,dienTu.getThuongHieus(),dienTu.isThuonghieu());

        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(context,3,GridLayoutManager.HORIZONTAL,false);
        holder.recyclerViewThuongHieuLon.setLayoutManager(layoutManager);
        holder.recyclerViewThuongHieuLon.setAdapter(adapterThuongHieuLon);
        adapterThuongHieuLon.notifyDataSetChanged();

        //Hiển thị sanh sách top sản phẩm (Recycler top sản phẩm)
        AdapterTopDienThoaiDienTu adapterTopDienThoaiDienTu=new AdapterTopDienThoaiDienTu(context,R.layout.custom_topdienthoaivamaytinhbang,dienTu.getSanPhams());

        RecyclerView.LayoutManager layoutManagerTop = new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
        holder.recyclerViewTopSanPham.setLayoutManager(layoutManagerTop);
        holder.recyclerViewTopSanPham.setAdapter(adapterTopDienThoaiDienTu);
        adapterTopDienThoaiDienTu.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return dienTuList.size();
    }


}
