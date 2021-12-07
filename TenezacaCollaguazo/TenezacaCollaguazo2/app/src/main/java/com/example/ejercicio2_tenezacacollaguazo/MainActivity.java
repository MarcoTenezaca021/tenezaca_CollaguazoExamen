package com.example.ejercicio2_tenezacacollaguazo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1CJ, num2CJ;
    private TextView ResCJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1CJ=(EditText)findViewById(R.id.et1CJ);
        num2CJ=(EditText)findViewById(R.id.et2CJ);
        ResCJ= (TextView)findViewById(R.id.txtResCJ);
    }

    public void operacion(View view) {
        int n1,n2,resta;

        n1 = Integer.parseInt(num1CJ.getText().toString());
        n2 = Integer.parseInt(num2CJ.getText().toString());
        resta = n1- n2;

        ResCJ.setText("Resultado : "+ resta);
    }
}