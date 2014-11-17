package com.example.simplewebtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        init();
    }

    private void init() {
        String[] contents = getResources().getStringArray(R.array.list_contents);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contents);
        ListView lv = (ListView) findViewById(R.id.listview001);
        lv.setAdapter(adapter);
    }
}