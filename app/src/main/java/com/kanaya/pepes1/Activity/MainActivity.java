package com.kanaya.pepes1.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.kanaya.pepes1.R;

public class MainActivity extends AppCompatActivity {

    private static int splash_time_out = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent c = new Intent(MainActivity.this, Login.class);
                startActivity(c);
                finish();
            }
        }, splash_time_out);
    }
}