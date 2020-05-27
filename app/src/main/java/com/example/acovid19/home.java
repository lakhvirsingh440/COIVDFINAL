package com.example.acovid19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import com.google.firebase.auth.FirebaseAuth;

public class home extends AppCompatActivity {
    Button btnLogout;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnLogout = findViewById(R.id.logout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent inToMain = new Intent(home.this, LoginActivity.class);
                startActivity(inToMain);
            }
        });
    }
    public void onClick(View view) {
        if(view.getId()== R.id.btn_doctor){
                Intent i = new Intent(home.this,doctor.class);
                startActivity(i);
            }
        if(view.getId()== R.id.btn_medicine){
                Intent i = new Intent(home.this,Medicine.class);
                startActivity(i);
            }
        }
    }
