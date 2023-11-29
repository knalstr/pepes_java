package com.kanaya.pepes1.Rest;


import com.kanaya.pepes1.Model.GetNotesPelanggar;
import com.kanaya.pepes1.Model.Loginn;
import com.kanaya.pepes1.Model.PostPutDelNotes;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("Login.php")
    Call<Loginn> loginResponse(
      @Field("username") String username,
      @Field("password") String password);

    @GET("ReadData.php")
    Call<GetNotesPelanggar> getNotesPelanggar(@Query("idpelanggar") String idpelanggar);

    @GET("ReadData.php")
    Call<GetNotesPelanggar> getNotesByNama(@Query("idpelanggar") String idpelanggar,
                                           @Query("namasiswa") String namasiswa);

    @Multipart
    @POST("ReadData.php")
    Call<PostPutDelNotes> postNotesPelanggar(@Query("idpelanggar") String idpelanggar,
                                             @Part("namasiswa") RequestBody namasiswa,
                                             @Part("tingkat") RequestBody tingkat
    );

}
