package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityZona extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_zona);
    }

    public void guardar (View view) {

        Intent guardar = new Intent(this,MainActivityAdministrator.class);
        startActivity(guardar);
    }

    public void cancelar (View view) {

        Intent cancelar = new Intent(this,MainActivityAdministrator.class);
        startActivity(cancelar);
    }
}