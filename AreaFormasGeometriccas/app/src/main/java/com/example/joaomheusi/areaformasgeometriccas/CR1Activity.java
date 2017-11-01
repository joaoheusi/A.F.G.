package com.example.joaomheusi.areaformasgeometriccas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CR1Activity extends AppCompatActivity {
    private Bundle mochila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cr1);
    }
    public void irResulR(View quemClicou){
        EditText eTAltura = (EditText) findViewById(R.id.eTAltura);
        EditText eTBase = (EditText) findViewById(R.id.eTBase);


        if(eTAltura.getText().toString().equals("") ||
                eTBase.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Todos os dados devem ser preenchidos", Toast.LENGTH_LONG).show();
            return;
        }
        Bundle mochila = new Bundle();
        try {
            double altura = Double.parseDouble(eTAltura.getText().toString());
            double base = Double.parseDouble(eTBase.getText().toString());
            mochila.putDouble("alturaR", altura);
            mochila.putDouble("baseR", base);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Erro ao converter os dados", Toast.LENGTH_LONG).show();
            return;
        }
        Intent intencao = new Intent(getApplicationContext(), CR2Activity.class);
        intencao.putExtras(mochila);
        startActivity(intencao);
    }

}
