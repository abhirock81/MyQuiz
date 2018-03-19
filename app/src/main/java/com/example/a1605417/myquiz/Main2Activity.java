package com.example.a1605417.myquiz;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import extra.HideIt;

public class Main2Activity extends AppCompatActivity {
    AnimationDrawable anim;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        HideIt.hideitt(getWindow());
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView=(ImageView)findViewById(R.id.lv);
                if(imageView==null)throw new AssertionError();
                imageView.setBackgroundResource(R.drawable.anime);
                anim=(AnimationDrawable)imageView.getBackground();
                anim.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                }, 3000);
            }
        },1000);

    }
}
