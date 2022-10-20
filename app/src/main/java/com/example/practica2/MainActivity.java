package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText cNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cNum = findViewById(R.id.cNum);

    }
    public void aceptar(View view){
        String dato = cNum.getText().toString();

        int num = Integer.parseInt(dato);

        if (num<=0){
            Toast.makeText(this, "Ingresa un numero mayor que cero", Toast.LENGTH_LONG).show();

        }else if(num>=3200){
            Toast.makeText(this, "Ingresa un numero menor que 3200", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Ingresa un numero", Toast.LENGTH_LONG).show();
        }
    }
}