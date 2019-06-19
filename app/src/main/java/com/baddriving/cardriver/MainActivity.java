package com.baddriving.cardriver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.baddriving.cardriver.aboutUs.DevelopersActivity;

// placeholder to navigate to snake driving
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSnakeDriveClick(View view){
        Intent intent = new Intent(this, SnakeDrivingActivity.class);
        startActivity(intent);
    }

    public void onCarDriveClick(View view){
        Intent intent = new Intent(this, CarDrivingActivity.class);
        startActivity(intent);
    }

    public void meetDevs(View view) {
        Intent intent = new Intent(this, DevelopersActivity.class);
        startActivity(intent);
    }
}
