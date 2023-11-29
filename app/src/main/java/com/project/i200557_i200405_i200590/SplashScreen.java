package com.project.i200557_i200405_i200590;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.project.i200557_i200405_i200590.R;
import com.project.i200557_i200405_i200590.SignIn;

public class SplashScreen extends AppCompatActivity {

    private static final long SPLASH_DELAY = 5000; // 5 seconds in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Delay transition to another activity after 5 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the MainActivity
                Intent intent = new Intent(SplashScreen.this, SignIn.class);
                startActivity(intent);

                // Remove the SplashScreen from the back stack
                finish();
            }
        }, SPLASH_DELAY);
    }
}