package com.example.lab8wv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static com.example.lab8wv1.R.id.web1;


public class MainActivity extends AppCompatActivity {

    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView objweb = (WebView) findViewById(web1);
        WebSettings webSettings = objweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        objweb.setWebViewClient(new WebViewClient());
        objweb.loadUrl("https://www.bbc.com/mundo");

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        WebView mWebView = (WebView) findViewById(web1);
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (mWebView.canGoBack()) {
                        mWebView.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

}