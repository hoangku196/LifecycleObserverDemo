package com.example.lifecycleobserverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lifecycleobserverdemo.observers.MainActivityObserver;

public class Main2Activity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);

        getLifecycle().addObserver(new MainActivityObserver(this,TAG));
    }
}
