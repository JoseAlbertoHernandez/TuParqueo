package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void registro (View view) {
        Intent registrar = new Intent(this,MainActivity3.class);
        startActivity(registrar);

    }

    public void ingreso (View view){
        Intent ingresar = new Intent(this,MainActivity7.class);
        startActivity(ingresar);

    }

}