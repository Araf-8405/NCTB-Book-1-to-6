package com.example.nctbbookof1to6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Math extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        webview = findViewById(R.id.webview);
        webview = findViewById(R.id.webview);
        webview.setWebViewClient(new MyWebViewClient());
        String url = "https://drive.google.com/file/d/1D7iUzf4Zdo0XIbJfgCfH8ovSY3oGm7EB/view";
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
