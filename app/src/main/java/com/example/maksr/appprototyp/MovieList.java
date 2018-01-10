package com.example.maksr.appprototyp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class MovieList extends AppCompatActivity {

    Toast t;
    ListView results;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        results =(ListView)findViewById(R.id.results);
        t.makeText(this,"Results",Toast.LENGTH_LONG).show();




            }



       








    }


