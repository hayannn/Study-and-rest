package com.cookandroid.myreservation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class EndActivity extends Activity {
    TextView tvYear4, tvMonth4, tvDay4, tvHour4, tvMinute4;
    TextView tvName3;
    Button btnStudy;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end);
        setTitle("예약 완료");

        tvName3 = (TextView) findViewById(R.id.tvName3);
        tvName3.setText(((TableActivity) TableActivity.tableContext).tvName.getText());
        //예약 날 정보
        //이전 day time 변수들
        tvYear4 = (TextView) findViewById(R.id.tvYear4);
        tvMonth4 = (TextView) findViewById(R.id.tvMonth4);
        tvDay4 = (TextView) findViewById(R.id.tvDay4);
        tvHour4 = (TextView) findViewById(R.id.tvHour4);
        tvMinute4 = (TextView) findViewById(R.id.tvMinute4);

        tvYear4.setText(((DaytimeActivity) DaytimeActivity.DayContext).tvYear.getText());
        tvMonth4.setText(((DaytimeActivity) DaytimeActivity.DayContext).tvMonth.getText());
        tvDay4.setText(((DaytimeActivity) DaytimeActivity.DayContext).tvDay.getText());
        tvHour4.setText(((DaytimeActivity) DaytimeActivity.DayContext).tvHour.getText());
        tvMinute4.setText(((DaytimeActivity) DaytimeActivity.DayContext).tvMinute.getText());

        Button btnStudy = (Button)findViewById(R.id.BtnStudy);
        btnStudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent
                Intent intent = new Intent(EndActivity.this,StudyActivity.class);
                startActivity(intent);//다음 액티비티 화면에 출력
            }
        });



    }
}