package com.baddriving.cardriver.aboutUs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.baddriving.cardriver.MainActivity;
import com.baddriving.cardriver.R;

public class DevelopersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);
    }

    // meet the dev btns

    public void meetDana(View view) {
        Intent intent = new Intent(this, DanaActivity.class);
        startActivity(intent);
    }
    public void meetJess(View view) {
        Intent intent = new Intent(this, JessicaActivity.class);
        startActivity(intent);
    }
    public void meetMerry(View view) {
        Intent intent = new Intent(this, MerryActivity.class);
        startActivity(intent);
    }
    public void meetMichael(View view) {
        Intent intent = new Intent(this, MichaelActivity.class);
        startActivity(intent);
    }
    public void meetNicole(View view) {
        Intent intent = new Intent(this, NicoleActivity.class);
        startActivity(intent);
    }
    public void meetTrey(View view) {
        Intent intent = new Intent(this, TreyActivity.class);
        startActivity(intent);
    }

    // nav buttons

    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
