package com.example.garket.tireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class CreacionNeumatico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacion_neumatico);

        Button manual = (Button) findViewById(R.id.buttonManual);
        manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CreacionManual.class);
                startActivityForResult(intent, 0);
            }
        });

        Button volver = (Button) findViewById(R.id.buttonVolverNeumatico);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MenuPrincipal.class);
                startActivityForResult(intent, 0);
            }
        });

        Button RFID = (Button) findViewById(R.id.buttonRFID);
        RFID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), ScanRFID.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}
