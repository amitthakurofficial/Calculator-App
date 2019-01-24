package com.example.thakurshab.calculator_try;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button[] btn=new Button[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       btn[0] = findViewById(R.id.add);
        btn[1] = findViewById(R.id.sub);
        btn[2] = findViewById(R.id.mul);
        btn[3] = findViewById(R.id.div);

        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1=findViewById(R.id.first_number);
                EditText et2=findViewById(R.id.Second_Number);
                String str1=et1.getText().toString();
                String str2=et2.getText().toString();

                int a=Integer.parseInt(str1);
                int b=Integer.parseInt(str2);
                Toast.makeText(getApplicationContext(), String.valueOf(a+b), Toast.LENGTH_SHORT).show();
            }
        });

        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1=findViewById(R.id.first_number);
                EditText et2=findViewById(R.id.Second_Number);
                String str1=et1.getText().toString();
                String str2=et2.getText().toString();

                int a=Integer.parseInt(str1);
                int b=Integer.parseInt(str2);
                Toast.makeText(getApplicationContext(), String.valueOf(a-b), Toast.LENGTH_SHORT).show();


            }
        });

        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1=findViewById(R.id.first_number);
                EditText et2=findViewById(R.id.Second_Number);
                String str1=et1.getText().toString();
                String str2=et2.getText().toString();

                int a=Integer.parseInt(str1);
                int b=Integer.parseInt(str2);
                Toast.makeText(getApplicationContext(), String.valueOf(a*b), Toast.LENGTH_SHORT).show();


            }
        });

        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1=findViewById(R.id.first_number);
                EditText et2=findViewById(R.id.Second_Number);
                String str1=et1.getText().toString();
                String str2=et2.getText().toString();

                int a=Integer.parseInt(str1);
                int b=Integer.parseInt(str2);
                Toast.makeText(getApplicationContext(), String.valueOf(a/b), Toast.LENGTH_SHORT).show();


    }
       });
    }
}
