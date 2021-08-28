package com.example.nctbbookof1to6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Social extends AppCompatActivity {

    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
        webview = findViewById(R.id.webview);
        webview.setWebViewClient(new MyWebViewClient());
        String url = "https://drive.google.com/file/d/1UcaLRm0rl21_-mlqXzuoWs1zcfdqndon/view";
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(url);
    }

    public class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
}