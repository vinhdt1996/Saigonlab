package com.example.vinhtruong.lazada.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.vinhtruong.lazada.Model.ObjectClass.LoaiSanPham;
import com.example.vinhtruong.lazada.Model.TrangChu.XuLyMenu.XuLyJSONMenu;
import com.example.vinhtruong.lazada.R;

import java.util.List;

/**
 * Created by vinhtruong on 6/7/2018.
 */

public class ExpandAdater extends BaseExpandableListAdapter {

    Context context;
    List<LoaiSanPham> loaiSanPhams;
    ViewHolderMenu viewHolderMenu;

    public ExpandAdater(Context context, List<LoaiSanPham> loaiSanPhams) {
        this.context = context;
        this.loaiSanPhams = loaiSanPhams;

        XuLyJSONMenu xuLyJSONMenu=new XuLyJSONMenu();
        int count=loaiSanPhams.size();
        for(int i=0;i<count;i++){
            int maloaisp=loaiSanPhams.get(i).getMALOAISP();
            loaiSanPhams.get(i).setListCon(xuLyJSONMenu.LayLoaiSanPhamTheoMaLoai(maloaisp));
        }
    }

    @Override
    public int getGroupCount() {
        return loaiSanPhams.size();
    }

    @Override
    public int getChildrenCount(int viTriGroupCha) {
        if(loaiSanPhams.get(viTriGroupCha).getListCon().size()!=0){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public Object getGroup(int viTriGroupCha) {
        return loaiSanPhams.get(viTriGroupCha);
    }

    @Override
    public Object getChild(int viTriGroupCha, int viTriGroupCon) {
        return loaiSanPhams.get(viTriGroupCha).getListCon().get(viTriGroupCon);
    }

    @Override
    public long getGroupId(int viTriGroupCha) {
        return loaiSanPhams.get(viTriGroupCha).getMALOAISP();
    }

    @Override
    public long getChildId(int viTriGroupCha, int viTriGroupCon) {
        return loaiSanPhams.get(viTriGroupCha).getListCon().get(viTriGroupCon).getMALOAISP();
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    public class ViewHolderMenu{
        TextView txtTenLoaiSP;
        ImageView imageView;
    }

    @Override
    public View getGroupView(final int viTriGroupCha, boolean isExpanded, View view, ViewGroup viewGroup) {

        View viewGroupCha = view;
        if(viewGroupCha==null){
             viewHolderMenu=new ViewHolderMenu();
            LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            viewGroupCha=layoutInflater.inflate(R.layout.custom_layout_group_cha,viewGroup,false);

             viewHolderMenu.txtTenLoaiSP=viewGroupCha.findViewById(R.id.txtTenLoaiSp);
             viewHolderMenu.imageView=viewGroupCha.findViewById(R.id.imgMenuPlus);

             viewGroupCha.setTag(viewHolderMenu);
        }else{
             viewHolderMenu= (ViewHolderMenu) viewGroupCha.getTag();
        }

        viewHolderMenu.txtTenLoaiSP.setText(loaiSanPhams.get(viTriGroupCha).getTENLOAISP());

        int demspcon = loaiSanPhams.get(viTriGroupCha).getListCon().size();
//Kiểm tra con
        if(demspcon>0){
            viewHolderMenu.imageView.setVisibility(View.VISIBLE);
        }else{
            viewHolderMenu.imageView.setVisibility(View.INVISIBLE);
        }
//Set cộng trừ
        if(isExpanded){
            viewHolderMenu.imageView.setImageResource(R.drawable.ic_remove_black_24dp);
            viewGroupCha.setBackgroundResource(R.color.colorGray);
        }else{
            viewHolderMenu.imageView.setImageResource(R.drawable.ic_add_black_24dp);
            viewGroupCha.setBackgroundResource(R.color.colorWhite);
        }
//
        viewGroupCha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d("loaisp",loaiSanPhams.get(viTriGroupCha).getTENLOAISP()+"-"
                        +loaiSanPhams.get(viTriGroupCha).getMALOAISP());
                return false;
            }
        });

        return viewGroupCha;
    }

