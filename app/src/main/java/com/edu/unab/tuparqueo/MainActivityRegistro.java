package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registro);
    }

    public void registrarVehi (View view) {

        Intent nuevoVehi = new Intent(this,MainActivity7.class);
        startActivity(nuevoVehi);
    }

    public void cancelVehi (View view) {

        Intent cancelVehi = new Intent(this,MainActivity7.class);
        startActivity(cancelVehi);
    }
}