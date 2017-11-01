package com.example.joaomheusi.areaformasgeometriccas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CT1Activity extends AppCompatActivity {

    private Bundle mochila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ct1);
    }

    public void irResulT(View quemClicou){

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
            mochila.putDouble("alturaT", altura);
            mochila.putDouble("baseT", base);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Erro ao converter os dados", Toast.LENGTH_LONG).show();
            return;
        }

        Intent intencao = new Intent(getApplicationContext(), CT2Activity.class);
        intencao.putExtras(mochila);
        startActivityForResult(intencao,99);

    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == 99 && resultCode == 42){
            finish();
        }else {
            return;
        }

    }
}
