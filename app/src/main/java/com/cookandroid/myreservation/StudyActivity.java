package com.cookandroid.myreservation;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;

public class StudyActivity extends Activity {

    Button[] numButtons = new Button[29];
    Integer[] numBtnIDs = { R.id.BtnrNum0,R.id.BtnrNum1,R.id.BtnrNum2,R.id.BtnrNum3,R.id.BtnrNum4,
            R.id.BtnrNum5,R.id.BtnrNum6,R.id.BtnrNum7,
            R.id.BtnrNum8,R.id.BtnrNum9, R.id.BtnrNum10,R.id.BtnrNum11,
            R.id.BtnrNum12, R.id.BtnrNum13, R.id.BtnrNum14,
            R.id.BtnrNum15,R.id.BtnrNum16,R.id.BtnrNum17,R.id.BtnrNum18,R.id.BtnrNum19,
            R.id.BtnrNum20,R.id.BtnrNum21,R.id.BtnrNum22,
            R.id.BtnrNum23,R.id.BtnrNum24, R.id.BtnrNum25,R.id.BtnrNum26,
            R.id.BtnrNum27, R.id.BtnrNum28 };

    Button btnTimeStart;  // 이 버튼 클릭 시 크로노미터 실행
    Button btnTimeStop;
    Button btnTimeReset;

    Button BtnReturnFirst; // 이 버튼 클릭시 크로노미터 정지시키기
    Button BtnRest; // 이 버튼 클릭 시 크로노미터 정지시키기

    Chronometer chrono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studyroom);
        setTitle("공부합룸 입장");

        chrono = (Chronometer) findViewById(R.id.chronometer1);

        Button btnTimeStart = (Button) findViewById(R.id.btnTimeStart);
        btnTimeStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.RED);
            }
        });

        Button btnTimeStop = (Button) findViewById(R.id.btnTimeStop);
        btnTimeStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);
                }
        });

        Button btnTimeReset = (Button) findViewById(R.id.btnTimeReset);
        btnTimeReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());
            }
        });

        //이전으로 돌아가기
        Button BtnReturnFirst = (Button) findViewById(R.id.BtnReturnFirst);
        BtnReturnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);
                Intent intent = new Intent(StudyActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button BtnRest = (Button) findViewById(R.id.BtnRest);
        BtnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);
                Intent intent = new Intent(StudyActivity.this, RestActivity.class);
                startActivity(intent);
            }
        });
    }
}