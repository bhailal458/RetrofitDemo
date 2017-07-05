package com.example.sparken02.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sparken02 on 27/6/17.
 */

public interface WebApiCall {
    @GET("song/all")
    Call<SongModel>repoContributors();
}
