package com.example.assignment_4.api;

import com.example.assignment_4.model.ApiUser;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Facebook {
    @POST("login")
    Call<ApiUser> userLogin(@Body ApiUser apiUser);

    @POST("Signup")
    Call<Void> userRegister(@Body ApiUser apiUser);
}
