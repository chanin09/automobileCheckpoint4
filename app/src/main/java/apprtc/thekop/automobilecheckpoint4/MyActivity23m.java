package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity23m extends AppCompatActivity implements View.OnClickListener{
    private Button btnbanglan,btnwiriya;
    private double douLatitude, douLongtitude;
    private String strNameCity[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity23m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnbanglan.setOnClickListener(this);
        btnwiriya.setOnClickListener(this);
    }

    private void initiawidget() {
        btnwiriya = (Button) findViewById(R.id.btnwiriya);
        btnbanglan = (Button) findViewById(R.id.btnbanglan);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnwiriya:
                douLatitude = 13.550745;
                douLongtitude = 99.814453;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnbanglan:
                douLatitude = 13.574370;
                douLongtitude = 99.816471;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;

        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity23m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}
