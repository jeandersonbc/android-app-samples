package com.example.jeandersonbc.implicitintentsdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button mGithubButton = findViewById(R.id.button_openGitHub);
        mGithubButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri webPage = Uri.parse("https://github.com/jeandersonbc");
                Intent intent = new Intent(Intent.ACTION_VIEW, webPage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }

}
