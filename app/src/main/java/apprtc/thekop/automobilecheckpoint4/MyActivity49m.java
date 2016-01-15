package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity49m extends AppCompatActivity implements View.OnClickListener{
    private Button btnchaiwat,btnratkan;
    private double douLatitude, douLongtitude;
    private String strNameCity[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity49m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnchaiwat.setOnClickListener(this);
        btnratkan.setOnClickListener(this);
    }

    private void initiawidget() {
        btnchaiwat = (Button) findViewById(R.id.btnchaiwat);
        btnratkan = (Button) findViewById(R.id.btnratkan);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnratkan:
                douLatitude = 13.660460;
                douLongtitude = 99.761870;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnchaiwat:
                douLatitude = 13.637894;
                douLongtitude = 99.755410;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity49m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}
