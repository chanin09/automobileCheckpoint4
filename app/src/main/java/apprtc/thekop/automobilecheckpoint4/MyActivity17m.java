package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static apprtc.thekop.automobilecheckpoint4.R.id.btnbun;

public class MyActivity17m extends AppCompatActivity implements View.OnClickListener {
    private Button btnpatib, btnbel;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity17m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnpatib.setOnClickListener(this);
        btnbel.setOnClickListener(this);
    }

    private void initiawidget() {
        btnbel = (Button) findViewById(R.id.btnbel);
        btnpatib = (Button) findViewById(R.id.btnpatib);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnpatib:
                douLatitude = 13.522763;
                douLongtitude = 99.767309;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnbel:
                douLatitude = 13.510659;
                douLongtitude = 99.720968;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity17m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}
