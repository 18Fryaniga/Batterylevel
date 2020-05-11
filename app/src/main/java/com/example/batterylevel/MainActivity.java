package com.example.batterylevel;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPlus,btnMinus;
     ImageView battery;
    int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        btnPlus = findViewById(R.id.button);
        btnPlus.setOnClickListener(this);

        btnMinus= findViewById(R.id.button2);
        btnMinus.setOnClickListener(this);

        battery=findViewById(R.id.imageView3);
        battery.setImageResource(R.drawable.ic_battery_1);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

    if (v.getId() == R.id.button) {
        count++;

    }
    if (v.getId() == R.id.button2) {
        count--;
    }

    if (count == 1) battery.setImageResource(R.drawable.ic_battery_1);
    if (count == 2) battery.setImageResource(R.drawable.ic_battery_2);
    if (count == 3) battery.setImageResource(R.drawable.ic_battery_3);
    if (count == 4) battery.setImageResource(R.drawable.ic_battery_4);
    if (count == 5) battery.setImageResource(R.drawable.ic_battery_5);
    if (count==0) count=1;
    if (count==6) count =5;
}




}
