package com.example.week2022_04_04;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pd= new ProgressDialog(MainActivity.this);

        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.setMessage(" one minute :) ");
        pd.setIndeterminate(true);
        pd.setCancelable(true);


    }


    public void myClick(View v){
        pd.show();




    }
}