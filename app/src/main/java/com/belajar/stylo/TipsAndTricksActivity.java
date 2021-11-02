package com.belajar.stylo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TipsAndTricksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipsandtrick);
        final ImageButton btnBack = findViewById(R.id.icon_back);
        final ImageButton item1 = findViewById(R.id.item1);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(TipsAndTricksActivity.this, HomePageActivity.class);
                startActivity(myIntent);
            }
        });

        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(TipsAndTricksActivity.this, DescriptionActivity.class);
                startActivity(myIntent);
            }
        });

    }
}
