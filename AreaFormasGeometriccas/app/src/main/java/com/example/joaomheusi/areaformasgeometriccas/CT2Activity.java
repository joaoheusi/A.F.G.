package com.example.joaomheusi.areaformasgeometriccas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CT2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Double area = Double.valueOf(0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ct2);
        try{


        Double altura = getIntent().getExtras().getDouble("alturaT");
        Double base = getIntent().getExtras().getDouble("baseT");
         area = (altura*base)/2;
    }catch(Exception e){

    }
        TextView tvResultado = (TextView) findViewById(R.id.tvRes);
        tvResultado.setText( "Área: "+area+"cmˆ2");
    }
    public void returnMenu( View quemClicou){
        setResult(42);
        finish();
    }
}
