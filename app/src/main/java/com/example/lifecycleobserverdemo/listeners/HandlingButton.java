package com.example.lifecycleobserverdemo.listeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.lifecycleobserverdemo.Main2Activity;

public class HandlingButton {
    private Context context;

    public HandlingButton(Context context) {
        this.context = context;
    }

    public void startActivity(View view) {
        Intent intent = new Intent(context, Main2Activity.class);
        context.startActivity(intent);
    }
}
