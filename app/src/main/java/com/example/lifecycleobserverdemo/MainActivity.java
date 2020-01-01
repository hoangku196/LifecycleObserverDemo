package com.example.lifecycleobserverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.lifecycleobserverdemo.observers.MainActivityObserver;

public class MainActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        Log.e(TAG, "Activity ON_CREATE");
        getLifecycle().addObserver(new MainActivityObserver(this,TAG));
    }
}
