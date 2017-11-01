package com.example.joaomheusi.areaformasgeometriccas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CR2Activity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        Double area = Double.valueOf(0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cr2);
        try{
            Double altura = getIntent().getExtras().getDouble("alturaR");
            Double base = getIntent().getExtras().getDouble("baseR");
             area = (altura*base);
        }catch(Exception e){

        }

        TextView tvResultado = (TextView) findViewById(R.id.tvRes);
        tvResultado.setText( "Área: "+area+"cmˆ2");
    }


}
