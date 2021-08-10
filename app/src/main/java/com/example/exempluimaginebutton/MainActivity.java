package com.example.exempluimaginebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btnInstagram = (ImageButton) findViewById(R.id.btnInstagram);
        ImageButton btnFireFox = (ImageButton) findViewById(R.id.btnFirefox);
        ImageButton btnAndroid = (ImageButton) findViewById(R.id.btnAndroid);

        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Logo Instagram", Toast.LENGTH_SHORT).show();
            }
        });
        btnFireFox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Logo FireFox", Toast.LENGTH_SHORT).show();
            }
        });
        btnAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Logo Android", Toast.LENGTH_SHORT).show();
            }
        });



    }
}