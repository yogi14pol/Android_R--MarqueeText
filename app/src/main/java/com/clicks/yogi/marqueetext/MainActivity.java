package com.clicks.yogi.marqueetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView marueeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    marueeText = findViewById(R.id.marquees);

    marueeText.setSingleLine();
    marueeText.setSelected(true);

    }
}