package com.example.tomek.quiz_wiedzy;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Tomek on 2015-02-26.
 */
public class Odpowiedzi extends Activity {
/*
    TextView nw2;
    TextView nw3;
    TextView nw4;
    TextView nw5;
    TextView nw6;
    TextView nw7;
*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_wynikow);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
/**
        nw2 = (TextView) findViewById(R.id.nw2);
        nw3 = (TextView) findViewById(R.id.nw3);
        nw4 = (TextView) findViewById(R.id.nw4);
        nw5 = (TextView) findViewById(R.id.nw5);
        nw6 = (TextView) findViewById(R.id.nw6);
        nw7 = (TextView) findViewById(R.id.nw7);


        nw2.setOnClickListener(listener);
        nw3.setOnClickListener(listener);
        nw4.setOnClickListener(listener);
        nw5.setOnClickListener(listener);
        nw6.setOnClickListener(listener);
        nw7.setOnClickListener(listener);
    }


    View.OnClickListener listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.nw2:
                    Intent inte1 = new Intent(Odpowiedzi.this, historia_wyniki.class);
                    startActivity(inte1);
                    break;

                case R.id.nw3:
                    Intent inte2 = new Intent(Odpowiedzi.this, biologia_wyniki.class);
                    startActivity(inte2);
                    break;

                case R.id.nw4:
                    Intent inte3 = new Intent(Odpowiedzi.this, chemia_wyniki.class);
                    startActivity(inte3);
                    break;

                case R.id.nw5:
                    Intent inte4 = new Intent(Odpowiedzi.this, geografia_wyniki.class);
                    startActivity(inte4);
                    break;

                case R.id.nw6:
                    Intent inte5 = new Intent(Odpowiedzi.this, polski_wyniki.class);
                    startActivity(inte5);
                    break;

                case R.id.nw7:
                    Intent inte6 = new Intent(Odpowiedzi.this, wos_wyniki.class);
                    startActivity(inte6);
                    break;
            }
        }
    };
 **/
}
}