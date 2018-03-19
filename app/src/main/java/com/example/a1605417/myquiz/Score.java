package com.example.a1605417.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Score extends AppCompatActivity {
    TextView mscore;
    TextView  myans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        mscore=(TextView)findViewById(R.id.zxcv);
        myans=(TextView)findViewById(R.id.cvb);
        Intent intent=getIntent();
        String m=intent.getStringExtra("numer");
        String n=intent.getStringExtra("numers");
        mscore.setText(m);
        myans.setText(n);
    }
}
