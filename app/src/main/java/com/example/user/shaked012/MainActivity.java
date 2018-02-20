package com.example.user.shaked012;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    WebView we;
    EditText e,w,q;
    double a, b, c;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn=(Button) findViewById(R.id.shakes);
       we=(WebView)  findViewById(R.id.shked);
       e=(EditText) findViewById(R.id.Aas);
       w=(EditText)findViewById(R.id.Bas);
       q=(EditText) findViewById(R.id.Cas);
        we.getSettings().setJavaScriptEnabled(true);

        we.setWebViewClient(new MyWebViewClient());
    }
    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
    public void shk(View view){
        String st1 = e.getText().toString();
        a = Double.parseDouble(st1);
        String st2 = w.getText().toString();
        b = Double.parseDouble(st2);
        String st3 = q.getText().toString();
        c = Double.parseDouble(st3);
        if (a == 0) {
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
        } else {
            String st = "https://www.google.co.il/search?q=";
            st = st + a + "x%5E2%2B" + b + "x%2B" + c;
            we.loadUrl(st);}


    }


}
