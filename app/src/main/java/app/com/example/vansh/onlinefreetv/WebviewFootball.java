package app.com.example.vansh.onlinefreetv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by vansh on 22-Feb-16.
 */
public class WebviewFootball extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.football_webview);
        WebView web=(WebView)findViewById(R.id.webView1);
        web.loadUrl("http://onlinefreetv.org/cricket/link1.php");
        Intent it1=getIntent();

    }
}
