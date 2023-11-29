package com.project.i200557_i200405_i200590;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    ImageButton timeline, itinerary, add, calendar, map;
    LinearLayout Frag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeline = findViewById(R.id.timeline);
        itinerary = findViewById(R.id.itinerary);
        add = findViewById(R.id.add);
        calendar= findViewById(R.id.calendar);
        map = findViewById(R.id.map);
        Frag = findViewById(R.id.frag_linear);

        if (savedInstanceState == null) { // To prevent overlapping fragments on configuration changes
            TimelineFragment timelineFragment = new TimelineFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frag_linear, timelineFragment);
            transaction.commit();
        }

        timeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimelineFragment timelineFragment = new TimelineFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_linear, timelineFragment);
                transaction.commit();
            }
        });

        itinerary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItineraryFragment itineraryFragment = new ItineraryFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_linear, itineraryFragment);
                transaction.commit();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddFragment addFragment = new AddFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_linear, addFragment);
                transaction.commit();
            }
        });

        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalendarFragment calendarFragment = new CalendarFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_linear, calendarFragment);
                transaction.commit();
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MapFragment mapFragment = new MapFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frag_linear, mapFragment);
                transaction.commit();
            }
        });


    }


}
