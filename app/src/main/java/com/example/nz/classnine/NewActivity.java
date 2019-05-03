package com.example.nz.classnine;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity implements View.OnClickListener {


    Button button;
    TimePickerDialog timePickerDialog;
    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        button = (Button)findViewById(R.id.timeBtn);
       // timePicker.setIs24HourView(true);

        button.setOnClickListener(NewActivity.this);


    }

    @Override
    public void onClick(View v) {

        TimePicker timePicker = new TimePicker(this);
        final int hour = timePicker.getCurrentHour();
       final int minute = timePicker.getCurrentMinute();


        timePickerDialog = new TimePickerDialog(NewActivity.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(NewActivity.this,"Your Set Time is : "+hour+" : "+minute,Toast.LENGTH_SHORT).show();
            }
        },hour,minute,true);
        timePickerDialog.show();
    }
}
