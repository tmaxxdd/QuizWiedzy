package com.example.tomek.quiz_wiedzy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener, View.OnClickListener {

    private DrawerLayout drawerLayout;
    private ListView listview;
    private String[] przedmioty;
    private MyAdapter myAdapter;
    private ImageView img;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        img = (ImageView) findViewById(R.id.imageView3);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        listview = (ListView) findViewById(R.id.drawerList);
        przedmioty = getResources().getStringArray(R.array.przedmioty);
        myAdapter = new MyAdapter(this);
        listview.setAdapter(myAdapter);
        listview.setOnItemClickListener(this);
        img.setOnClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intento;
        switch (position) {
            case 0: // first one of the list
                intento = new Intent(this, Activityhistoria.class);
                startActivity(intento);
                break;
            case 1: // first one of the list
                intento = new Intent(this, Activitybiologia.class);
                startActivity(intento);
                break;
            case 2: // first one of the list
                intento = new Intent(this, Activitychemia.class);
                startActivity(intento);
                break;
            case 3: // first one of the list
                intento = new Intent(this, Activitygeografia.class);
                startActivity(intento);
                break;
            case 4: // first one of the list
                intento = new Intent(this, Activitypolski.class);
                startActivity(intento);
                break;
            case 5: // first one of the list
                intento = new Intent(this, Activitywos.class);
                startActivity(intento);
                break;
            case 6: // second one of the list.
                intento = new Intent(this, Omnie.class);
                startActivity(intento);
                break;
        }

        }


    @Override
    public void onClick(View v) {
        drawerLayout.openDrawer(listview);
    }

    class MyAdapter extends BaseAdapter {

        private Context context;


        String[] przedmiotySites;
        int[] images = {R.drawable.historia, R.drawable.biologia, R.drawable.chemia, R.drawable.geografia, R.drawable.polski, R.drawable.wos, R.drawable.client};

        public MyAdapter(Context context) {
            this.context = context;
            przedmiotySites = context.getResources().getStringArray(R.array.przedmioty);
        }

        @Override
        public int getCount() {
            return przedmiotySites.length;
        }

        @Override
        public Object getItem(int position) {
            return przedmiotySites[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = null;

            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(R.layout.pojedynczy, parent, false);

            } else {
                row = convertView;
            }
            TextView titleTextView = (TextView) row.findViewById(R.id.historia_txt);
            ImageView titleimageView = (ImageView) row.findViewById(R.id.historia_img);
            titleTextView.setText(przedmiotySites[position]);
            titleimageView.setImageResource(images[position]);
            return row;
        }
        }
    }








