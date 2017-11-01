package com.example.joaomheusi.areaformasgeometriccas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CC1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc1);
    }

    public void irResulC(View quemClicou){
        EditText eTRaio = (EditText) findViewById(R.id.eTRaio);



        if(eTRaio.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Todos os dados devem ser preenchidos", Toast.LENGTH_LONG).show();
            return;
        }
        Bundle mochila = new Bundle();
        try {
            double raio = Double.parseDouble(eTRaio.getText().toString());
            mochila.putDouble("raio", raio);

        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Erro ao converter os dados", Toast.LENGTH_LONG).show();
            return;
        }


        Intent intencao = new Intent(getApplicationContext(), CC2Activity.class);
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
