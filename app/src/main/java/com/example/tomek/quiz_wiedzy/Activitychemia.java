package com.example.tomek.quiz_wiedzy;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Tomek on 2015-01-27.
 */

public class Activitychemia extends Activity implements View.OnClickListener {

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    int o;
    int u;
    int p;
    int r;
    int s;
    int t;

    TextView wynikowo;

    private RadioGroup radioGR1;
    private RadioButton radio;
    private RadioButton radio2;
    private RadioButton radio3;

    private RadioGroup radioGR2;
    private RadioButton radio2_1;
    private RadioButton radio2_2;
    private RadioButton radio2_3;

    private RadioGroup radioGR3;
    private RadioButton radio3_1;
    private RadioButton radio3_2;
    private RadioButton radio3_3;

    private RadioGroup radioGR4;
    private RadioButton radio4_1;
    private RadioButton radio4_2;
    private RadioButton radio4_3;

    private RadioGroup radioGR5;
    private RadioButton radio5_1;
    private RadioButton radio5_2;
    private RadioButton radio5_3;

    private RadioGroup radioGR6;
    private RadioButton radio6_1;
    private RadioButton radio6_2;
    private RadioButton radio6_3;

    private RadioGroup radioGR7;
    private RadioButton radio7_1;
    private RadioButton radio7_2;
    private RadioButton radio7_3;

    private RadioGroup radioGR8;
    private RadioButton radio8_1;
    private RadioButton radio8_2;
    private RadioButton radio8_3;

    private RadioGroup radioGR9;
    private RadioButton radio9_1;
    private RadioButton radio9_2;
    private RadioButton radio9_3;

    private RadioGroup radioGR10;
    private RadioButton radio10_1;
    private RadioButton radio10_2;
    private RadioButton radio10_3;

    private RadioGroup radioGR11;
    private RadioButton radio11_1;
    private RadioButton radio11_2;
    private RadioButton radio11_3;

    private RadioGroup radioGR12;
    private RadioButton radio12_1;
    private RadioButton radio12_2;
    private RadioButton radio12_3;

    private RadioGroup radioGR13;
    private RadioButton radio13_1;
    private RadioButton radio13_2;
    private RadioButton radio13_3;

    private RadioGroup radioGR14;
    private RadioButton radio14_1;
    private RadioButton radio14_2;
    private RadioButton radio14_3;

    private RadioGroup radioGR15;
    private RadioButton radio15_1;
    private RadioButton radio15_2;
    private RadioButton radio15_3;

    private RadioGroup radioGR16;
    private RadioButton radio16_1;
    private RadioButton radio16_2;
    private RadioButton radio16_3;

    private RadioGroup radioGR17;
    private RadioButton radio17_1;
    private RadioButton radio17_2;
    private RadioButton radio17_3;

    private RadioGroup radioGR18;
    private RadioButton radio18_1;
    private RadioButton radio18_2;
    private RadioButton radio18_3;

    private RadioGroup radioGR19;
    private RadioButton radio19_1;
    private RadioButton radio19_2;
    private RadioButton radio19_3;

