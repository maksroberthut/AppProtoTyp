package com.example.maksr.appprototyp;

import android.graphics.Movie;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Maksr on 08.01.2018.
 */

public class FileRead {
     private ArrayList<Movie> movies = new ArrayList<>();

     public void loadfile(){
         String line = null;

         try{
             BufferedReader in = new BufferedReader(new FileReader("filmlist.txt"));

             while(in.ready()){
                 if((line = in.readLine())!=null){



                 }
             }
         }catch(FileNotFoundException var4){
             var4.printStackTrace();
         }catch (IOException var5){
             var5.printStackTrace();
         }

     }
}
