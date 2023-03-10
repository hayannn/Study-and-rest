package com.cookandroid.myreservation;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imageStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("'공부합쉬다' 시작");



        Button BtnInformation = (Button)findViewById(R.id.BtnInformation);
        BtnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("안내");
                builder.setMessage("안녕하세요!\n" +
                        "저희는 개발자 이하얀, 유다빈입니다.\n" +
                        "'공부합쉬다' 어플은 자기관리와 함께 가상 공부\n" +
                        "환경을 제공해 현재와 같은 상황 속에서 공부에\n" +
                        "집중하기 어려운 학생들을 위해 개발했습니다.\n" +
                        "\n"+
                        "반드시 자리를 예약해주시고, '공부합룸'에서\n" +
                        "시간을 재며 공부하실 수 있으며,'공부쉽룸'에서\n" +
                        "휴식을 취할 수도 있습니다.\n" +
                        "또한, 게임 메뉴를 통해 쉬는 동안 잠시 머리를\n" +
                        "식힐 수 있도록 구성했습니다.\n" +
                        "그럼 즐거운 공부 시간이 되시길 바랍니다 :)");
                builder.setPositiveButton("확인", null);
                builder.create().show();
            }
        });


        Button BtnGame = (Button)findViewById(R.id.BtnGame);
        BtnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://slither.io/"));
                startActivity(intent);
            }
        });

        Button BtnPlan = (Button)findViewById(R.id.BtnPlan);
        BtnPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://keep.google.com/"));
                startActivity(intent);
            }
        });


        imageStart = (ImageButton)findViewById(R.id.Start);

        imageStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //다음 액티비티로 가는 것
                //Intent
                Intent intent = new Intent(MainActivity.this,DaytimeActivity.class);
                startActivity(intent);//다음 액티비티 화면에 출력
            }
        });

    }
}
