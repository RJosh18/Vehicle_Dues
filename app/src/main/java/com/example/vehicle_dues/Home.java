package com.example.vehicle_dues;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class Home extends AppCompatActivity implements View.OnClickListener {
    private CardView cv1, cv2, cv3, cv4, cv5, cv6;
    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cv1 = (CardView) findViewById(R.id.cv1);
        cv2 = (CardView) findViewById(R.id.cv2);
        cv3 = (CardView) findViewById(R.id.cv3);
        cv4 = (CardView) findViewById(R.id.cv4);
        cv5 = (CardView) findViewById(R.id.cv5);
        cv6 = (CardView) findViewById(R.id.cv6);


        cv1.setOnClickListener((View.OnClickListener) this);
        cv2.setOnClickListener((View.OnClickListener) this);
        cv3.setOnClickListener((View.OnClickListener) this);
        cv4.setOnClickListener((View.OnClickListener) this);
        cv5.setOnClickListener((View.OnClickListener) this);
        cv6.setOnClickListener((View.OnClickListener) this);
//        cv7.setOnClickListener((View.OnClickListener) this);
//        cv8.setOnClickListener((View.OnClickListener) this);


    }


    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.cv1:
                i = new Intent(this, cv1.class);
                startActivity(i);
                break;
            case R.id.cv2:
                i = new Intent(this, cv2.class);
                startActivity(i);
                break;
            case R.id.cv3:
                i = new Intent(this, cv3.class);
                startActivity(i);
                break;
            case R.id.cv4:
                i = new Intent(this, cv4.class);
                startActivity(i);
                break;
            case R.id.cv5:
                i = new Intent(this, cv5.class);
                startActivity(i);
                break;
            case R.id.cv6:
                i = new Intent(this, cv6.class);
                startActivity(i);
                break;


        }
    }
}