    @Override
    public View getChildView(int viTriGroupCha, int viTriGroupCon, boolean isExpanded, View view, ViewGroup viewGroup) {
//        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View viewGroupCon=layoutInflater.inflate(R.layout.custom_layout_group_con,viewGroup,false);
//
//        ExpandableListView expandableListView=viewGroupCon.findViewById(R.id.epMenuCon);
        SecondExpandable secondExpandable=new SecondExpandable(context);
        ExpandAdater secondAdapter=new ExpandAdater(context,loaiSanPhams.get(viTriGroupCha).getListCon());
        secondExpandable.setAdapter(secondAdapter);

        secondExpandable.setGroupIndicator(null);
        notifyDataSetChanged();

        return secondExpandable;
    }

    public class SecondExpandable extends ExpandableListView{

        public SecondExpandable(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            WindowManager windowManager= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
            Display display=windowManager.getDefaultDisplay();
            Point size = new Point();
            display.getSize(size);

            int width =size.x;
            int height =size.y;
            Log.d("size",width+"-"+height);

//            widthMeasureSpec=MeasureSpec.makeMeasureSpec(width,MeasureSpec.AT_MOST);
            heightMeasureSpec=MeasureSpec.makeMeasureSpec(height,MeasureSpec.AT_MOST);
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }



    //=================================SECOND=======================

//    public class SecondAdapter extends BaseExpandableListAdapter{
//
//        List<LoaiSanPham> listCon;
//
//        public SecondAdapter(List<LoaiSanPham> listCon) {
//            this.listCon = listCon;
//
//            XuLyJSONMenu xuLyJSONMenu=new XuLyJSONMenu();
//            int count=listCon.size();
//            for(int i=0;i<count;i++){
//                int maloaisp=listCon.get(i).getMALOAISP();
//                listCon.get(i).setListCon(xuLyJSONMenu.LayLoaiSanPhamTheoMaLoai(maloaisp));
//            }
//        }
//        @Override
//        public int getGroupCount() {
//            return listCon.size();
//        }
//
//        @Override
//        public int getChildrenCount(int viTriGroupCha) {
//            return listCon.get(viTriGroupCha).getListCon().size();
//        }
//
//        @Override
//        public Object getGroup(int viTriGroupCha) {
//            return listCon.get(viTriGroupCha);
//        }
//
//        @Override
//        public Object getChild(int viTriGroupCha, int viTriGroupCon) {
//            return listCon.get(viTriGroupCha).getListCon().get(viTriGroupCon);
//        }
//
//        @Override
//        public long getGroupId(int viTriGroupCha) {
//            return listCon.get(viTriGroupCha).getMALOAISP();
//        }
//
//        @Override
//        public long getChildId(int viTriGroupCha, int viTriGroupCon) {
//            return listCon.get(viTriGroupCha).getListCon().get(viTriGroupCon).getMALOAISP();
//        }
//
//        @Override
//        public boolean hasStableIds() {
//            return false;
//        }
//
//        @Override
//        public View getGroupView(int viTriGroupCha, boolean isExpanded, View view, ViewGroup viewGroup) {
//            LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            View viewGroupCha=layoutInflater.inflate(R.layout.custom_layout_group_cha,viewGroup,false);
//            TextView txtTenLoaiSP=viewGroupCha.findViewById(R.id.txtTenLoaiSp);
//            txtTenLoaiSP.setText(listCon.get(viTriGroupCha).getTENLOAISP());
//            return viewGroupCha;
//        }
//
//        @Override
//        public View getChildView(int viTriGroupCha, int viTriGroupCon, boolean isExpanded, View view, ViewGroup viewGroup) {
//            TextView tv = new TextView(context);
//            tv.setText(listCon.get(viTriGroupCha).getListCon().get(viTriGroupCon).getTENLOAISP());
//            tv.setPadding(15,5,5,5);
//            tv.setLayoutParams(new ListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
//            return tv;
//        }
//
//        @Override
//        public boolean isChildSelectable(int i, int i1) {
//            return false;
//        }
//    }

}
