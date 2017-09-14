package com.blogbasbas.crudsederhana.api;

import com.blogbasbas.crudsederhana.model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
/**
 * Created by Server on 13/09/2017.
 */

public interface RestApi {
    //inser
    @FormUrlEncoded
    @POST("insert.php")
    Call<ResponseModel> sendBiodata(@Field("nama") String nama,
                                    @Field("usia") String usia,
                                    @Field("domisili") String domisili);

    //read
    @GET("read.php")
    Call<ResponseModel> getBiodata();

    //update menggunakan 3 parameter
    @FormUrlEncoded
    @POST("update.php")
    Call<ResponseModel> updateData( @Field("id") String id,
                                   @Field("nama") String nama,
                                   @Field("usia") String usia,
                                   @Field("domisili") String domisili);
    //delete menggunakan parameter id
    @FormUrlEncoded
    @POST("delete.php")
    Call<ResponseModel> deleteData(@Field("id") String id);
}
