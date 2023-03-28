package com.example.miprimerejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fibonacci extends AppCompatActivity {

    EditText editNum1;
    TextView textResultado;
    Button btnCalcular, btnVolver, btnLimpiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        editNum1 = (EditText) findViewById(R.id.num1);
        textResultado = (TextView) findViewById(R.id.resFib);
        btnCalcular = (Button) findViewById(R.id.calFib);
        btnVolver = (Button) findViewById(R.id.btnVolverPot);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  num, res;

                num = Integer.parseInt(editNum1.getText().toString());

                Calculadora calculo = new Calculadora();
                textResultado.setText(calculo.operacionFib(num));
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                editNum1.setText("");
                textResultado.setText("");
                editNum1.requestFocus();
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){

                volver();
            }
        });
    }

    public void volver() {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}
