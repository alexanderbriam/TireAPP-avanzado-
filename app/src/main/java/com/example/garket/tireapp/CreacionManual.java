package com.example.garket.tireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CreacionManual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacion_manual);

        Button cancelar = (Button) findViewById(R.id.buttonCancelar);
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CreacionNeumatico.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    public void Agregar(View v){
        Toast toast = Toast.makeText(this, "Se guardó exitosamente", Toast.LENGTH_LONG);
        toast.show();
    }
}
