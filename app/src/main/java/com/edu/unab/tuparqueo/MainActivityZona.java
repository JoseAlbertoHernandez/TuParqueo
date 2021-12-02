package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivityZona extends AppCompatActivity {
    private EditText edtxZona,edtxCapacidad;
    private Button btnRegZona,btnEditZona,btnConsulZona,btnElimZona;

FirebaseFirestore firestore = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_zona);

        edtxZona = findViewById(R.id.edtxZona);
        edtxCapacidad = findViewById(R.id.edtxCapacidad);

        btnRegZona = findViewById(R.id.btnRegZona);
        btnEditZona = findViewById(R.id.btnEditZona);
        btnConsulZona = findViewById(R.id.btnConsulZona);
        btnElimZona = findViewById(R.id.btnElimZona);

        btnRegZona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnEditZona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnConsulZona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnElimZona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void registrar() {
        Map<String,Object>zona = new HashMap<>();
        zona.put("nombre",edtxZona.getText().toString());
        zona.put("capacidad",edtxCapacidad.getText().toString());
        firestore.collection("Zonas").document(edtxZona.getText().toString()).set(zona);

    }

    private void editar() {
        Map<String,Object>zona = new HashMap<>();
        zona.put("nombre",edtxZona.getText().toString());
        zona.put("capacidad",edtxCapacidad.getText().toString());
        firestore.collection("Zonas").document(edtxZona.getText().toString()).update(zona);

    }

    private void eliminar() {

        firestore.collection("Zonas").document(edtxZona.getText().toString()).delete();

    }
}