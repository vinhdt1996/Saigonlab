package com.example.vinhtruong.lazada.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vinhtruong.lazada.R;

import java.util.List;

/**
 * Created by vinhtruong on 6/9/2018.
 */

public class AdapterNoiBat extends RecyclerView.Adapter<AdapterNoiBat.ViewHolder> {

    Context context;
    List<String> stringList;

    public AdapterNoiBat(Context context, List<String> stringList) {
        this.context = context;
        this.stringList = stringList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.txtNoiBat);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.custom_noibat,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }


}
