package com.example.ex9;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.webkit.WebSettings;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    WebView wV;
    EditText eT;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wV = findViewById(R.id.wV);
        eT = findViewById(R.id.eT);
        btn = findViewById(R.id.btn);

        WebSettings webSettings = wV.getSettings();
        wV.setWebViewClient(new MyWebViewClient());
    }

    public void clicked(View view)
    {
        String st = eT.getText().toString();
        wV.loadUrl(st);
    }

    private class MyWebViewClient extends WebViewClient
    {
        public boolean shouldOverideUrlLoading(WebView view, String url)
        {
            view.loadUrl(url);
            return true;
        }
    }

}



