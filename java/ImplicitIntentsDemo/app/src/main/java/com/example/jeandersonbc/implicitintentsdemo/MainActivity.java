package com.example.jeandersonbc.implicitintentsdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

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

    public void openSchoolLocation(View view) {
        Uri geoUri = Uri.parse("geo:0,0?q=-8.055328,-34.951546(My School!)&z=19");

        Log.i(MainActivity.class.getName(), geoUri.toString());

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setPackage("com.google.android.apps.maps");
        intent.setData(geoUri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            // You may attempt to use an universal url to launch google maps on the browser :)
            String toastMessage = "Seems like you don't have Google Maps!";
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
        }

    }

}
