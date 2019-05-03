package com.example.nz.classnine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
  Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NewActivity.class);
                startActivity(intent);
            }
        });



        timePicker = (TimePicker) findViewById(R.id.timePicekr);
        timePicker.setIs24HourView(true);

        String time = timePicker.getCurrentHour()+" : " + timePicker.getCurrentMinute();
        Toast.makeText(MainActivity.this,time,Toast.LENGTH_SHORT).show();

        if(timePicker.isClickable()){
            Toast.makeText(MainActivity.this,time,Toast.LENGTH_SHORT).show();

        }



    }
}
