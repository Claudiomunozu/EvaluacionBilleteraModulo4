package com.example.billeteramodulo4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class Profile_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.profile_page);

        // Abrir nueva activity

        ImageButton boton = findViewById(R.id.sendhome);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ir a activity 5
                Intent i = new Intent(Profile_Page.this, Splash_Screen.class);
                startActivity(i);
            }
        });


    }
}