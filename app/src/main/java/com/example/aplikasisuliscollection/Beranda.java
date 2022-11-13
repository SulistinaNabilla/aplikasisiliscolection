package com.example.aplikasisuliscollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Beranda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
    }

    public void profil(View view) {
        Intent intent = new Intent(Beranda.this,Profil.class);
        startActivity(intent);
    }

}