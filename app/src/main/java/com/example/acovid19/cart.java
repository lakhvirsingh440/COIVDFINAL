package com.example.acovid19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;



public class cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }
    public void onClick(View view) {
        if(view.getId()== R.id.btn_checkout){
            Intent i = new Intent(cart.this,ordered.class);
            startActivity(i);
        }
        if(view.getId()== R.id.btn_delete){
            Intent i = new Intent(cart.this,pil2cart.class);
            startActivity(i);
        }if(view.getId()== R.id.btn_delete2){
            Intent i = new Intent(cart.this,pil1cart.class);
            startActivity(i);
        }if(view.getId()== R.id.btn_checkout1){
            Intent i = new Intent(cart.this,ordered.class);
            startActivity(i);
        }
    }
}
