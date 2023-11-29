package com.kanaya.pepes1.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.kanaya.pepes1.R;

public class DataJurusan extends AppCompatActivity {

    ImageView back, home, tambah;
    private RecyclerView listjurusan;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_jurusan);

        listjurusan = (RecyclerView) findViewById(R.id.listjurusan);
        mLayoutManager = new LinearLayoutManager(this);
        listjurusan.setLayoutManager(mLayoutManager);
        home = findViewById(R.id.home);
        back = findViewById(R.id.back);
        tambah = findViewById(R.id.tambah);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataJurusan.this, FormPelanggar.class);
                startActivity(intent);
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataJurusan.this, Beranda.class);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataJurusan.this, Beranda.class);
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