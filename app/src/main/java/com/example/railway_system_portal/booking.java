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

public class booking extends AppCompatActivity  implements AdapterView.OnItemSelectedListener{
    private TextView title;
    private  EditText provideinput;
    private Button transferdata;
    private String start,stop;
    private Spinner spinner1;
    private Spinner spinner2;

    

    FirebaseAuth auth;

    Button button;
    Button payment;
    TextView textView;
    FirebaseUser user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        auth=FirebaseAuth.getInstance();

    textView=findViewById(R.id.user_details);
    user=auth.getCurrentUser();
    if(user==null){
    Intent intent=new Intent(getApplicationContext(),login.class);
    startActivity(intent);
    finish();
    }
    else {
        textView.setText(user.getEmail());
    }

        payment=findViewById(R.id.paymentt);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),payment.class);
                startActivity(intent);
                finish();


            }
        });
        spinner1 = findViewById(R.id.spinnerr1);
        spinner1.setOnItemSelectedListener(this);

        List<String> spinner1Items = new ArrayList<>();
        spinner1Items.add("Ameerpet");
        spinner1Items.add("Assembly");
        spinner1Items.add("Begumpet");
        spinner1Items.add("Bharatnagar");
        spinner1Items.add("Chaitanyapuri");
        spinner1Items.add("Chikkadpally");
        spinner1Items.add("Dilsukhnagar");
        spinner1Items.add("ESI hospital");
        spinner1Items.add("Erragadda");
        spinner1Items.add("SR nagar");
        spinner1Items.add("hasibguda");
        ArrayAdapter<String> spinner1Adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinner1Items);
        spinner1Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(spinner1Adapter);

        // Spinner 2
        spinner2 = findViewById(R.id.spinnerr2);
        spinner2.setOnItemSelectedListener(this);

        List<String> spinner2Items = new ArrayList<>();
        spinner2Items.add("Ameerpet");
        spinner2Items.add("Assembly");
        spinner2Items.add("Begumpet");
        spinner2Items.add("Bharatnagar");
        spinner2Items.add("Chaitanyapuri");
        spinner2Items.add("Chikkadpally");
        spinner2Items.add("Dilsukhnagar");
        spinner2Items.add("ESI hospital");
        spinner2Items.add("Erragadda");
        spinner2Items.add("SR nagar");
        spinner2Items.add("hasibguda");
        ArrayAdapter<String> spinner2Adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinner2Items);
        spinner2Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(spinner2Adapter);


    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position,  long l) {
        String selectedItem = parent.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(), "Selected item: " + selectedItem, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}