    private RadioGroup radioGR20;
    private RadioButton radio20_1;
    private RadioButton radio20_2;
    private RadioButton radio20_3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chemia_layout);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        radioGR1 = (RadioGroup) findViewById(R.id.radioGR1);
        radio = (RadioButton) findViewById(R.id.radio);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        radio3 = (RadioButton) findViewById(R.id.radio3);

        radioGR2 = (RadioGroup) findViewById(R.id.radioGR2);
        radio2_1 = (RadioButton) findViewById(R.id.radio2_1);
        radio2_2 = (RadioButton) findViewById(R.id.radio2_2);
        radio2_3 = (RadioButton) findViewById(R.id.radio2_3);

        radioGR3 = (RadioGroup) findViewById(R.id.radioGR3);
        radio3_1 = (RadioButton) findViewById(R.id.radio3_1);
        radio3_2 = (RadioButton) findViewById(R.id.radio3_2);
        radio3_3 = (RadioButton) findViewById(R.id.radio3_3);

        radioGR4 = (RadioGroup) findViewById(R.id.radioGR4);
        radio4_1 = (RadioButton) findViewById(R.id.radio4_1);
        radio4_2 = (RadioButton) findViewById(R.id.radio4_2);
        radio4_3 = (RadioButton) findViewById(R.id.radio4_3);

        radioGR5 = (RadioGroup) findViewById(R.id.radioGR5);
        radio5_1 = (RadioButton) findViewById(R.id.radio5_1);
        radio5_2 = (RadioButton) findViewById(R.id.radio5_2);
        radio5_3 = (RadioButton) findViewById(R.id.radio5_3);

        radioGR6 = (RadioGroup) findViewById(R.id.radioGR6);
        radio6_1 = (RadioButton) findViewById(R.id.radio6_1);
        radio6_2 = (RadioButton) findViewById(R.id.radio6_2);
        radio6_3 = (RadioButton) findViewById(R.id.radio6_3);

        radioGR7 = (RadioGroup) findViewById(R.id.radioGR7);
        radio7_1 = (RadioButton) findViewById(R.id.radio7_1);
        radio7_2 = (RadioButton) findViewById(R.id.radio7_2);
        radio7_3 = (RadioButton) findViewById(R.id.radio7_3);

        radioGR8 = (RadioGroup) findViewById(R.id.radioGR8);
        radio8_1 = (RadioButton) findViewById(R.id.radio8_1);
        radio8_2 = (RadioButton) findViewById(R.id.radio8_2);
        radio8_3 = (RadioButton) findViewById(R.id.radio8_3);

        radioGR9 = (RadioGroup) findViewById(R.id.radioGR9);
        radio9_1 = (RadioButton) findViewById(R.id.radio9_1);
        radio9_2 = (RadioButton) findViewById(R.id.radio9_2);
        radio9_3 = (RadioButton) findViewById(R.id.radio9_3);

        radioGR10 = (RadioGroup) findViewById(R.id.radioGR10);
        radio10_1 = (RadioButton) findViewById(R.id.radio10_1);
        radio10_2 = (RadioButton) findViewById(R.id.radio10_2);
        radio10_3 = (RadioButton) findViewById(R.id.radio10_3);

        radioGR11 = (RadioGroup) findViewById(R.id.radioGR11);
        radio11_1 = (RadioButton) findViewById(R.id.radio11_1);
        radio11_2 = (RadioButton) findViewById(R.id.radio11_2);
        radio11_3 = (RadioButton) findViewById(R.id.radio11_3);

        radioGR12 = (RadioGroup) findViewById(R.id.radioGR12);
        radio12_1 = (RadioButton) findViewById(R.id.radio12_1);
        radio12_2 = (RadioButton) findViewById(R.id.radio12_2);
        radio12_3 = (RadioButton) findViewById(R.id.radio12_3);

        radioGR13 = (RadioGroup) findViewById(R.id.radioGR13);
        radio13_1 = (RadioButton) findViewById(R.id.radio13_1);
        radio13_2 = (RadioButton) findViewById(R.id.radio13_2);
        radio13_3 = (RadioButton) findViewById(R.id.radio13_3);

        radioGR14 = (RadioGroup) findViewById(R.id.radioGR14);
        radio14_1 = (RadioButton) findViewById(R.id.radio14_1);
        radio14_2 = (RadioButton) findViewById(R.id.radio14_2);
        radio14_3 = (RadioButton) findViewById(R.id.radio14_3);

        radioGR15 = (RadioGroup) findViewById(R.id.radioGR15);
        radio15_1 = (RadioButton) findViewById(R.id.radio15_1);
        radio15_2 = (RadioButton) findViewById(R.id.radio15_2);
        radio15_3 = (RadioButton) findViewById(R.id.radio15_3);

        radioGR16 = (RadioGroup) findViewById(R.id.radioGR16);
        radio16_1 = (RadioButton) findViewById(R.id.radio16_1);
        radio16_2 = (RadioButton) findViewById(R.id.radio16_2);
        radio16_3 = (RadioButton) findViewById(R.id.radio16_3);

        radioGR17 = (RadioGroup) findViewById(R.id.radioGR17);
        radio17_1 = (RadioButton) findViewById(R.id.radio17_1);
        radio17_2 = (RadioButton) findViewById(R.id.radio17_2);
        radio17_3 = (RadioButton) findViewById(R.id.radio17_3);

        radioGR18 = (RadioGroup) findViewById(R.id.radioGR18);
        radio18_1 = (RadioButton) findViewById(R.id.radio18_1);
        radio18_2 = (RadioButton) findViewById(R.id.radio18_2);
        radio18_3 = (RadioButton) findViewById(R.id.radio18_3);

        radioGR19 = (RadioGroup) findViewById(R.id.radioGR19);
        radio19_1 = (RadioButton) findViewById(R.id.radio19_1);
        radio19_2 = (RadioButton) findViewById(R.id.radio19_2);
        radio19_3 = (RadioButton) findViewById(R.id.radio19_3);

        radioGR20 = (RadioGroup) findViewById(R.id.radioGR20);
        radio20_1 = (RadioButton) findViewById(R.id.radio20_1);
        radio20_2 = (RadioButton) findViewById(R.id.radio20_2);
        radio20_3 = (RadioButton) findViewById(R.id.radio20_3);

        radio.setOnClickListener(this);
        radio2.setOnClickListener(this);
        radio3.setOnClickListener(this);

        radio2_1.setOnClickListener(this);
        radio2_2.setOnClickListener(this);
        radio2_3.setOnClickListener(this);

        radio3_1.setOnClickListener(this);
        radio3_2.setOnClickListener(this);
        radio3_3.setOnClickListener(this);

        radio4_1.setOnClickListener(this);
        radio4_2.setOnClickListener(this);
        radio4_3.setOnClickListener(this);

        radio5_1.setOnClickListener(this);
        radio5_2.setOnClickListener(this);
        radio5_3.setOnClickListener(this);

        radio6_1.setOnClickListener(this);
        radio6_2.setOnClickListener(this);
        radio6_3.setOnClickListener(this);

        radio7_1.setOnClickListener(this);
        radio7_2.setOnClickListener(this);
        radio7_3.setOnClickListener(this);

        radio8_1.setOnClickListener(this);
        radio8_2.setOnClickListener(this);
        radio8_3.setOnClickListener(this);

        radio9_1.setOnClickListener(this);
        radio9_2.setOnClickListener(this);
        radio9_3.setOnClickListener(this);

        radio10_1.setOnClickListener(this);
        radio10_2.setOnClickListener(this);
        radio10_3.setOnClickListener(this);

        radio11_1.setOnClickListener(this);
        radio11_2.setOnClickListener(this);
        radio11_3.setOnClickListener(this);

        radio12_1.setOnClickListener(this);
        radio12_2.setOnClickListener(this);
        radio12_3.setOnClickListener(this);

        radio13_1.setOnClickListener(this);
        radio13_2.setOnClickListener(this);
        radio13_3.setOnClickListener(this);

        radio14_1.setOnClickListener(this);
        radio14_2.setOnClickListener(this);
        radio14_3.setOnClickListener(this);

        radio15_1.setOnClickListener(this);
        radio15_2.setOnClickListener(this);
        radio15_3.setOnClickListener(this);

        radio16_1.setOnClickListener(this);
        radio16_2.setOnClickListener(this);
        radio16_3.setOnClickListener(this);

        radio17_1.setOnClickListener(this);
        radio17_2.setOnClickListener(this);
        radio17_3.setOnClickListener(this);

        radio18_1.setOnClickListener(this);
        radio18_2.setOnClickListener(this);
        radio18_3.setOnClickListener(this);

        radio19_1.setOnClickListener(this);
        radio19_2.setOnClickListener(this);
        radio19_3.setOnClickListener(this);

        radio20_1.setOnClickListener(this);
        radio20_2.setOnClickListener(this);
        radio20_3.setOnClickListener(this);

    }

    public void onClick(View v) {

        ImageView home = (ImageView) findViewById(R.id.home);
        ImageView check = (ImageView) findViewById(R.id.check);

        wynikowo = (TextView)findViewById(R.id.wynikowo);

        int checked = radioGR1.getCheckedRadioButtonId();
        switch (checked) {
            case R.id.radio:
                radio.setText("Zła odpowiedź");
                radio2.setEnabled(false);
                radio3.setEnabled(false);
                break;
            case R.id.radio2:
                radio2.setText("Zła odpowiedź");
                radio.setEnabled(false);
                radio3.setEnabled(false);
                break;
            case R.id.radio3:
                radio3.setText("Dobra odpowiedź");
                a = 1;
                radio2.setEnabled(false);
                radio.setEnabled(false);
                break;
        }

        int checked2 = radioGR2.getCheckedRadioButtonId();
        switch (checked2) {
            case R.id.radio2_1:
                radio2_1.setText("Zła odpowiedź");
                radio2_2.setEnabled(false);
                radio2_3.setEnabled(false);
                break;
            case R.id.radio2_2:
                radio2_2.setText("Dobra odpowiedź");
                b = 1;
                radio2_1.setEnabled(false);
                radio2_3.setEnabled(false);
                break;

            case R.id.radio2_3:
                radio2_3.setText("Zła odpowiedź");
                radio2_2.setEnabled(false);
                radio2_1.setEnabled(false);
                break;
        }

        int checked3 = radioGR3.getCheckedRadioButtonId();
        switch (checked3) {

            case R.id.radio3_1:
                radio3_1.setText("Zła odpowiedź");
                radio3_2.setEnabled(false);
                radio3_3.setEnabled(false);
                break;

            case R.id.radio3_2:
                radio3_2.setText("Zła odpowiedź");
                radio3_3.setEnabled(false);
                radio3_1.setEnabled(false);
                break;

            case R.id.radio3_3:
                radio3_3.setText("Dobra odpowiedź");
                c = 1;
                radio3_2.setEnabled(false);
                radio3_1.setEnabled(false);
                break;
        }

        int checked4 = radioGR4.getCheckedRadioButtonId();
        switch (checked4) {

            case R.id.radio4_1:
                radio4_1.setText("Dobra odpowiedź");
                d = 1;
                radio4_2.setEnabled(false);
                radio4_3.setEnabled(false);
                break;

            case R.id.radio4_2:
                radio4_2.setText("Zła odpowiedź");
                radio4_1.setEnabled(false);
                radio4_3.setEnabled(false);
                break;

            case R.id.radio4_3:
                radio4_3.setText("Zła odpowiedź");
                radio4_2.setEnabled(false);
                radio4_1.setEnabled(false);
                break;
        }

        int checked5 = radioGR5.getCheckedRadioButtonId();
        switch (checked5) {

            case R.id.radio5_1:
                radio5_1.setText("Zła odpowiedź");
                radio5_2.setEnabled(false);
                radio5_3.setEnabled(false);
                break;

            case R.id.radio5_2:
                radio5_2.setText("Zła odpowiedź");
                radio5_1.setEnabled(false);
                radio5_3.setEnabled(false);
                break;

            case R.id.radio5_3:
                radio5_3.setText("Dobra odpowiedź");
                e = 1;
                radio5_2.setEnabled(false);
                radio5_1.setEnabled(false);
                break;
        }
        int checked6 = radioGR6.getCheckedRadioButtonId();
        switch (checked6) {

            case R.id.radio6_1:
                radio6_1.setText("Zła odpowiedź");
                radio6_2.setEnabled(false);
                radio6_3.setEnabled(false);
                break;

            case R.id.radio6_2:
                radio6_2.setText("Dobra odpowiedź");
                f = 1;
                radio6_3.setEnabled(false);
                radio6_1.setEnabled(false);
                break;

            case R.id.radio6_3:
                radio6_3.setText("Zła odpowiedź");
                radio6_2.setEnabled(false);
                radio6_1.setEnabled(false);
                break;
        }

        int checked7 = radioGR7.getCheckedRadioButtonId();
        switch (checked7) {

            case R.id.radio7_1:
                radio7_1.setText("Zła odpowiedź");
                radio7_2.setEnabled(false);
                radio7_3.setEnabled(false);
                break;

            case R.id.radio7_2:
                radio7_2.setText("Dobra odpowiedź");
                g = 1;
                radio7_3.setEnabled(false);
                radio7_1.setEnabled(false);
                break;

            case R.id.radio7_3:
                radio7_3.setText("Zła odpowiedź");
                radio7_2.setEnabled(false);
                radio7_1.setEnabled(false);
                break;
        }

        int checked8 = radioGR8.getCheckedRadioButtonId();
        switch (checked8) {

            case R.id.radio8_1:
                radio8_1.setText("Dobra odpowiedź");
                h = 1;
                radio8_2.setEnabled(false);
                radio8_3.setEnabled(false);
                break;

            case R.id.radio8_2:
                radio8_2.setText("Zła odpowiedź");
                radio8_1.setEnabled(false);
                radio8_3.setEnabled(false);
                break;

            case R.id.radio8_3:
                radio8_3.setText("Zła odpowiedź");
                radio8_2.setEnabled(false);
                radio8_1.setEnabled(false);
                break;
        }

        int checked9 = radioGR9.getCheckedRadioButtonId();
        switch (checked9) {

            case R.id.radio9_1:
                radio9_1.setText("Dobra odpowiedź");
                i = 1;
                radio9_2.setEnabled(false);
                radio9_3.setEnabled(false);
                break;

            case R.id.radio9_2:
                radio9_2.setText("Zła odpowiedź");
                radio9_3.setEnabled(false);
                radio9_1.setEnabled(false);
                break;

            case R.id.radio9_3:
                radio9_3.setText("Zła odpowiedź");
                radio9_2.setEnabled(false);
                radio9_1.setEnabled(false);
                break;
        }

        int checked10 = radioGR10.getCheckedRadioButtonId();
        switch (checked10) {

            case R.id.radio10_1:
                radio10_1.setText("Zła odpowiedź");
                radio10_2.setEnabled(false);
                radio10_3.setEnabled(false);
                break;

            case R.id.radio10_2:
                radio10_2.setText("Zła odpowiedź");
                radio10_1.setEnabled(false);
                radio10_3.setEnabled(false);
                break;

            case R.id.radio10_3:
                radio10_3.setText("Dobra odpowiedź");
                j = 1;
                radio10_2.setEnabled(false);
                radio10_1.setEnabled(false);
                break;
        }

        int checked11 = radioGR11.getCheckedRadioButtonId();
        switch (checked11) {

            case R.id.radio11_1:
                radio11_1.setText("Zła odpowiedź");
                radio11_2.setEnabled(false);
                radio11_3.setEnabled(false);
                break;

            case R.id.radio11_2:
                radio11_2.setText("Dobra odpowiedź");
                k = 1;
                radio11_1.setEnabled(false);
                radio11_3.setEnabled(false);
                break;

            case R.id.radio11_3:
                radio11_3.setText("Zła odpowiedź");
                radio11_2.setEnabled(false);
                radio11_1.setEnabled(false);
                break;
        }
        int checked12 = radioGR12.getCheckedRadioButtonId();
        switch (checked12) {

            case R.id.radio12_1:
                radio12_1.setText("Dobra odpowiedź");
                l = 1;
                radio12_2.setEnabled(false);
                radio12_3.setEnabled(false);
                break;

            case R.id.radio12_2:
                radio12_2.setText("Zła odpowiedź");
                radio12_3.setEnabled(false);
                radio12_1.setEnabled(false);
                break;

            case R.id.radio12_3:
                radio12_3.setText("Zła odpowiedź");
                radio12_2.setEnabled(false);
                radio12_1.setEnabled(false);
                break;
        }

        int checked13 = radioGR13.getCheckedRadioButtonId();
        switch (checked13) {

            case R.id.radio13_1:
                radio13_1.setText("Zła odpowiedź");
                radio13_2.setEnabled(false);
                radio13_3.setEnabled(false);
                break;

            case R.id.radio13_2:
                radio13_2.setText("Dobra odpowiedź");
                m = 1;
                radio13_1.setEnabled(false);
                radio13_3.setEnabled(false);
                break;

            case R.id.radio13_3:
                radio13_3.setText("Zła odpowiedź");
                radio13_2.setEnabled(false);
                radio13_1.setEnabled(false);
                break;
        }

        int checked14 = radioGR14.getCheckedRadioButtonId();
        switch (checked14) {

            case R.id.radio14_1:
                radio14_1.setText("Zła odpowiedź");
                radio14_2.setEnabled(false);
                radio14_3.setEnabled(false);
                break;

            case R.id.radio14_2:
                radio14_2.setText("Zła odpowiedź");
                radio14_3.setEnabled(false);
                radio14_1.setEnabled(false);
                break;

            case R.id.radio14_3:
                radio14_3.setText("Dobra odpowiedź");
                n = 1;
                radio14_2.setEnabled(false);
                radio14_1.setEnabled(false);
                break;
        }

        int checked15 = radioGR15.getCheckedRadioButtonId();
        switch (checked15) {

            case R.id.radio15_1:
                radio15_1.setText("Zła odpowiedź");
                radio15_2.setEnabled(false);
                radio15_3.setEnabled(false);
                break;

            case R.id.radio15_2:
                radio15_2.setText("Zła odpowiedź");
                radio15_3.setEnabled(false);
                radio15_1.setEnabled(false);
                break;

            case R.id.radio15_3:
                radio15_3.setText("Dobra odpowiedź");
                o = 1;
                radio15_2.setEnabled(false);
                radio15_1.setEnabled(false);
                break;
        }

        int checked16 = radioGR16.getCheckedRadioButtonId();
        switch (checked16) {

            case R.id.radio16_1:
                radio16_1.setText("Dobra odpowiedź");
                u = 1;
                radio16_2.setEnabled(false);
                radio16_3.setEnabled(false);
                break;

            case R.id.radio16_2:
                radio16_2.setText("Zła odpowiedź");
                radio16_1.setEnabled(false);
                radio16_3.setEnabled(false);
                break;

            case R.id.radio16_3:
                radio16_3.setText("Zła odpowiedź");
                radio16_2.setEnabled(false);
                radio16_1.setEnabled(false);
                break;
        }
        int checked17 = radioGR17.getCheckedRadioButtonId();
        switch (checked17) {

            case R.id.radio17_1:
                radio17_1.setText("Zła odpowiedź");
                radio17_2.setEnabled(false);
                radio17_3.setEnabled(false);
                break;

            case R.id.radio17_2:
                radio17_2.setText("Zła odpowiedź");
                radio17_1.setEnabled(false);
                radio17_3.setEnabled(false);
                break;

            case R.id.radio17_3:
                radio17_3.setText("Dobra odpowiedź");
                p = 1;
                radio17_2.setEnabled(false);
                radio17_1.setEnabled(false);
                break;
        }
        int checked18 = radioGR18.getCheckedRadioButtonId();
        switch (checked18) {

            case R.id.radio18_1:
                radio18_1.setText("Dobra odpowiedź");
                r = 1;
                radio18_2.setEnabled(false);
                radio18_3.setEnabled(false);
                break;

            case R.id.radio18_2:
                radio18_2.setText("Zła odpowiedź");
                radio18_1.setEnabled(false);
                radio18_3.setEnabled(false);
                break;

            case R.id.radio18_3:
                radio18_3.setText("Zła odpowiedź");
                radio18_2.setEnabled(false);
                radio18_1.setEnabled(false);
                break;
        }
        int checked19 = radioGR19.getCheckedRadioButtonId();
        switch (checked19) {

            case R.id.radio19_1:
                radio19_1.setText("Dobra odpowiedź");
                s = 1;
                radio19_2.setEnabled(false);
                radio19_3.setEnabled(false);
                break;

            case R.id.radio19_2:
                radio19_2.setText("Zła odpowiedź");
                radio19_1.setEnabled(false);
                radio19_3.setEnabled(false);
                break;

            case R.id.radio19_3:
                radio19_3.setText("Zła odpowiedź");
                radio19_2.setEnabled(false);
                radio19_1.setEnabled(false);
                break;
        }
        int checked20 = radioGR20.getCheckedRadioButtonId();
        switch (checked20) {

            case R.id.radio20_1:
                radio20_1.setText("Dobra odpowiedź");
                t = 1;
                radio20_2.setEnabled(false);
                radio20_3.setEnabled(false);
                break;

            case R.id.radio20_2:
                radio20_2.setText("Zła odpowiedź");
                radio20_3.setEnabled(false);
                radio20_1.setEnabled(false);
                break;

            case R.id.radio20_3:
                radio20_3.setText("Zła odpowiedź");
                radio20_2.setEnabled(false);
                radio20_1.setEnabled(false);
                break;
        }
        home.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(Activitychemia.this,MainActivity.class);
                Activitychemia.this.startActivity(i);
            }
        });

        check.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int sum = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+u+p+r+s+t;
                String test = String.valueOf(sum);
                wynikowo.setText("zdobyłeś "+test+"/20 punktów");
            }
        });
    };
    }




