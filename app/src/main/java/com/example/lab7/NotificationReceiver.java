package com.example.lab7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class NotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("","Hi");
        String message = intent.getStringExtra("toastMessage");
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
