package com.example.railway_system_portal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login extends AppCompatActivity {
    EditText editTextEmail,editTextPassword;
    Button login;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
    TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth=FirebaseAuth.getInstance();
        progressBar=findViewById(R.id.progressbar);
        editTextEmail=findViewById(R.id.email);
        editTextPassword=findViewById(R.id.password);
        login=findViewById(R.id.login);
        textView=findViewById(R.id.regg);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),register.class);
                startActivity(intent);
                finish();


            }
        });

       



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                String email,password;
                email=String.valueOf(editTextEmail.getText());
                password=String.valueOf(editTextPassword.getText());


                if(TextUtils.isEmpty((email))){
                    Toast.makeText(login.this, "Enter mail", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty((password))){
                    Toast.makeText(login.this, "Enter password", Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {
                                    try {
                                        Toast.makeText(getApplicationContext(), "Login Succesful", Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(), booking.class);
                                        startActivity(intent);
                                        finish();
                                    }catch (NullPointerException ex){
                                        ex.printStackTrace();
                                    }


                                } else {

                                    Toast.makeText(login.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }
                            }
                        });


            }
        });
    }
}