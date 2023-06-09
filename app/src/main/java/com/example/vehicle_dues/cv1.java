package com.example.vehicle_dues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class cv1 extends AppCompatActivity {

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv1);


        tvResult=findViewById(R.id.tvResult);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JSONPlaceHolder jsonPlaceholder = retrofit.create(JSONPlaceHolder.class);


            Call<List<Post>> call = jsonPlaceholder.getPost();

        call.enqueue(new Callback<List<Post>>()

            {
                @Override
                public void onResponse
                (Call < List < Post >> call, Response < List < Post >> response){

                if (!response.isSuccessful()) {
                    tvResult.setText("Code:" + response.code());
                    return;
                }
                List<Post> posts = response.body();

                for (Post post : posts) {
                    String content = "";
                    content += "ID: " + post.getId() + "\n";
                    content += "userID" + post.getUserId() + "\n";
                    content += "Title: " + post.getTitle() + "\n";
                    content += "Body" + post.getBody() + "\n\n";

                    tvResult.append(content);
                }
            }


            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

                tvResult.setText(t.getMessage());

            }
        });
    }
}