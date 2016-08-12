package com.example.garket.tireapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        Button btn = (Button) findViewById(R.id.buttonCracionNeumatico);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(v.getContext(), CreacionNeumatico.class);
                startActivityForResult(intent, 0);
            }
        });

        Button buttonCreacioncamion = (Button) findViewById(R.id.buttonCreacioncamion);
        buttonCreacioncamion.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick (View v) {
                Intent intent = new Intent(v.getContext(), CreacionCamion.class);
                startActivityForResult(intent, 0);
            }
        });

        Button IntroducirMedidas = (Button) findViewById(R.id.buttonIntroducirMedidas);
        IntroducirMedidas.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick (View v) {
                Intent intent = new Intent(v.getContext(), IntroduccionMedidas.class);
                startActivityForResult(intent, 0);
            }
        });
    }


    public void Salir(View paramView){

        finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
