package com.example.lifecycleobserverdemo.observers;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import com.example.lifecycleobserverdemo.MainActivity;
import com.example.lifecycleobserverdemo.R;
import com.example.lifecycleobserverdemo.databinding.ActivityMain2Binding;
import com.example.lifecycleobserverdemo.databinding.ActivityMainBinding;
import com.example.lifecycleobserverdemo.listeners.HandlingButton;

public class MainActivityObserver implements LifecycleObserver {
    private final String TAG = this.getClass().getSimpleName();

    private Activity activity;

    private String nameActivity;

    public MainActivityObserver(Activity activity, String nameActivity){
        this.activity = activity;
        this.nameActivity = nameActivity;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateEvent() {
        switch(nameActivity){
            case "MainActivity":
                ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(activity, R.layout.activity_main);
                activityMainBinding.setHandlingButton(new HandlingButton(activity));
                break;
            case "Main2Activity":
                ActivityMain2Binding activityMain2Binding = DataBindingUtil.setContentView(activity, R.layout.activity_main2);
                break;
        }
        Log.e(TAG, "Observer ON_CREATE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartEvent() {
        Log.e(TAG, "Observer ON_START");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResumeEvent() {
        Log.e(TAG, "Observer ON_RESUME");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPauseEvent() {
        Log.e(TAG, "Observer ON_PAUSE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopEvent() {
        Log.e(TAG, "Observer ON_STOP");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroyEvent() {
        Log.e(TAG, "Observer ON_DESTROY");
    }
}
