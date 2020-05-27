package com.example.acovid19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class Medicine extends AppCompatActivity {
    EditText cart1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);
        cart1 = findViewById(R.id.pil1);
    }
    public void onClick(View view) {
        if(view.getId()== R.id.cart1){
            if(cart1.getText().toString().equals("CEGEP")){
                Intent i = new Intent(Medicine.this,cart.class);
                startActivity(i);
            }else{
                Toast.makeText(this,"Invalid Code",Toast.LENGTH_LONG).show();
            }
        }

    }
}
