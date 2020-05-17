package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;

public class Walkthrough extends AppCompatActivity {
    private ViewPager mslideViewpager;
    private LinearLayout mlineaLayout;
    private SliderAdapter sliderAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);
        mslideViewpager = (ViewPager) findViewById(R.id.pager1);
        mlineaLayout=(LinearLayout) findViewById(R.id.linearwalk);
        sliderAdapter = new SliderAdapter(this);
        mslideViewpager.setAdapter(sliderAdapter);
    }
}
