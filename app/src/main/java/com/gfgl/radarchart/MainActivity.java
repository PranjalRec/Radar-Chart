package com.gfgl.radarchart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ultramegasoft.radarchart.RadarHolder;
import com.ultramegasoft.radarchart.RadarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadarView radarView = findViewById(R.id.radar);
        Button button = findViewById(R.id.button);
        radarView.setMaxValue(7);

        ArrayList<RadarHolder> radarData = new ArrayList<>();
        radarData.add(new RadarHolder("Java", 5));
        radarData.add(new RadarHolder("Python", 3));
        radarData.add(new RadarHolder("C++", 4));
        radarData.add(new RadarHolder("C#", 6));
        radarData.add(new RadarHolder("Go",6));
        radarData.add(new RadarHolder("Ruby", 4));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radarView.setData(radarData);
            }
        });

    }
}