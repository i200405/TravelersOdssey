package com.project.i200557_i200405_i200590;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    ImageButton timeline;
    LinearLayout Frag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeline = findViewById(R.id.timeline);
        Frag = findViewById(R.id.frag_linear);

        timeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimelineFragment timelineFragment = new TimelineFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_linear, timelineFragment);
                transaction.commit();
            }
        });


    }


}
