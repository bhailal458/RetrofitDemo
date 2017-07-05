package com.example.sparken02.retrofitdemo;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by sparken02 on 27/6/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    private Context mContext;
    private LayoutInflater inflater;
    private ArrayList<SongModel.DataBean> myArrayList;

    public MyAdapter(Context mContext, ArrayList<SongModel.DataBean> myArrayList) {
        this.mContext = mContext;
        this.myArrayList = myArrayList;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        MyHolder myholder = new MyHolder(view);
        return myholder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        SongModel.DataBean modelobj = myArrayList.get(position);
        holder.txtid.setText("ID: "+String.valueOf(modelobj.getId()));
        holder.txtpath.setText("Path: "+modelobj.getSong_path());
        holder.txtcreateTime.setText("Created Date&Time:"+modelobj.getCreated_at());
        holder.txtupdateTime.setText("Updated Date&Time:"+modelobj.getUpdated_at());
        Picasso.with(mContext).load(modelobj.getImages()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return myArrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        private TextView txtid,txtpath,txtcreateTime,txtupdateTime;
        private ImageView imageView;

        public MyHolder(View view) {
            super(view);
            txtid = (TextView) view.findViewById(R.id.txtid);
            txtpath = (TextView)view.findViewById(R.id.txtpath);
            txtcreateTime = (TextView) view.findViewById(R.id.txtcreateTime);
            txtupdateTime = (TextView) view.findViewById(R.id.txtupdateTime);
            imageView = (ImageView) view.findViewById(R.id.imageView);

        }
    }
}
