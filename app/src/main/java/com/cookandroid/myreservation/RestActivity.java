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

public class RestActivity extends Activity {

    Button[] numButtons2 = new Button[6];
    Integer[] numBtnIDs2 = { R.id.Btnbed1,R.id.Btnbed2,
                             R.id.Btnbed3,R.id.Btnbed4,
                             R.id.Btnbed5,R.id.Btnbed6};

    ImageButton btn_chang;
    ImageButton btn_chang2;
    ImageButton btn_chang3;
    ImageButton btn_chang4;
    ImageButton btn_chang5;
    ImageButton btn_chang6;

    Button btnTimeStart2;  // 이 버튼 클릭 시 크로노미터 실행
    Button btnTimeStop2;
    Button btnTimeReset2;

    Button BtnReturnFirst; // 이 버튼 클릭시 크로노미터 정지시키기
    Button BtnStudyroom; // 이 버튼 클릭 시 크로노미터 정지시키기

    Chronometer chrono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restroom);
        setTitle("공부쉽룸 입장");

        chrono = (Chronometer) findViewById(R.id.chronometer2);

        Button btnTimeStart2 = (Button) findViewById(R.id.btnTimeStart2);
        btnTimeStart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.RED);
            }
        });

        Button btnTimeStop2 = (Button) findViewById(R.id.btnTimeStop2);
        btnTimeStop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);
            }
        });

        Button btnTimeReset2 = (Button) findViewById(R.id.btnTimeReset2);
        btnTimeReset2.setOnClickListener(new View.OnClickListener() {
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
                Intent intent = new Intent(RestActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button BtnStudyroom = (Button) findViewById(R.id.BtnStudyroom);
        BtnStudyroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);
                Intent intent = new Intent(RestActivity.this, StudyActivity.class);
                startActivity(intent);
            }
        });


        // 여기서부터 끝까지 restroom.xml의 6개 이미지 버튼의 이벤트 처리
        // -> 각각의 button_chang.xml ~ button_chang6.xm과 연결해 버튼 클릭시 이미지를 변경해줌.
        ImageButton btn_chang = (ImageButton) findViewById(R.id.Btnbed1);
        btn_chang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean selected = false;
                if (selected) {
                    btn_chang.setSelected(false);
                    selected = false;
                } else {
                    btn_chang.setSelected(true);
                    selected = true;
                }
            }
        });

        ImageButton btn_chang2 = (ImageButton) findViewById(R.id.Btnbed2);
        btn_chang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean selected = false;
                if (selected) {
                    btn_chang2.setSelected(false);
                    selected = false;
                } else {
                    btn_chang2.setSelected(true);
                    selected = true;
                }
            }
        });

        ImageButton btn_chang3 = (ImageButton) findViewById(R.id.Btnbed3);
        btn_chang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean selected = false;
                if (selected) {
                    btn_chang3.setSelected(false);
                    selected = false;
                } else {
                    btn_chang3.setSelected(true);
                    selected = true;
                }
            }
        });

        ImageButton btn_chang4 = (ImageButton) findViewById(R.id.Btnbed4);
        btn_chang4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean selected = false;
                if (selected) {
                    btn_chang4.setSelected(false);
                    selected = false;
                } else {
                    btn_chang4.setSelected(true);
                    selected = true;
                }
            }
        });

        ImageButton btn_chang5 = (ImageButton) findViewById(R.id.Btnbed5);
        btn_chang5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean selected = false;
                if (selected) {
                    btn_chang5.setSelected(false);
                    selected = false;
                } else {
                    btn_chang5.setSelected(true);
                    selected = true;
                }
            }
        });

        ImageButton btn_chang6 = (ImageButton) findViewById(R.id.Btnbed6);
        btn_chang6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean selected = false;
                if (selected) {
                    btn_chang6.setSelected(false);
                    selected = false;
                } else {
                    btn_chang6.setSelected(true);
                    selected = true;
                }
            }
        });
    }
}