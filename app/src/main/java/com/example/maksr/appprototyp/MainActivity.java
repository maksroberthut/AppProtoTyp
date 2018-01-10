package com.example.maksr.appprototyp;

import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Widget-Deklaration
    TextView txt_f;
    EditText ed_s;
    Button btn_s;
    Spinner spn_c;
    Spinner spn_t;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find by Id
        ed_s = (EditText) findViewById(R.id.ed_s);
        btn_s = (Button) findViewById(R.id.btn_s);
        txt_f = (TextView) findViewById(R.id.txt_f);
        spn_c = (Spinner) findViewById(R.id.spn_city);
        spn_t = (Spinner) findViewById(R.id.spn_time);



        btn_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent results = new Intent(MainActivity.this, MovieList.class);
                startActivity(results);
            }
        });
    }
}






















