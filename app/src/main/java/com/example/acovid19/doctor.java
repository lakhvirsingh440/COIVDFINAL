package com.example.acovid19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;



public class doctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
    }
    public void onClick(View view) {
        if(view.getId()== R.id.btn_chath){
            Intent i = new Intent(doctor.this,harmanchemmachat.class);
            startActivity(i);
        }if(view.getId()== R.id.btn_chatb){
            Intent i = new Intent(doctor.this,lassibrochat.class);
            startActivity(i);
        }if(view.getId()== R.id.btn_chatk){
            Intent i = new Intent(doctor.this,kaliactivachat.class);
            startActivity(i);
        }
    }
}
