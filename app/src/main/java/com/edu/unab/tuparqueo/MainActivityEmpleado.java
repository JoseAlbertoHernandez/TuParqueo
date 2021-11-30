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

public class MainActivityEmpleado extends AppCompatActivity {

    private EditText edtxCedEmpleado,edtxNomEmpleado,edtxApeEmpleado,edtxCargo,edtxDirEmpleado,
            edtxTelEmpleado,edtxCorreoEmpleado;
    private Button btnRegEmp,btnConsulEmp,btnEditEmp,btnElimEmp;

FirebaseFirestore firestore = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_empleado);

        edtxCedEmpleado = findViewById(R.id.edtxCedEmpleado);
        edtxNomEmpleado = findViewById(R.id.edtxNomEmpleado);
        edtxApeEmpleado = findViewById(R.id.edtxApeEmpleado);
        edtxCargo = findViewById(R.id.edtxCargo);
        edtxDirEmpleado = findViewById(R.id.edtxDirEmpleado);
        edtxTelEmpleado = findViewById(R.id.edtxTelEmpleado);
        edtxCorreoEmpleado = findViewById(R.id.edtxCorreoEmpleado);

        btnRegEmp = findViewById(R.id.btnRegEmp);
        btnEditEmp = findViewById(R.id.btnEditEmp);
        btnConsulEmp = findViewById(R.id.btnConsulEmp);
        btnElimEmp = findViewById(R.id.btnElimEmp);

        btnRegEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrar();

            }
        });

        btnEditEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editar();

            }
        });

        btnConsulEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consultar();

            }
        });

        btnElimEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eliminar();

            }
        });

    }

    private void registrar() {

        Map<String,Object> empleado = new HashMap<>();
        empleado.put("nomEmpleado",edtxNomEmpleado.getText().toString());
        empleado.put("apeEmpleado",edtxApeEmpleado.getText().toString());
        empleado.put("cargo",edtxCargo.getText().toString());
        empleado.put("dirEmpleado",edtxDirEmpleado.getText().toString());
        empleado.put("telEmpleado",edtxTelEmpleado.getText().toString());
        empleado.put("correoEmpleado",edtxCorreoEmpleado.getText().toString());

        firestore.collection("Empleado").document(edtxCedEmpleado.getText().toString()).set(empleado);

    }

    private void editar() {

        Map<String,Object> empleado = new HashMap<>();
        empleado.put("nomEmpleado",edtxNomEmpleado.getText().toString());
        empleado.put("apeEmpleado",edtxApeEmpleado.getText().toString());
        empleado.put("cargo",edtxCargo.getText().toString());
        empleado.put("dirEmpleado",edtxDirEmpleado.getText().toString());
        empleado.put("telEmpleado",edtxTelEmpleado.getText().toString());
        empleado.put("correoEmpleado",edtxCorreoEmpleado.getText().toString());

        firestore.collection("Empleado").document(edtxCedEmpleado.getText().toString()).update(empleado);

    }

    private void eliminar() {

        firestore.collection("Empleado").document(edtxCedEmpleado.getText().toString()).delete();
    }

    private void consultar(){

        startActivity(new Intent(MainActivityEmpleado.this,MostrarDatosEmpleadoActivity.class));
    }




}