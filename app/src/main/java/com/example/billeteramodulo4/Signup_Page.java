package com.example.billeteramodulo4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class Signup_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.signup_page);

        // Abrir nueva activity

        ImageButton boton3 = findViewById(R.id.sendlogin);

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ir a activity 4
                Intent i = new Intent(Signup_Page.this, Home_Page.class);
                startActivity(i);
            }
        });

    }
}