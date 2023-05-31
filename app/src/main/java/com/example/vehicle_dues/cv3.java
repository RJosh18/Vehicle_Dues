package com.example.vehicle_dues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class cv3 extends AppCompatActivity {
     Button suB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv3);

        suB= findViewById(R.id.suB);
        suB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Your form for insurance is submitted",Toast.LENGTH_LONG).show();

            }
        });

    }
}