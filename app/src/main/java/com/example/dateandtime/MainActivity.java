package com.example.dateandtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.sql.ResultSet;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView currentDate = findViewById(R.id.current_date);
        TextView currentTime = findViewById(R.id.current_time);


        currentDate.setText(getCurrentDay());
        currentTime.setText(getCurrentTime());

        }

        public static String getCurrentDay() {
            return new SimpleDateFormat("EEE,dd MMM yyyy", Locale.getDefault()).format(new Date());

        }

    public static String getCurrentTime() {
        return new SimpleDateFormat("h:mm a", Locale.getDefault()).format(new Date());


    }
}