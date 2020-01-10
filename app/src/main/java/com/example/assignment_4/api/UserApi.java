package com.example.assignment_4.api;

import com.example.assignment_4.model.ApiUser;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class UserApi {
    private Facebook fb = Retrofit.getInstance()
            .create(Facebook.class);
    private boolean isloggedIn = false;

    public boolean userLogin(ApiUser apiUser) {
        Call<ApiUser> userCall = fb.userLogin(apiUser);
        Strict.StrictMode();
        try {
            Response<ApiUser> loginResponse = userCall.execute();
            if (loginResponse.isSuccessful()) {
                isloggedIn = true;
                Retrofit.token += loginResponse.body().getTokens();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isloggedIn;
    }

    public void userReg() {
    }
}
