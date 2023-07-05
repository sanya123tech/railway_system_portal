package com.example.railway_system_portal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.railway_system_portal.databinding.ActivityTicketBinding;



public class ticket extends AppCompatActivity {


    Button destination;
     TextView from;
      TextView to;
     TextView price;
    Button paymenttt;
    public static  String fromdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
        from=findViewById(R.id.starttt);
        to=findViewById(R.id.stoppp);
        fromdd=getIntent().getStringExtra("keyname");
        String todd=getIntent().getStringExtra("keytoname");
        from.setText(fromdd);


        to.setText(todd);



        paymenttt=findViewById(R.id.download);
        price=findViewById(R.id.ticketprice);
        if (fromdd.equals("punjagutta") && todd.equals("irrum manzil") ) {
            price.setText("RS 10");
        } else if (fromdd.equals("punjagutta") && todd.equals("khairatabad")) {
            price.setText("RS 20");

        } else if (fromdd.equals("punjagutta") && todd.equals("lakdikapul")) {
            price.setText("RS 30");

        }else if (fromdd.equals("punjagutta") && todd.equals("assembly")) {
            price.setText("RS 40");

        }else if (fromdd.equals("punjagutta") && todd.equals("nampally")) {
            price.setText("RS 50");

        }else if (fromdd.equals("irrum manzil") && todd.equals("khairatabad")) {
            price.setText("RS 10");

        }else if (fromdd.equals("irrum manzil") && todd.equals("lakdikapul")) {
            price.setText("RS 20");

        }else if (fromdd.equals("irrum manzil") && todd.equals("assembly")) {
            price.setText("RS 30");

        }else if (fromdd.equals("irrum manzil") && todd.equals("nampally")) {
            price.setText("RS 40");

        }else if (fromdd.equals("khairatabad") && todd.equals("lakdikapul")) {
            price.setText("RS 10");

        }else if (fromdd.equals("khairatabad") && todd.equals("assembly")) {
            price.setText("RS 20");

        }else if (fromdd.equals("khairatabad") && todd.equals("nampally")) {
            price.setText("RS 30");

        }else
        {
            price.setText("no data");
        }




        paymenttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),payment.class);
                startActivity(intent);
                finish();
            }
        });




        destination=findViewById(R.id.destination);
        destination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),changedest.class);
                startActivity(intent);
                finish();


            }
        });
    }







    }

