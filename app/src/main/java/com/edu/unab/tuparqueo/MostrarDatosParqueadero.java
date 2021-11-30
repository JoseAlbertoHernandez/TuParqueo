package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.edu.unab.tuparqueo.modelo.Empleado;
import com.edu.unab.tuparqueo.modelo.Parqueadero;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class MostrarDatosParqueadero extends AppCompatActivity {

    RecyclerView rv;
    ParqueaderoAdapter adapter;
    FirebaseFirestore firestore = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos_parqueadero);

        rv = findViewById(R.id.rvParqueadero);

        rv.setLayoutManager(new LinearLayoutManager(this));

        Query query = firestore.collection("Parqueadero");

        FirestoreRecyclerOptions<Parqueadero> firestoreRO = new FirestoreRecyclerOptions.Builder<Parqueadero>().setQuery(query,Parqueadero.class).build();

        adapter = new ParqueaderoAdapter(firestoreRO);
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