package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onePlayer(View v) {
        startActivity(new Intent(MainActivity.this, OnePlayerActivity.class));
    }

    public void twoPlayer(View v) {
        startActivity(new Intent(MainActivity.this, TwoPlayerActivity.class));
    }
}