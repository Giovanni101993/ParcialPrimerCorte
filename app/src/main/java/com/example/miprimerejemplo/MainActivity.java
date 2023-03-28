package com.example.miprimerejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button botonOpc;
    EditText editOpc;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editOpc = (EditText) findViewById(R.id.editTextOption);

        botonOpc = (Button) findViewById(R.id.buttonCambiar);

        botonOpc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int opcion;

                opcion = Integer.parseInt(editOpc.getText().toString());

                switch (opcion) {

                    case 1:
                        cambiarFibonacci();
                        break;

                    case 2:
                        cambiarPotencia();
                        break;

                    case 3:
                        cambiarMultiplicacion();
                        break;

                    default:
                        Toast.makeText(getApplicationContext(),"El número ingresado no es valido", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
        public void cambiarFibonacci(){
            Intent fibonacci = new Intent(this, fibonacci.class);
            startActivity(fibonacci);
        }

        public void cambiarPotencia(){
            Intent potencia = new Intent(this, potencia.class);
            startActivity(potencia);
        }

        public void cambiarMultiplicacion(){
            Intent multiplicacion = new Intent(this, multiplicacion.class);
            startActivity(multiplicacion);
        }


}
