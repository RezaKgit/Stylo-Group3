package com.belajar.stylo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class ForgetPassword extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);

        final Button btnForgot = findViewById(R.id.btn_forgot);
        final ImageButton btnBack = findViewById(R.id.icon_back);

        // Check Login
        btnForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Email Terkirim!", Toast.LENGTH_LONG).show();
                    AlertDialog.Builder builder = new AlertDialog.Builder(ForgetPassword.this);
                    builder.setMessage("Silahkan cek Email Anda, untuk Reset Password").setNegativeButton("Ok", null).create().show();

                }
        });

        // button Back
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ForgetPassword.this, LoginActivity.class);
                startActivity(myIntent);
            }
        });
    }
}