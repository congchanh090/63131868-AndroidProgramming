package com.example.viewpager2recyclerviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder > {

    Context context ;
    ArrayList<LandScape> lstData ;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom  = LayoutInflater.from(context);
        View vItem =cai_bom.inflate(R.layout.item_land , parent,false);
        ItemLandHolder holderCreated = new ItemLandHolder(vItem) ;

        return holderCreated ;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {

        //Lay doi tuong hien thi
        LandScape landScapeHienThi = lstData.get(position) ;
        //trich thong tin
        String caption = landScapeHienThi.getLandCation() ;
        String tenanh = landScapeHienThi.getLandImageFileName() ;
        //dat vao cac trg thong tin cua holder
        holder.tvCaption.setText(caption);
        //dat anh
        String packagename  = holder.itemView.getContext().getPackageName()  ;
        int imageID = holder.itemView.getResources().getIdentifier(tenanh , "mipmap" , packagename);
        holder.ivLandscape.setImageResource(imageID);

    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        TextView tvCaption;
        ImageView ivLandscape ;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCation);
            ivLandscape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //code o day
            int vitriDuocClick  = getAdapterPosition() ;
            LandScape phantuDuocClick = lstData.get(vitriDuocClick)  ;
            // boc thong tin
            String ten = phantuDuocClick.getLandCation() ;
            String tenFile = phantuDuocClick.getLandImageFileName() ;
            //toast ten
            String Chuoithongbao = "Ban vua click vao " + ten ;
            Toast.makeText(v.getContext(),Chuoithongbao , Toast.LENGTH_SHORT).show();

        }
    }
}
