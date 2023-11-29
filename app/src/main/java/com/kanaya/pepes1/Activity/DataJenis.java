package com.kanaya.pepes1.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.kanaya.pepes1.R;

public class DataJenis extends AppCompatActivity {

    ImageView back, home, tambah;
    Button tambahjenis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_jenis);

        back = findViewById(R.id.back);
        tambahjenis = findViewById(R.id.tambahjenis);
        home = findViewById(R.id.home);
        tambah = findViewById(R.id.tambah);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataJenis.this, Beranda.class);
                startActivity(intent);
                finish();
            }
        });

        tambahjenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataJenis.this, FormJenis.class);
                startActivity(intent);
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataJenis.this, Beranda.class);
                startActivity(intent);
                finish();
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataJenis.this, FormPelanggar.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), Beranda.class);
        startActivity(i);
        finish();
    }
}