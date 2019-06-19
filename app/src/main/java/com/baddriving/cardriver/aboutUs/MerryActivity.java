package com.baddriving.cardriver.aboutUs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.baddriving.cardriver.MainActivity;
import com.baddriving.cardriver.R;

public class MerryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merry);
    }

    // nav buttons

    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, DevelopersActivity.class);
        startActivity(intent);
    }
}
