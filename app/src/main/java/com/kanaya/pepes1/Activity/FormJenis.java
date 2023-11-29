package com.kanaya.pepes1.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.kanaya.pepes1.R;

public class FormJenis extends AppCompatActivity {
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_jenis);

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormJenis.this, DataJenis.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), DataJenis.class);
        startActivity(i);
        finish();
    }
}