package com.edu.unab.tuparqueo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivityInicio extends AppCompatActivity {

    EditText edtxEmail,edtxContraseña;
    Button btnIngresar,btnRegistrar;

FirebaseFirestore firestore = FirebaseFirestore.getInstance();
FirebaseAuth auth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio);

        edtxEmail = findViewById(R.id.edtxEmail);
        edtxContraseña = findViewById(R.id.edtxContraseña);

        btnIngresar = findViewById(R.id.btnIngresar);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtxEmail.getText().toString();
                String contraseña = edtxContraseña.getText().toString();
                registrar(email, contraseña);

            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = edtxEmail.getText().toString();
                String contraseña = edtxContraseña.getText().toString();
                ingresar(email, contraseña);

            }
        });

    }

    private void registrar(final String email, final String contraseña) {

        auth.createUserWithEmailAndPassword(email, contraseña).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    String id = auth.getCurrentUser().getUid();

                    Map<String, Object> datos = new HashMap<>();
                    datos.put("email", email);
                    datos.put("contraseña", contraseña);
                    firestore.collection("Personas").document(id).set(datos).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task1) {
                            if (task1.isSuccessful()) {
                                Toast.makeText(MainActivityInicio.this, "Usuario Registrado", Toast.LENGTH_SHORT).show();

                            } else {
                                Toast.makeText(MainActivityInicio.this, "falla", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }

            }
        });
    }

    private void ingresar(String email, String contraseña){
        auth.signInWithEmailAndPassword(email, contraseña).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()) {
                    Intent intent = new Intent(MainActivityInicio.this, MainActivity9.class);
                    startActivity(intent);
                    finish();
                }
                Toast.makeText(MainActivityInicio.this,"datos incorrectos",Toast.LENGTH_SHORT).show();
            }
        });
        
    }

    @Override
    protected void onStart (){
        super.onStart();

        if (auth.getCurrentUser() != null) {
            Intent inten = new Intent(MainActivityInicio.this,MainActivity9.class);
            startActivity(inten);
            finish();

        }
    }

}