package com.example.love_hateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String[] love_images = {"@drawable/l3","@drawable/l2","@drawable/l4","@drawable/l1"};
    String[] hate_images = {"@drawable/h3","@drawable/h2","@drawable/h4","@drawable/h1"};
    ImageView love_img= (ImageView) findViewById(R.id.love_image);
    ImageView hate_img= (ImageView) findViewById(R.id.hate_image);
    Resources res = getResources();
    int i=1,j=1;
    public void love(View view){
        int ResId = res.getIdentifier(love_images[i], "drawable",getPackageName());
        love_img.setImageResource(ResId);
        i++;
        if(i>3)i=0;
    }
    public void hate(View view){
        int ResId = res.getIdentifier(hate_images[j], "drawable",getPackageName());
        hate_img.setImageResource(ResId);
        j++;
        if(j>3)i=0;
    }
}
