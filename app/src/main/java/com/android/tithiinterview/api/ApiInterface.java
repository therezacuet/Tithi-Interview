package com.android.tithiinterview.api;


import com.android.tithiinterview.model.ChildModel;
import com.android.tithiinterview.model.Country;

public interface ApiInterface {

    @GET(HttpParams.LOGIN_ENDPOINT)
    Call<Country> getCountry();

    @GET(HttpParams.LOGIN_ENDPOINT)
    Call<ChildModel> getDiv(@Path("id"),int id);

    @GET(HttpParams.LOGIN_ENDPOINT)
    Call<ChildModel> getDiv(@Path("id"),int id);

    @FormUrlEncoded
    @POST(HttpParams.LOGIN_ENDPOINT)
    Call<ChildModel> getDiv(@Filed("id"),int id);

    @GET(HttpParams.LOGIN_ENDPOINT)
    Call<ChildModel> getDis(@Path("id"),int id);

    @FormUrlEncoded
    @POST(HttpParams.LOGIN_ENDPOINT)
    Call<ChildModel> getDis(@Filed("id"),int id);

    @GET(HttpParams.LOGIN_ENDPOINT)
    Call<ChildModel> getUpz(@Path("id"),int id);

    @FormUrlEncoded
    @POST(HttpParams.LOGIN_ENDPOINT)
    Call<ChildModel> getUpz(@Filed("id"),int id);




}
