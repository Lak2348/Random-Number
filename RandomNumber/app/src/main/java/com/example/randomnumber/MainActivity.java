package com.example.randomnumber;
/*
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.button);
        TextView tv = (TextView) findViewById(R.id.textView);
        Random r = new Random();
        Set<Integer> temp = new HashSet<Integer>();

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int n;
                int bound=11
                        ;
                n = r.nextInt(bound);
                while(temp.contains(n) && temp.size() != bound){
                    n = r.nextInt(bound);
                }
                if(temp.size() == bound){
                    tv.setText("All the numbers are completed.");
                }else {
                    temp.add(n);
                    tv.setText(n + "");
                }
            }
        });
    }
}*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import kotlin.collections.UArraySortingKt;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textView);
        Random r= new Random();/*
        int num=r.nextInt(100)+1;
        String random_number=String.valueOf(num);*/
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r= new Random();
                int num=r.nextInt(100)+1;
                String random_number=String.valueOf(num);
                Set<Integer> temp = new HashSet<Integer>();
                textView.setText(random_number);
                int n;
                int bound=11;
                n = r.nextInt(bound);
                while(temp.contains(n) && temp.size() != bound){
                    n = r.nextInt(bound);
                }
                if(temp.size() == bound){
                    textView.setText("All the numbers are completed.");
                }else {
                    temp.add(n);
                    textView.setText(n + "");
                }



            }
        });

    }
}