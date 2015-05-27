package com.example.simplewebtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onClickJump(View v) {
        EditText et = (EditText) findViewById(R.id.editText001);
        String url = et.getText().toString();
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra(WebActivity.EXTRA_URL, url);
        startActivity(intent);
    }

    public void onClickSetting(View v) {
        Intent intent = new Intent();
        intent.setAction(Settings.ACTION_SETTINGS);
        startActivity(intent);
    }

    public void onClickList(View v) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}