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

public class SnakeDrivingActivity extends AppCompatActivity {

    FirebaseFirestore db;
    public static final String TAG = "Snake";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snake_driving);

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
    public void onUpClick(View view){
        db.collection("driving").document("snake")
                .set(new DirectionInput("up"))
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "Posted an Up");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d(TAG, "Failed to post an Up");
                    }
                });
    }
    public void onDownClick(View view){
        db.collection("driving").document("snake")
                .set(new DirectionInput("down"))
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "Posted a Down");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d(TAG, "Failed to post a Down");
                    }
                });
    }
}
