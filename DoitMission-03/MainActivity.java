package com.example.doitmission_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    ScrollView scrollView;
    ScrollView scrollView2;
    ImageView imageView;
    ImageView imageView2;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView=findViewById(R.id.scrollView);
        scrollView2=findViewById(R.id.scrollView2);
        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        scrollView.setHorizontalScrollBarEnabled(true);
        scrollView2.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap=(BitmapDrawable)res.getDrawable(R.drawable.image01);
        int bitmapWidth=bitmap.getIntrinsicWidth();
        int bitmapHeight=bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width=bitmapWidth;
        imageView.getLayoutParams().height=bitmapHeight;

        imageView2.setImageDrawable(bitmap);
        imageView2.getLayoutParams().width=bitmapWidth;
        imageView2.getLayoutParams().height=bitmapHeight;
    }

    public void onButton1Clicked(View v) {upper();}
    public void onButton2Clicked(View v) {lower();};

    private void upper(){
        imageView.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
    }
    private void lower(){
        imageView.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.VISIBLE);

    }
}