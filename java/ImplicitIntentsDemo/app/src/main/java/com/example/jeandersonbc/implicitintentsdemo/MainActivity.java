package com.example.jeandersonbc.implicitintentsdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openGithubProfile(View view) {
        Uri webPage = Uri.parse("https://github.com/jeandersonbc");
        Intent intent = new Intent(Intent.ACTION_VIEW, webPage);

        // Always check if there's someone able to resolve this intent
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
