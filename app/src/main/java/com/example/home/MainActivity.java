package com.example.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    protected static final String home = "com.example.home";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "start of onCreate in MainActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "end of onCreate in MainActivity");
    }

    public void sendTheBroadcast(View view) {
        Log.d(TAG, "start of sendTheBroadcast in MainActivity");
        Intent intent = new Intent();
        intent.setAction(home);
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);

        sendBroadcast(intent);
        Log.d(TAG, "end of sendTheBroadcast in MainActivity");
    }
}
