package pl.byd.wsg.promand.project1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
    Button btnGraph,btnReport;
    //TextView conText = (TextView) findViewById(R.id.txtConStatus);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGraph = (Button) findViewById(R.id.graphsOfBothBtn);
        btnReport = (Button) findViewById(R.id.reportsOfBothBtn);
        ///////////////////////////////////////BUTTONS
        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //button click
                Intent i = new Intent(MainActivity.this,Report.class);
                startActivity(i);
            }
        });
        btnGraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Graph.class);
                startActivity(i);
            }
        });
        /////// END OF BUTTONS
     //   isConnectedStatus(isNetworkAvailable());
    }
//    private void isConnectedStatus(boolean con){
//        if(con == true){
//            conText.setText("Connected");
//            conText.setTextColor(Color.GREEN);
//        } else {
//            conText.setText("No internet connection");
//            conText.setTextColor(Color.RED);
//        }
//    }
//    private boolean isNetworkAvailable(){
//        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
//        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
//    }

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
        return id == R.id.action_settings || super.onOptionsItemSelected(item);

    }


}
