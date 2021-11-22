package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void registroEmp (View view) {

        Intent nuevoEmp = new Intent(this, MainActivityAdministrator.class);
        startActivity(nuevoEmp);
    }

    public void cancelEmp (View view) {

        Intent cancelEmp = new Intent(this, MainActivityAdministrator.class);
        startActivity(cancelEmp);
    }
}