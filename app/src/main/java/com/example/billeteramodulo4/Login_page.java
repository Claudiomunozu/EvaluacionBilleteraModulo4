package com.example.billeteramodulo4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Login_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_page);


        // Abrir nueva activity

        ImageButton boton2 = findViewById(R.id.sendhome);

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ir a activity 3
                Intent i = new Intent(Login_page.this, Signup_Page.class);
                startActivity(i);
            }
        });


    }
}