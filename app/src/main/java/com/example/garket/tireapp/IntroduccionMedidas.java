package com.example.garket.tireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class IntroduccionMedidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduccion_medidas);

        Button buttonBusquedaManual = (Button) findViewById(R.id.buttonBusquedaManual);
        buttonBusquedaManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BusquedaManual.class);
                startActivityForResult(intent, 0);
            }
        });

        Button buttonScanRFIDIntroduccionMedidas = (Button) findViewById(R.id.buttonScanRFIDIntroduccionMedidas);
        buttonScanRFIDIntroduccionMedidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ScanRFIDIntroduccionMedidas.class);
                startActivityForResult(intent, 0);
            }
        });

        Button buttonVolverIntroduccionMedidas = (Button) findViewById(R.id.buttonVolverIntroduccionMedidas);
        buttonVolverIntroduccionMedidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MenuPrincipal.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}
