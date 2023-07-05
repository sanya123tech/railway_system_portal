package com.example.railway_system_portal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class changedest extends AppCompatActivity {

    Button bokk;
    EditText stopddd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changedest);
        bokk = findViewById(R.id.bookkk);
        stopddd=findViewById(R.id.tooo);
        bokk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to=stopddd.getText().toString();
                Intent intent=new Intent(changedest.this,ticketagain.class);
                intent.putExtra("keyuname",to);
                startActivity(intent);
            }
        });


    }
}