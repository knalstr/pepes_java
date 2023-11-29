package com.kanaya.pepes1.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.kanaya.pepes1.FormLanggar.RequestHandler;
import com.kanaya.pepes1.R;
import com.kanaya.pepes1.Rest.ApiClient;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class DataPelanggaran extends AppCompatActivity {

    private RecyclerView listdata;
    private RecyclerView.LayoutManager nLayoutManager;

    EditText search;
    ImageView home, add, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pelanggaran);

        listdata = (RecyclerView) findViewById(R.id.listdata);
        nLayoutManager = new LinearLayoutManager(this);
        listdata.setLayoutManager(nLayoutManager);
        search = findViewById(R.id.search);
        home = findViewById(R.id.home);
        add = findViewById(R.id.tambah);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beranda = new Intent(DataPelanggaran.this, Beranda.class);
                startActivity(beranda);
                finish();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tambah = new Intent(DataPelanggaran.this, FormPelanggar.class);
                startActivity(tambah);
                finish();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beranda1 = new Intent(DataPelanggaran.this, Beranda.class);
                startActivity(beranda1);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), Beranda.class);
        startActivity(i);
        finish();
    }
}