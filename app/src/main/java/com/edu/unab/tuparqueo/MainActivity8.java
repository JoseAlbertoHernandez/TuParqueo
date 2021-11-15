package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }

    public void operadores (View view) {

        Intent operador = new Intent(this,MainActivity5.class);
        startActivity(operador);
    }
    public void planes (View view) {

        Intent planes = new Intent(this,MainActivity6.class);
        startActivity(planes);
    }

    public void salir (View view) {

        Intent salida = new Intent(this,MainActivity7.class);
        startActivity(salida);
    }

}