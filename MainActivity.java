package com.eyssab.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    private String mosqueLink = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    public String onBtnClickLinkFound(View view) {
        Log.d(webView.getUrl(),"lemon");
        mosqueLink = webView.getUrl();

        System.out.println(mosqueLink);
        docFinder docFin = new docFinder();

        ArrayList visited = new ArrayList();
        System.out.println(docFin.findLink(mosqueLink, visited));

        return "hello";
    }
}
