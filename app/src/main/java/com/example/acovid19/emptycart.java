package com.example.acovid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class emptycart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emptycart);
    }
    public void onClick(View view) {
        if(view.getId()== R.id.btn_shop){
            Intent i = new Intent(emptycart.this,Medicine.class);
            startActivity(i);
        }

    }
}
