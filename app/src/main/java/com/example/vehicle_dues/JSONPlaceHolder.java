package com.example.vehicle_dues;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceHolder {
  @GET("posts")
    Call<List<Post>>getPost();
}
