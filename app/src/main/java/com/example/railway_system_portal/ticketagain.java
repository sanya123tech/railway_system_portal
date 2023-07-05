package com.example.railway_system_portal;

import static com.example.railway_system_portal.ticket.fromdd;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class ticketagain extends AppCompatActivity {
    FirebaseAuth auth;
    TextView star;
    TextView stop;
    TextView pricee;

    Button button;
    Button download;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticketagain);
        button = findViewById(R.id.logout);
        auth = FirebaseAuth.getInstance();
        download = findViewById(R.id.download);
        star=findViewById(R.id.startttt);
        stop=findViewById(R.id.stopppp);
        String todd=getIntent().getStringExtra("keyuname");
        stop.setText(todd);
        pricee=findViewById(R.id.priceeee);
        if(todd.equals("assembly")){
            pricee.setText("RS 30");
        } else if (todd.equals("irrum manzil")) {
            pricee.setText("RS 10");
        } else if (todd.equals("khairatabad")) {
            pricee.setText("RS 20");

        } else if (todd.equals("lakdikapul")) {
            pricee.setText("RS 30 ");


        } else if (todd.equals("nampally")) {
            pricee.setText("RS 40");

        }


        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
            NotificationChannel channel=new NotificationChannel("my notification","my notification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);

        }
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(ticketagain.this, "my notification");
                builder.setContentTitle("metro rail");
                builder.setContentText("Your destination is changed! Thank you");
                builder.setSmallIcon(R.drawable.logotrain);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(ticketagain.this);
                if (ActivityCompat.checkSelfPermission(ticketagain.this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                managerCompat.notify(1, builder.build());

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent=new Intent(getApplicationContext(),login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}