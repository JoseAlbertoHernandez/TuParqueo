package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.edu.unab.tuparqueo.modelo.Empleado;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class MostrarDatosEmpleadoActivity extends AppCompatActivity {

    RecyclerView rv;
    EmpleadoAdapter adapter;
    FirebaseFirestore firestore = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos_empleado);

        rv = findViewById(R.id.rvEmpleado);

        rv.setLayoutManager(new LinearLayoutManager(this));

        Query query = firestore.collection("Empleado");

        FirestoreRecyclerOptions<Empleado> firestoreRO = new FirestoreRecyclerOptions.Builder<Empleado>().setQuery(query,Empleado.class).build();

        adapter = new EmpleadoAdapter(firestoreRO);
        adapter.notifyDataSetChanged();
        rv.setAdapter(adapter);

    }

    @Override
    protected void onStart(){
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop(){
        super.onStop();
        adapter.stopListening();
    }

}