package com.example.signup.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.signup.R;

public class IntroActivity extends AppCompatActivity {

    ImageView img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img4=findViewById(R.id.imageView4);

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);


    }
}