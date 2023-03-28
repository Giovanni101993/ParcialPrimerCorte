package com.example.miprimerejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class multiplicacion extends AppCompatActivity {

    EditText editNum1, editNum2;
    TextView txtResultado;
    Button btnCalcular, btnLimpiar, btnVolver;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);

        editNum1 = (EditText) findViewById(R.id.editNum1);
        editNum2 = (EditText) findViewById(R.id.editNum2);

        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnVolver = (Button) findViewById(R.id.btnVolverPot);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1, n2, resultado;

                n1 = Integer.parseInt(editNum1.getText().toString());
                n2 = Integer.parseInt(editNum2.getText().toString());

                Calculadora calculo = new Calculadora();

                calculo.setResultadoMul(n1, n2);

                resultado = calculo.getResMult();

                txtResultado.setText("El resultado de la multiplicacion es: "+ resultado);
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNum1.setText("");
                editNum2.setText("");
                txtResultado.setText("");
                editNum1.requestFocus();
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volver();
            }
        });
    }

    public void volver(){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}