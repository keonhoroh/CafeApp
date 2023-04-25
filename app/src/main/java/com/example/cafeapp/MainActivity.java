package com.example.cafeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageButton donutButton;
    ImageButton coffeeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        donutButton = (ImageButton) findViewById(R.id.imageButton2);
        donutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Donut Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intentLoadNewActivity = new Intent(MainActivity.this, DonutActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        coffeeButton = (ImageButton) findViewById(R.id.imageButton3);
        coffeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Coffee Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intentLoadNewActivity = new Intent(MainActivity.this, CoffeeActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}