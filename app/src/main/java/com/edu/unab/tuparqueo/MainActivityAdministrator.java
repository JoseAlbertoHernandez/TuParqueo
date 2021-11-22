package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityAdministrator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator);
    }

    public void parqueadero (View view) {

        Intent parqueadero = new Intent(this,MainActivityParqueadero.class);
        startActivity(parqueadero);
    }

    public void empleado (View view){

        Intent empleado = new Intent(this, MainActivityEmpleado.class);
        startActivity(empleado);
    }

    public void planes (View view) {

        Intent planes = new Intent(this, MainActivityPlanes.class);
        startActivity(planes);
    }

    public void zona (View view) {

        Intent zona = new Intent(this, MainActivityZona.class);
        startActivity(zona);
    }

    public void salir (View view) {

        Intent salida = new Intent(this,MainActivity7.class);
        startActivity(salida);
    }

}