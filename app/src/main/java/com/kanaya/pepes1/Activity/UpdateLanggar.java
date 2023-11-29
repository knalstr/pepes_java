package com.kanaya.pepes1.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.kanaya.pepes1.R;
import com.kanaya.pepes1.Rest.ApiClient;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UpdateLanggar extends AppCompatActivity {

    private String idpelanggar;

    //editext
    private EditText namasiswa;

    //radio tingkat
    private RadioGroup tingkat;
    private RadioButton sepuluh, sebelas, duabelas;
    private String Tingkat = "" ;

    //spinner jurusan, rombel, jenis dan point
    private Spinner jurusan, rombel, jenis, point;

    //tanggal
    private TextView simpan;
    private SimpleDateFormat dateFormat;
    private Calendar calendar;
    private TextView dateTimeDisplay = null;
    private String date;

    //back
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_langgar);


    }
}