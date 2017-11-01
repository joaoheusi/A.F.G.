package com.example.joaomheusi.areaformasgeometriccas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CC2Activity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        Double area = Double.valueOf(0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc2);
        try {
        Double raio = getIntent().getExtras().getDouble("raio");
         area = Math.pow(raio,2)* 3.141592;
    }catch(Exception e){

    }
        TextView tvResultado = (TextView) findViewById(R.id.tvRes);
        tvResultado.setText( "Área: "+area+"cmˆ2");
    }
    public void returnMenu(View quemClicou){
        setResult(42);
        finish();
    }
}
