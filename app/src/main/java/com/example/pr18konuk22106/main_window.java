package com.example.pr18konuk22106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class main_window extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_window);

    }
    public void main_activity(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void Zadanie2(View v){
        Intent intent = new Intent(this, Zadanie2.class);
        startActivity(intent);
    }
    public void Zadanie3(View v){
        Intent intent = new Intent(this, Zadanie3.class);
        startActivity(intent);
    }
}