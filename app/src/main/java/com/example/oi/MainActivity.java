package com.example.oi;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText editTextMin, editTextMax;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contaclick);
        editTextMin=findViewById(R.id.editTextTextMin);
        editTextMax=findViewById(R.id.editTextTextMax);
        textView=findViewById(R.id.textViewResultado);
    }

    public void sorteia(View v){
        int min, max;
        min = Integer.parseInt(editTextMin.getText().toString());
        max = Integer.parseInt(editTextMax.getText().toString());
        int result=new Random().nextInt(max-min)+min;
        textView.setText(Integer.toString(result));
    }
}