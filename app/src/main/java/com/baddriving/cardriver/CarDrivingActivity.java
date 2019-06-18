package com.baddriving.cardriver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.baddriving.cardriver.communicationjson.DirectionInput;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

public class CarDrivingActivity extends AppCompatActivity {

    FirebaseFirestore db;
    public static final String TAG = "Car";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_driving2);

        db = FirebaseFirestore.getInstance();
    }

    public void onLeftClick(View view){
        db.collection("driving").document("snake")
                .set(new DirectionInput("left"))
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "Posted a Left");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d(TAG, "Failed to post a Left");
                    }
                });
    }
    public void onRightClick(View view){
        db.collection("driving").document("snake")
                .set(new DirectionInput("right"))
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "Posted a Right");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d(TAG, "Failed to post a Right");
                    }
                });
    }
    public void onForwardClick(View view){
        db.collection("driving").document("snake")
                .set(new DirectionInput("forward"))
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "Posted a Forward");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d(TAG, "Failed to post a Forward");
                    }
                });
    }
    public void onStopClick(View view){
        db.collection("driving").document("snake")
                .set(new DirectionInput("stop"))
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "Posted a Stop");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d(TAG, "Failed to post a Stop");
                    }
                });
    }
}
