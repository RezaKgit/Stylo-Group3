package com.belajar.stylo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewPager mSLideViewPager;
    LinearLayout mDotLayout;

    TextView[] dots;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSLideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.indicator_layout);

        viewPagerAdapter = new ViewPagerAdapter(this);

        mSLideViewPager.setAdapter(viewPagerAdapter);

        setUpindicator(0);
        mSLideViewPager.addOnPageChangeListener(viewListener);

        /*
        getStarted = findViewById(R.id.getbtn);
        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Testing:","test....");
                //v.getContext().startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                //startActivity(new Intent(getApplicationContext(), LoginActivity.class));

                //finish();

            }
        });
        */


    }

    public void btnLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void setUpindicator(int position){

        dots = new TextView[3];
        mDotLayout.removeAllViews();

        for (int i = 0 ; i < dots.length ; i++){

            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(R.color.inactive));
            mDotLayout.addView(dots[i]);

        }

        dots[position].setTextColor(getResources().getColor(R.color.active));

    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            setUpindicator(position);
//            Log.i("dots", String.valueOf(position));
//            if (position == dots.length - 1){
//                getbtn.setVisibility(View.VISIBLE);
//            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

//    private int getitem(int i){
//
//        return mSLideViewPager.getCurrentItem() + i;
//    }

}