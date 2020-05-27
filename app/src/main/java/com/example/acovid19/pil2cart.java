package com.example.acovid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pil2cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pil2cart);
    }
    public void onClick(View view) {
        if(view.getId()== R.id.btn_checkout){
            Intent i = new Intent(pil2cart.this,ordered.class);
            startActivity(i);
        }
        if(view.getId()== R.id.btn_delete){
            Intent i = new Intent(pil2cart.this,emptycart.class);
            startActivity(i);
        }if(view.getId()== R.id.btn_checkout1){
            Intent i = new Intent(pil2cart.this,ordered.class);
            startActivity(i);
        }
    }
}
