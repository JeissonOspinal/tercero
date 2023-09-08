package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    private Button Boton1,Boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Boton1 =findViewById(R.id.Boton4);
        Boton2 = findViewById(R.id.Boton5);

        Boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abd= new Intent(MainActivity4.this, MainActivity5.class);
                startActivities(new Intent[]{abd});
            }
        });

        Boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ljk= new Intent(MainActivity4.this, MainActivity5.class);
                startActivities(new Intent[]{ljk});
            }
        });

    }
}