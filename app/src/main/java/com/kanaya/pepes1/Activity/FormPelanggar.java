package com.kanaya.pepes1.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.kanaya.pepes1.Model.PostPutDelNotes;
import com.kanaya.pepes1.Rest.ApiClient;
import com.kanaya.pepes1.R;
import com.kanaya.pepes1.Rest.ApiInterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FormPelanggar extends AppCompatActivity{

    Button btnsubmit;
    EditText namasiswa;
    ImageView back;

    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pelanggar);

        namasiswa = findViewById(R.id.namasiswa);
        back = findViewById(R.id.back);
        btnsubmit = findViewById(R.id.btn_submit);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveData();
            }

        private void saveData(){
            final String date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
            Call<PostPutDelNotes> postHerosCall = apiInterface.postNotesPelanggar("insert_pelanggarnotes",
                    RequestBody.create(MediaType.parse("text/plain"), namasiswa.getText().toString()),
                    RequestBody.create(MediaType.parse("text/plain"), date));

            postHerosCall.enqueue(new Callback<PostPutDelNotes>() {
                @Override
                public void onResponse(Call<PostPutDelNotes> call, Response<PostPutDelNotes> response) {
                    Toast.makeText(getApplicationContext(), "Berhasil Menambahkan Data", Toast.LENGTH_LONG).show();
                    Intent beranda = new Intent(FormPelanggar.this, Beranda.class);
                    startActivity(beranda);
                    finish();
                }

                @Override
                public void onFailure(Call<PostPutDelNotes> call, Throwable t) {
                    Log.d("RETRO", "ON FAILURE : " + t.getMessage());
                    Log.d("RETRO", "ON FAILURE : " + t.getCause());
                    Toast.makeText(getApplicationContext(), "Error, entry data", Toast.LENGTH_LONG).show();
                }
            });
        }});

    }

//    //editext
//    private EditText namasiswa;
//
//    //radio tingkat
//    private RadioGroup tingkat;
//    private RadioButton sepuluh, sebelas, duabelas;
//    private String Tingkat = "" ;
//
//    //spinner jurusan, rombel, jenis dan point
//    private Spinner jurusan, rombel, jenis, point;
//
//    //tanggal
//    private TextView simpan;
//    private SimpleDateFormat dateFormat;
//    private Calendar calendar;
//    private TextView dateTimeDisplay = null;
//    private String date;
//
//    //back
//    private ImageView back;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_form_pelanggar);
//        //untuk button kembali
//        back = findViewById(R.id.back);
//
//        back.setOnClickListener((View v) -> {
//            Intent a = new Intent(FormPelanggar.this, Beranda.class);
//            startActivity(a);
//        });
//
//        //untuk edit nama dan kondisi
//        namasiswa = findViewById(R.id.namasiswa);
//
//        //untuk tingkat
//        tingkat = findViewById(R.id.tingkat);
//        sepuluh = findViewById(R.id.sepuluh);
//        sebelas = findViewById(R.id.sebelas);
//        duabelas= findViewById(R.id.duabelas);
//
//        tingkat.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                switch (i) {
//                    case R.id.sepuluh:
//                        Tingkat = "X";
//                        break;
//                    case R.id.sebelas:
//                        Tingkat = "XI";
//                        break;
//                    case R.id.duabelas:
//                        Tingkat = "XII";
//                        break;
//                    default:
//                        Tingkat = "";
//                        break;
//                }
//            }
//        });
//
//        //spinner jurusan, rombel, jenis dan point
//        jurusan = findViewById(R.id.jurusan);
//        rombel = findViewById(R.id.rombel);
//        jenis = findViewById(R.id.jenis);
//        point = findViewById(R.id.point);
//
//        String[] value = {"RPL","TEI","SIJA","TOI","IOP","MEKA","TEK","TPTUP","PSPT"};
//        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(value));
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.spinner,arrayList);
//        jurusan.setAdapter(arrayAdapter);
//
//        String[] value2 = {"A","B","C"};
//        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(value2));
//        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this,R.layout.spinner,arrayList2);
//        rombel.setAdapter(arrayAdapter2);
//
//        String[] value3 = {"Mabal", "Bullying"};
//        ArrayList<String> arrayList3 = new ArrayList<>(Arrays.asList(value3));
//        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>(this,R.layout.spinner,arrayList3);
//        jenis.setAdapter(arrayAdapter3);
//
//        String[] value4 = {"5", "10", "15"};
//        ArrayList<String> arrayList4 = new ArrayList<>(Arrays.asList(value4));
//        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<>(this,R.layout.spinner,arrayList4);
//        point.setAdapter(arrayAdapter4);
//
//        //edit tanggal
//        dateTimeDisplay = (TextView)findViewById(R.id.tanggal);
//        calendar = Calendar.getInstance();
//
//        dateFormat = new SimpleDateFormat("MM-dd-yyyy");
//        date = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(new Date());
//        dateTimeDisplay.setText(date);
//
//        //simpan
//        simpan = findViewById(R.id.btn_submit);
//        simpan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final String nama = namasiswa.getText().toString().trim();
//                final String jurusn = jurusan.getSelectedItem().toString();
//                final String rom = rombel.getSelectedItem().toString();
//                final String keterangan = jenis.getSelectedItem().toString().trim();
//                final String poin = point.getSelectedItem().toString().trim();
//                final String tanggal = dateTimeDisplay.getText().toString().trim();
//
//                class AddDataLanggar extends AsyncTask<Void, Void, String> {
//
//                    ProgressDialog loading;
//
//                    @Override
//                    protected void onPreExecute() {
//                        super.onPreExecute();
//                        loading = ProgressDialog.show(FormPelanggar.this,
//                                "Menambahkan...", "Tunggu...", false, false);
//
//                        Intent intent = new Intent(FormPelanggar.this, DataPelanggaran.class);
//                        startActivity(intent);
//                    }
//
//                    @Override
//                    protected void onPostExecute(String s) {
//                        super.onPostExecute(s);
//                        loading.dismiss();
//                        Toast.makeText(FormPelanggar.this, s,Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    protected String doInBackground(Void... v) {
//                        HashMap<String, String> params = new HashMap<>();
//                        params.put(ApiClient.KEY_NAMA, nama);
//                        params.put(ApiClient.KEY_TINGKAT, Tingkat);
//                        params.put(ApiClient.KEY_JURUSAN, jurusn);
//                        params.put(ApiClient.KEY_ROMBEL, rom);
//                        params.put(ApiClient.KEY_JENIS, keterangan);
//                        params.put(ApiClient.KEY_POIN, poin);
//                        params.put(ApiClient.KEY_TANGGAL, tanggal);
//
//                        RequestHandler rh = new RequestHandler();
//                        String res = rh.sendPostRequest(ApiClient.URL_ADD_LANGGAR, params);
//                        return res;
//                    }
//                }
//
//                AddDataLanggar ae = new AddDataLanggar();
//                ae.execute();
//            }
//        });
//    }
//
//    public void onBackPressed() {
//        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
//        alertDialogBuilder.setMessage("Buang Perubahan?");
//
//        alertDialogBuilder.setPositiveButton("Ya",
//                new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface arg0, int arg1) {
//                        Intent i = new Intent(getApplicationContext(), Beranda.class);
//                        startActivity(i);
//                        finish();
//                    }
//                });
//
//        alertDialogBuilder.setNegativeButton("Tidak",
//                new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface arg0, int arg1) {
//
//                    }
//                });
//
//        AlertDialog alertDialog = alertDialogBuilder.create();
//        alertDialog.show();
//    }

}