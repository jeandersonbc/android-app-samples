package com.example.jeandersonbc.implicitintentsdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        String addressString = "Av. Jorn. Aníbal Fernandes, s/n - Cidade Universitária, Recife - PE, 50740-560";
        Uri.Builder builder = new Uri.Builder();
        Uri geoUri = builder.scheme("geo").path("0,0").query(addressString).build();

        // TODO: Open location
        Toast.makeText(this, String.format("%s", geoUri), Toast.LENGTH_SHORT).show();

    }

}
