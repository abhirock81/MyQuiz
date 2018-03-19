package com.example.a1605417.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Play extends AppCompatActivity {
    Intent intent;
    Questions questions=new Questions();
    TextView msqueno;
    Button option1;
    Button option2;
    Button option3;
    Button option4;
    Button exit;
    TextView msco;
    TextView mquestion;
    int mscore=0;
    String manswer;
    Random random=new Random();
    int c=1;
     int a;
     int l=0;
    ArrayList<Integer> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
         list=new ArrayList<Integer>();
        int i;
        for(i=0;i<4;i++)
          list.add(i);
        Collections.shuffle(list);
         a=list.get(l);
            msco=(TextView)findViewById(R.id.z);
        msqueno=(TextView)findViewById(R.id.qasd);
        mquestion=(TextView)findViewById(R.id.a);
        option1=(Button)findViewById(R.id.q);
        option2=(Button)findViewById(R.id.w);
        option3=(Button)findViewById(R.id.e);
        option4=(Button)findViewById(R.id.r);
        exit=(Button)findViewById(R.id.rt);
        mquestion.setText(questions.mquestion(a));
        option1.setText(questions.moption1(a));
        option2.setText(questions.moption2(a));
        option3.setText(questions.moption3(a));
        option4.setText(questions.moption4(a));
        manswer=questions.getanswer(a);

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(option1.getText()==manswer)
                {mscore=mscore+1;
                    myscore();
                    Toast.makeText(getApplicationContext(), "correct answer", Toast.LENGTH_SHORT).show();
                    updateque();
                }
                else{
                    Toast.makeText(getApplicationContext(), "incorrect answer", Toast.LENGTH_SHORT).show();
                    updateque();}
            }
    });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 if(option2.getText()==manswer)
                {mscore=mscore+1;
                    myscore();
                    Toast.makeText(getApplicationContext(), "correct answer", Toast.LENGTH_SHORT).show();
                    updateque();
                }
                else{
                    Toast.makeText(getApplicationContext(), "incorrect answer", Toast.LENGTH_SHORT).show();
                    updateque();}
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(option3.getText()==manswer)
                    {
                        mscore=mscore+1;
                        myscore();
                        Toast.makeText(getApplicationContext(), "correct answer", Toast.LENGTH_SHORT).show();
                        updateque();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "incorrect answer", Toast.LENGTH_SHORT).show();
                        updateque();}
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(option4.getText()==manswer)
                    {
                        mscore=mscore+1;
                        myscore();
                        Toast.makeText(getApplicationContext(), "correct answer", Toast.LENGTH_SHORT).show();
                        updateque();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "incorrect answer", Toast.LENGTH_SHORT).show();
                        updateque();}
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                intent = new Intent(Play.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
    public void myscore()
    {
        msco.setText(""+(mscore*10));
    }
    public void updateque()
    {
        if(c>3)
        {
            if(mscore<=2)
            {
            Intent i=new Intent(Play.this,Score1.class);
            i.putExtra("numer",""+(mscore*10));
            i.putExtra("numers",""+(mscore));
            startActivity(i);}
            else
            {
                Intent i1=new Intent(Play.this,Score.class);
                i1.putExtra("numer",""+(mscore*10));
                i1.putExtra("numers",""+(mscore));
                startActivity(i1);

            }
        }
        else{
            c++;
            l++;
            a=list.get(l);
            msqueno.setText("0"+c);
            mquestion.setText(questions.mquestion(a));
            option1.setText(questions.moption1(a));
            option2.setText(questions.moption2(a));
            option3.setText(questions.moption3(a));
            option4.setText(questions.moption4(a));
            manswer=questions.getanswer(a);}


    }
}
