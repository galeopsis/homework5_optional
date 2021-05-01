package com.galeopsis.mycalclauncher;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Uri uri = Uri.parse("example://intent");
            Intent runCalc = new Intent(Intent.ACTION_VIEW, uri);
            ActivityInfo activityInfo =
                    runCalc.resolveActivityInfo(getPackageManager(),
                            runCalc.getFlags());
            if (activityInfo != null) {
                startActivity(runCalc);
            }
        });
    }
}