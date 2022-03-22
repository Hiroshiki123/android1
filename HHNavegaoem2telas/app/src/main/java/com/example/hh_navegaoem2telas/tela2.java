package com.example.hh_navegaoem2telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Intent it2 = getIntent();
        String msg =it2.getStringExtra(MainActivity.TROCA);
        EditText txt2 =(EditText) findViewById(R.id.txt2);
        txt2.setText(msg);
    }
}