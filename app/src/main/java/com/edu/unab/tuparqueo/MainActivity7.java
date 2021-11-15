package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void administrador (View view) {

        Intent admin = new Intent(this,MainActivity8.class);
        startActivity(admin);
    }
    public void operador (View view) {

        Intent operar = new Intent(this, MainActivity4.class);
        startActivity(operar);
    }
    public void usuario (View view) {

        Intent usuario = new Intent(this,MainActivity9.class);
        startActivity(usuario);
    }
    public void salir (View view) {

        Intent salida = new Intent(this, MainActivity2.class);
        startActivity(salida);
    }
}