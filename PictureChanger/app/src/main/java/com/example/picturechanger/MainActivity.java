package com.example.picturechanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private void change(View view) {
        ImageView img = (ImageView) findViewById(R.id.img);
        img.setImageResource(R.drawable.zon);
    }

    private void cancel(View view) {
        ImageView img = (ImageView) findViewById(R.id.img);
        img.setImageResource(R.drawable.ali);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}