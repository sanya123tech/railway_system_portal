package com.example.railway_system_portal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class payment extends AppCompatActivity {

    Button UPI;
    Button Card;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        UPI=findViewById(R.id.upiii);
        UPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),upi.class);
                startActivity(intent);
                finish();

            }
        });
        Card=findViewById(R.id.card);
        Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),cardd.class);
                startActivity(intent);
                finish();
            }
        });

    }


}