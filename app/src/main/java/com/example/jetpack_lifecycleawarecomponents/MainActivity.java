package com.example.jetpack_lifecycleawarecomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Owner ON_CREATE");
        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Owner ON_START");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Owner ON_PAUSE");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Owner RESUME");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Owner ON_STOP");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Owner ON_RESTART");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Owner ON_DESTROY");
    }
}