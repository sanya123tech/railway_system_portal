package com.example.railway_system_portal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class paymentagain extends AppCompatActivity {
    Button upii;
    Button carddd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentagain);
        carddd=findViewById(R.id.card2);
        carddd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),cardd.class);
                startActivity(intent);
                finish();

            }
        });
        upii=findViewById(R.id.upiii2);
        upii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),upi.class);
                startActivity(intent);
                finish();

            }
        });
    }
}