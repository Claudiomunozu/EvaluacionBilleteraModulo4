package com.example.billeteramodulo4;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Singup_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_signup_page);

        // Abrir nueva activity

        ImageButton boton = findViewById(R.id.sendlogin);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ir a activity 2
                Intent i = new Intent(Login_Singup_Page.this, Login_page.class);
                startActivity(i);


            }
        });

    }
}