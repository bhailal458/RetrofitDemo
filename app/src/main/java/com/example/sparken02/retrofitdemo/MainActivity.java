package com.example.sparken02.retrofitdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public static Retrofit retrofit;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<SongModel.DataBean> songArrayList;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.addItemDecoration(
                new HorizontalDividerItemDecoration.Builder(this)
                        .color(Color.BLUE)
                        .build());
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
//        mRecyclerView.setOnClickListener(this);
        songArrayList = new ArrayList<>();


        retrofit = new Retrofit.Builder()
                .baseUrl("http://music.sparkenproduct.in/public/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        WebApiCall webApiCall = retrofit.create(WebApiCall.class);
        Call<SongModel> call = webApiCall.repoContributors();
        call.enqueue(new Callback<SongModel>() {
           @Override
            public void onResponse(Call<SongModel> call, Response<SongModel> response) {
               if(response.isSuccessful()){

                   songArrayList.addAll(response.body().getData());
                   mAdapter.notifyDataSetChanged();
               }
               else{
                   Toast.makeText(MainActivity.this, ""+response.errorBody(), Toast.LENGTH_SHORT).show();
               }
           }
            @Override
            public void onFailure(Call<SongModel> call, Throwable t) {
                Log.i("TAG","Error - >"+t.getMessage());
            }
        });
        mAdapter = new MyAdapter(MainActivity.this,songArrayList);
        mRecyclerView.setAdapter(mAdapter);




    }
}
