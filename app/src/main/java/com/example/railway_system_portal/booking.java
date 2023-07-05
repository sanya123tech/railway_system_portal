package com.example.railway_system_portal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class booking extends AppCompatActivity {
    private  EditText startd;
    private EditText stopd;
    private TextView show;



    FirebaseAuth auth;

    Button button;
    Button payment;
    TextView textView;
    FirebaseUser user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        startd=findViewById(R.id.frommm);
        stopd=findViewById(R.id.tooo);
        payment = findViewById(R.id.paymentt);

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String from=startd.getText().toString();
                String to=stopd.getText().toString();
                Intent intent=new Intent(booking.this,ticket.class);
                intent.putExtra("keyname",from);
               intent.putExtra("keytoname",to);
               startActivity(intent);



            }
        });


        auth = FirebaseAuth.getInstance();

        textView = findViewById(R.id.user_details);
        user = auth.getCurrentUser();
        if (user == null) {
            Intent intent = new Intent(getApplicationContext(), login.class);
            startActivity(intent);
            finish();
        } else {
            textView.setText(user.getEmail());
        }


    }
}