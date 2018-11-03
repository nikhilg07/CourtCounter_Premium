package com.example.hppc.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String data= getIntent().getStringExtra("KEY");
        Toast.makeText(Main2Activity.this,""+data,Toast.LENGTH_SHORT).show();
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("https://www.cbse.nic.in");
    }

}
