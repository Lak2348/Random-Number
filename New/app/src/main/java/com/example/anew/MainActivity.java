package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button2;
    private TextView tv_view;
    private EditText et_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2= (Button) findViewById(R.id.button2);
        tv_view=(TextView)findViewById(R.id.textView);
        et_view=(EditText) findViewById(R.id.editTextTextPersonName);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent=new Intent(getApplicationContext() , MainActivity2.class);
            startActivity(intent);
            getApplicationContext().startActivity(intent);
            String name = et_view.getText().toString();
            if (name.length()>0){
                tv_view.setText("Hello"+name+"Welcome to GVP");
            }else{
                Toast.makeText(getApplicationContext(),"fill the name",Toast.LENGTH_SHORT).show();
            }
            }
        });


    }
}