package com.example.android.gamequiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {
    //Source: http://www.androidinterview.com/android-custom-listview-with-image-and-text-using-arrayadapter/
    ListView list;
    //Values array
    String[] values = new String[]{"The PlayStation quiz", "The PC quiz", "The Final Fantasy quiz"};
    //pictures array
    Integer[] imgid = {
            R.drawable.controller,
            R.drawable.pc,
            R.drawable.ff,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Arranging the list by text and picture
        CustomListAdapter adapter = new CustomListAdapter(this, values, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //On click opening a new activity with the relevant quiz
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), MainActivityPlaystation.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), MainActivityPC.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), MainActivityFF.class);
                    startActivityForResult(myIntent, 2);
                }
            }
        });
    }
}
