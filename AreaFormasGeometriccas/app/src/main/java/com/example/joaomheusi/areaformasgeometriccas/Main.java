package com.example.joaomheusi.areaformasgeometriccas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void abrirCC(){
        Intent intencao = new Intent(getApplicationContext(), CC1Activity.class);
        startActivity(intencao);
    }

    public void abrirCR(){
        Intent intencao = new Intent(getApplicationContext(), CR1Activity.class);
        startActivity(intencao);
    }

    public void abrirCT(){
        Intent intencao = new Intent(getApplicationContext(), CT1Activity.class);
        startActivity(intencao);
    }
    public void abrir(View quemClicou) {
        RadioGroup rgSelForma = (RadioGroup) findViewById(R.id.rgSelForma);
        if (rgSelForma.getCheckedRadioButtonId() == -1) {
            Toast.makeText(getApplicationContext(), "Selecione a forma geométrica.", Toast.LENGTH_SHORT).show();
            return;
        }
        if (rgSelForma.getCheckedRadioButtonId() == R.id.rBR) {
            abrirCR();
        } else if (rgSelForma.getCheckedRadioButtonId() == R.id.rBT) {
            abrirCT();
        } else {
            abrirCC();
        }
    }


}
