package com.example.jeandersonbc.lifecycledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static StringBuilder buffer = new StringBuilder();
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(MainActivity.class.getName(), "onCreate callback");
        buffer.append("onCreate").append("\n");

        mTextView = findViewById(R.id.tv_logOutput);
        mTextView.setText(buffer.toString());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MainActivity.class.getName(), "onStart callback");
        buffer.append("onStart").append("\n");
        mTextView.setText(buffer.toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MainActivity.class.getName(), "onResume callback");
        buffer.append("onResume").append("\n");
        mTextView.setText(buffer.toString());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MainActivity.class.getName(), "onPause callback");
        buffer.append("onPause").append("\n");
        mTextView.setText(buffer.toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MainActivity.class.getName(), "onStop callback");
        buffer.append("onStop").append("\n");
        mTextView.setText(buffer.toString());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MainActivity.class.getName(), "onRestart callback");
        buffer.append("onRestart").append("\n");
        mTextView.setText(buffer.toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MainActivity.class.getName(), "onDestroy callback");
        buffer.append("onDestroy").append("\n");
        mTextView.setText(buffer.toString());
    }

    public void clearOutput(View view) {
        buffer = new StringBuilder();
        mTextView.setText(buffer.toString());

    }
}
