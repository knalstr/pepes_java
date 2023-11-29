package com.kanaya.pepes1.Rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static final String BASE_URL = "http://192.168.0.114/pepes_andro/";

    //BUAT LOGIN
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static final int ALERT_DIALOG_CLOSE = 10;
    public static final int ALERT_DIALOG_DELETE = 20;


    //FORM PLIS BERHASIL AAMIIN
//    public static final String URL_GET_LANGGAR = BASE_URL + "Pelanggaran/ReadData.php";
//    public static final String URL_ADD_LANGGAR = BASE_URL + "Pelanggaran/CreateData.php";
//    public static final String URL_GET_DATA_LANGGAR = BASE_URL + "Pelanggaran/DataLanggar.php?idpelanggar=";
//
//    public static final String KEY_ID_LANGGAR="idpelanggar";
//    public static final String KEY_NAMA="namasiswa";
//    public static final String KEY_TINGKAT="tingkat";
//    public static final String KEY_JURUSAN="jurusan";
//    public static final String KEY_ROMBEL="rombel";
//    public static final String KEY_JENIS="keterangan";
//    public static final String KEY_POIN="point";
//    public static final String KEY_TANGGAL="tanggal";
//
//    public static final String TAG_JSON_ARRAY="result";
//    public static final String TAG_ID_LANGGAR="idpelanggar";
//    public static final String TAG_NAMA="namasiswa";
//    public static final String TAG_TINGKAT="tingkat";
//    public static final String TAG_JURUSAN="jurusan";
//    public static final String TAG_ROMBEL="rombel";
//    public static final String TAG_JENIS="keterangan";
//    public static final String TAG_POIN="point";
//    public static final String TAG_TANGGAL="tanggal";
}