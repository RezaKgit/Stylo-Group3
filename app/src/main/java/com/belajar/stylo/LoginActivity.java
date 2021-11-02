package com.belajar.stylo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInputEditText username = findViewById(R.id.inputEmailLogin);
        TextInputEditText password = findViewById(R.id.inputPassword);

        final Button login = findViewById(R.id.btnSignIn);
        final Button register = findViewById(R.id.btnJoinUs);
        final TextView forgotPassword = findViewById(R.id.textForgetPassword);

        // Check Login
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = Objects.requireNonNull(username.getText()).toString();
                String passwordKey = Objects.requireNonNull(password.getText()).toString();

                if (usernameKey.equals("stylo") && passwordKey.equals("group3")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, HomePageActivity.class);
                    LoginActivity.this.startActivity(intent);
                    finish();
                } else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Username atau Password Anda salah!")
                            .setNegativeButton("Coba lagi", null).create().show();
                }
            }

        });

        // Register
         register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(myIntent);
            }
        });

        // Forgot Password
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this, ForgetPassword.class);
                startActivity(myIntent);
            }
        });

    }
}