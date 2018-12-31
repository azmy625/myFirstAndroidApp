package com.example.stopwatch2;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onStart(View v){
        ((Chronometer)findViewById(R.id.c)).setBase(SystemClock.elapsedRealtime());
        ((Chronometer)findViewById(R.id.c)).start();
    }

    public void onStop(View v){
        ((Chronometer)findViewById(R.id.c)).stop();
    }

}
