package com.example.billeteramodulo4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class Home_Page_Empty_Case extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home_page_empty_case);

        // Abrir nueva activity

        ImageButton boton = findViewById(R.id.sendhome);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ir a activity 5
                Intent i = new Intent(Home_Page_Empty_Case.this, Request_Money.class);
                startActivity(i);
            }
        });


    }
}