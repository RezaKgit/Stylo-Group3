package com.belajar.stylo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class HomePageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        final Button btnPopular = findViewById(R.id.btn_popular);
        final Button btnTips = findViewById(R.id.btn_tips);
        final ImageView item1 = findViewById(R.id.itemHome);


        btnPopular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomePageActivity.this, PopularActivity.class);
                startActivity(myIntent);
            }
        });

        btnTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomePageActivity.this, TipsAndTricksActivity.class);
                startActivity(myIntent);
            }
        });

        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(HomePageActivity.this, DescriptionActivity.class);
                startActivity(myIntent);
            }
        });

    }
}
