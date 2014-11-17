package com.example.simplewebtest;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends Activity {
    public static final String EXTRA_URL = "url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);

        init();
    }

    private void init() {
        String urlString = getIntent().getStringExtra(EXTRA_URL);
        Uri uri = Uri.parse(urlString);
        if (uri.getScheme() == null) {
            urlString = "http://" + urlString;
        }
        WebView wv = (WebView) findViewById(R.id.webView1);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl(urlString);
    }
}