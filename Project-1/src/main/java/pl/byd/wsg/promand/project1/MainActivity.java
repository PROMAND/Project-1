package pl.byd.wsg.promand.project1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.R.menu;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.net.NetworkInterface;

public class MainActivity extends ActionBarActivity {
    Button button1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.graphsOfBothBtn);
        btn2 = (Button) findViewById(R.id.reportsOfBothBtn);
        connectionState();



    }
    public void connectionState(){
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressLoadingThing);
        if(isNetworkConnected() == true){ // if we have connection
            progressBar.setVisibility(View.GONE);
        } else {
           // Toast toast = Toast.makeText()
        }
    }
    private boolean isNetworkConnected(){
        ConnectivityManager con = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo ni = con.getActiveNetworkInfo();
        if(ni == null){
            // there is no connection
            return false;
        }else{
            return true;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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


    public void openChart() {
        Intent i = new Intent(MainActivity.this,graphBoth.class);
        startActivity(i);
    }

    public void openReport() {
        Intent i = new Intent(MainActivity.this, reportOfBoth.class);
        startActivity(i);
    }
}
