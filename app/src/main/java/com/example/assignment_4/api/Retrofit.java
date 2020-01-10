package com.example.assignment_4.api;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {
    private static final String BASE_URL = "http://10.0.2.2:3000/";
    //private static final String IMG_URL = "http://localhost:3000/images/";

    public static String token = "Bearer ";

    public static retrofit2.Retrofit getInstance() {
        retrofit2.Retrofit retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory
                        .create())
                .build();
        return retrofit;
    }
}
