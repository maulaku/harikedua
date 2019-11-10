package com.example.harikedua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class WebviewActivity extends AppCompatActivity {
    WebView webViewYoutube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        //inisialisasi
        webViewYoutube= (WebView) findViewById(R.id.webview_youtube);
        //attribute
        webViewYoutube.loadUrl("https://youtube.com");
        webViewYoutube.getSettings().setJavaScriptEnabled(true);
       // webViewYoutube.setWebChromeClient(new WebChromeClient());
    }

    public void onBackPressed() {

        if (webViewYoutube.canGoBack()){
            webViewYoutube.goBack();
        } else {
            super.onBackPressed();
        }

    }
}
