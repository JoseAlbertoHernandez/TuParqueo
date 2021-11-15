package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void aceptar (View view) {
        Intent aceptar = new Intent(this,MainActivity2.class);
        startActivity(aceptar);

    }

    public void cancelar (View view) {
        Intent cancelar = new Intent(this,MainActivity2.class);
        startActivity(cancelar);

    }
}