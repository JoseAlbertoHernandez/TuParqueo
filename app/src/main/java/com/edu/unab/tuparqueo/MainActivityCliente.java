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

public class MainActivityCliente extends AppCompatActivity {
    private EditText edtxCedCliente,edtxNomCliente,edtxApeCliente,edtxCorreoCliente,edtxContraseña;
    private Button btnRegCliente,btnCancelCliente;

FirebaseFirestore firestore = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cliente);

    edtxCedCliente = findViewById(R.id.edtxCedCliente);
    edtxNomCliente = findViewById(R.id.edtxNomCliente);
    edtxApeCliente = findViewById(R.id.edtxApeCliente);
    edtxCorreoCliente = findViewById(R.id.edtxCorreoCliente);
    edtxContraseña = findViewById(R.id.edtxContraCliente);

    btnRegCliente = findViewById(R.id.btnRegCliente);
    btnCancelCliente = findViewById(R.id.btnCancelCliente);

    btnRegCliente.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });

    btnCancelCliente.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cancelar();
        }
    });
    }

    private void registrar() {
        Map<String,Object>cliente = new HashMap<>();
        cliente.put("nombre",edtxNomCliente.getText().toString());
        cliente.put("apellido",edtxApeCliente.getText().toString());
        cliente.put("correo",edtxCorreoCliente.getText().toString());
        cliente.put("contraseña",edtxContraseña.getText().toString());
        firestore.collection("Clientes").document(edtxCedCliente.getText().toString()).set(cliente);
    }

    private void cancelar () {
        Intent cancelar = new Intent(this, MainActivityInicio.class);
        startActivity(cancelar);

    }
}