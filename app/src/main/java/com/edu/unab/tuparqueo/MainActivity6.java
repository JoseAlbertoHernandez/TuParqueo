package com.edu.unab.tuparqueo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void guardarPlan (View view) {

        Intent guardarPlan = new Intent(this, MainActivityAdministrator.class);
        startActivity(guardarPlan);
    }

    public void cancelPlan (View view) {

        Intent cancelPlan = new Intent(this, MainActivityAdministrator.class);
        startActivity(cancelPlan);
    }
}