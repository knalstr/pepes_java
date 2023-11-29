package com.kanaya.pepes1.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kanaya.pepes1.Model.Loginn;
import com.kanaya.pepes1.R;
import com.kanaya.pepes1.Rest.ApiClient;
import com.kanaya.pepes1.Rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity implements View.OnClickListener{

    EditText username, password;
    Button login;
    String user, pass;
    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login    = findViewById(R.id.login);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                user = username.getText().toString();
                pass = password.getText().toString();
                LogIn(user,pass);

                break;
        }
    }

    private void LogIn(String user, String pass) {

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Loginn> loginnCall = apiInterface.loginResponse(user,pass);
        loginnCall.enqueue(new Callback<Loginn>() {
            @Override
            public void onResponse(Call<Loginn> call, Response<Loginn> response) {
                if(response.body() != null && response.isSuccessful() && response.body().isStatus()) {
                    Toast.makeText(Login.this, response.body().getData().getUsername(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, Beranda.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Loginn> call, Throwable t) {
                Toast.makeText(Login.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}