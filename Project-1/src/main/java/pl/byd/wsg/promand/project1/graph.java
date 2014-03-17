package pl.byd.wsg.promand.project1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.EditText;

import java.security.Provider;


public class graph extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        String graphURL;
        EditText buildTxt1 = (EditText) findViewById(R.id.txtBuild1);
        String pavadinimas1 = buildTxt1.toString();
        //InputMethodManager imm = (InputMethodManager)this.getSystemService(INPUT_METHOD_SERVICE);



        graphURL = "https://chart.googleapis.com/chart?cht=p3&chd=t:60,40&chs=250x100&chl=Building1|Building2";
        Log.v("graphURL :",graphURL);
        WebView webview = (WebView) findViewById(R.id.webView1);
       // webview.loadUrl("file:///assert/graphic.htm");
        webview.loadUrl(graphURL);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.graph, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
