package com.example.oi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ContaClick extends AppCompatActivity {
    TextView textViewOlaMundo;
    TextView textViewResultado;
    int cont = 0;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contaclick);



    }

    public void contaClicks(View v){

        textViewOlaMundo = findViewById(R.id.olamundo);
        textViewResultado = findViewById(R.id.contador);

        textViewOlaMundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont++;
                textViewResultado.setText(Integer.toString(cont));
            }
        });







    }







}
