package com.example.imcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    float peso;
    float altura;
    float imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Calcular(View view) {
        final EditText p = (EditText) findViewById(R.id.Peso);
        final EditText a = (EditText) findViewById(R.id.Altura);
        final TextView resultado = (TextView) findViewById(R.id.Resultado);
        altura = Float.parseFloat(a.getText().toString());
        peso = Float.parseFloat(p.getText().toString());
        imc = (peso) / ((altura/100)* (altura/100));

        if (imc <18.5){
            resultado.setText(Float.toString(imc));

        }

        if (imc >= 18.6 && imc<25){
            resultado.setText(Float.toString(imc));
        }

        if (imc >=25 && imc <30){
            resultado.setText(Float.toString(imc));
        }

        if (imc >=30 && imc <35){
            resultado.setText(Float.toString(imc));
        }

        if (imc >=35 && imc < 40){
            resultado.setText(Float.toString(imc));
        }

        if (imc >=40) {
            resultado.setText(Float.toString(imc));
        }

    }


}

