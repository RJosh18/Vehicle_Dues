package com.example.vehicle_dues;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class cv6 extends AppCompatActivity {
    private ImageView imgCam;
    private Button btnCam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv6);
        imgCam=findViewById(R.id.imgCam);
        Button btnCam=findViewById(R.id.btnCam);

        btnCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open_camera= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(open_camera,100);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

               Bitmap img= (Bitmap) (data.getExtras().get("data"));
                imgCam.setImageBitmap(img);

            }
        }

