package app.com.example.vansh.onlinefreetv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by vansh on 11-Feb-16.
 */
public class WebviewCricket extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cricket_webview);
        WebView web=(WebView)findViewById(R.id.webView);
        web.loadUrl("http://onlinefreetv.org/sky-sports-cricket.php");
        Intent it1=getIntent();

    }
}
