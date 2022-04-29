package com.example.bsc_group;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
public class MainActivity extends AppCompatActivity {
    @Override
    //
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        Intent calendarIntent = new Intent(this, BcsCalendarWidget.class);
        Intent techIntent = new Intent(this, BcsTechHome.class);
        Intent foodIntent = new Intent(this, BcsEatsHome.class);
        ImageButton foodButton = (ImageButton) findViewById(R.id.imageButtonFood);
        foodButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(foodIntent);
            }
        });
        ImageButton techButton = (ImageButton) findViewById(R.id.imageButtonTech);
        techButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(techIntent);
            }
        });
        ImageButton calendarButton = (ImageButton) findViewById(R.id.imageButtonCalendar);
        calendarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(calendarIntent);
            }
        });
    }
}