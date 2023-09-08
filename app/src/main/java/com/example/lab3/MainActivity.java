package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Boton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Boton1 =findViewById(R.id.Button1);

        Boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent asd = new Intent(MainActivity.this, MainActivity2.class);
                startActivities(new Intent[]{asd});
            }
        });


    }


}