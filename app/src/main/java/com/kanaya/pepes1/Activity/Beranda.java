package com.kanaya.pepes1.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.kanaya.pepes1.R;

public class Beranda extends AppCompatActivity {

    LinearLayout jenis, pelanggaran, jurusan;
    ImageView tambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        jenis = findViewById(R.id.jenis);
        pelanggaran = findViewById(R.id.datapelanggaran);
        jurusan = findViewById(R.id.jurusan);
        tambah = findViewById(R.id.tambah);

        pelanggaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent datalanggar = new Intent(Beranda.this, DataPelanggaran.class);
                startActivity(datalanggar);
                finish();
            }
        });

        jurusan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent datajurusan = new Intent(Beranda.this, DataJurusan.class);
                startActivity(datajurusan);
                finish();
            }
        });

        jenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jenis = new Intent(Beranda.this, DataJenis.class);
                startActivity(jenis);
                finish();
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tambah = new Intent(Beranda.this, FormPelanggar.class);
                startActivity(tambah);
                finish();
            }
        });
    }
}