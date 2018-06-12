package com.example.jeandersonbc.implicitintentsdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final Context mActivityContext = this;
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button mGithubButton = findViewById(R.id.button_openGitHub);
        mGithubButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mToast != null) {
                    mToast.cancel();
                }
                mToast = Toast.makeText(mActivityContext, "Hello", Toast.LENGTH_LONG);
                mToast.show();
            }
        });
    }

}
