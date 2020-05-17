package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context= context;
    }
    public int[] slider_images={
            R.drawable.slider1+ R.drawable.slider2 + R.drawable.slider3

    };
    public String[] slider_desc={
            "Keep Track of important vital signs quickly asses your health, and communicate with your medical team."+
                    "Keep Track of important vital signs quickly asses your health, and communicate with your medical team."+
                    "Keep Track of important vital signs quickly asses your health, and communicate with your medical team."

    };
    public String[] slider_headings={
            "1"+"2"+"3"

    };
    @Override
    public int getCount() {

        return slider_desc.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view ==(RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
       LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
       View view= layoutInflater.inflate(R.layout.slide, container, false);
        ImageView slideImage =(ImageView) view.findViewById(R.id.imageView);
        TextView slideheading =(TextView) view.findViewById(R.id.tViewheader);
        TextView slideDesc = (TextView) view.findViewById(R.id.tView_desc);
        slideImage.setImageResource(slider_images[position]);
        slideheading.setText(slider_headings[position]);
        slideDesc.setText(slider_desc[position]);

        container.addView(view);

       return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout)object);
    }
}
