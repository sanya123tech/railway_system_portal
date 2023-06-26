package com.example.railway_system_portal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class changedest extends AppCompatActivity   implements AdapterView.OnItemSelectedListener{
    private Spinner spinner3;
    Button payment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changedest);
        payment2 = findViewById(R.id.paymentt2);
        payment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), paymentagain.class);
                startActivity(intent);
                finish();
            }
        });
        spinner3 = findViewById(R.id.spinnerr3);
        spinner3.setOnItemSelectedListener(this);

        List<String> spinner3Items = new ArrayList<>();
        spinner3Items.add("Ameerpet");
        spinner3Items.add("Assembly");
        spinner3Items.add("Begumpet");
        spinner3Items.add("Bharatnagar");
        spinner3Items.add("Chaitanyapuri");
        spinner3Items.add("Chikkadpally");
        spinner3Items.add("Dilsukhnagar");
        spinner3Items.add("ESI hospital");
        spinner3Items.add("Erragadda");
        spinner3Items.add("SR nagar");
        spinner3Items.add("hasibguda");
        ArrayAdapter<String> spinner3Adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, spinner3Items);
        spinner3Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(spinner3Adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position,  long l) {
        String selectedItem = parent.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(), "Selected item: " + selectedItem, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}