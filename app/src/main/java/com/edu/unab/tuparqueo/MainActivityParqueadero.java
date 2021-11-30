package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivityParqueadero extends AppCompatActivity {

    private EditText edtxNit,edtxParqueadero,edtxDirPaqueadero,edtxTelParqueadero,edtxCorreoParqueadero;
    private Button btnRegParque,btnConsulParque,btnEditParque,btnElimParque;

    FirebaseFirestore firestore = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admin_parking);

        edtxNit = findViewById(R.id.edtxNit);
        edtxParqueadero = findViewById(R.id.edtxParqueadero);
        edtxDirPaqueadero = findViewById(R.id.edtxDirParqueadero);
        edtxTelParqueadero = findViewById(R.id.edtxTelParqueadero);
        edtxCorreoParqueadero = findViewById(R.id.edtxCorreoParqueadero);

        btnRegParque = findViewById(R.id.btnRegParque);
        btnEditParque = findViewById(R.id.btnEditParque);
        btnConsulParque = findViewById(R.id.btnConsulParque);
        btnElimParque = findViewById(R.id.btnElimParque);

        btnRegParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardar();

            }
        });

        btnEditParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editar();

            }
        });

        btnConsulParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnElimParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eliminar();

            }
        });
    }
    private void guardar(){
        Map<String,Object> parqueadero = new HashMap<>();
        parqueadero.put("parqueadero",edtxParqueadero.getText().toString());
        parqueadero.put("dirParqueadero",edtxDirPaqueadero.getText().toString());
        parqueadero.put("telParqueadero",edtxTelParqueadero.getText().toString());
        parqueadero.put("correoParqueadero",edtxCorreoParqueadero.getText().toString());

        firestore.collection("Parqueadero").document(edtxNit.getText().toString()).set(parqueadero);

    }


    private void editar() {

        Map<String,Object> parqueadero = new HashMap<>();
        parqueadero.put("parqueadero",edtxParqueadero.getText().toString());
        parqueadero.put("dirParqueadero",edtxDirPaqueadero.getText().toString());
        parqueadero.put("telParqueadero",edtxTelParqueadero.getText().toString());
        parqueadero.put("correoParqueadero",edtxCorreoParqueadero.getText().toString());

        firestore.collection("Parqueadero").document(edtxNit.getText().toString()).update(parqueadero);

    }

    private void eliminar() {

        firestore.collection("Parqueadero").document(edtxNit.getText().toString()).delete();
    }



}