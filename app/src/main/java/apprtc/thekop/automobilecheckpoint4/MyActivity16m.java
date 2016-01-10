package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity16m extends AppCompatActivity implements View.OnClickListener {
    private Button btnrim, btnpisan;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity16m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnrim.setOnClickListener(this);
        btnpisan.setOnClickListener(this);
    }

    private void initiawidget() {
        btnpisan = (Button) findViewById(R.id.btnpisan);
        btnrim = (Button) findViewById(R.id.btnrim);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnrim:
                douLatitude = 13.542615;
                douLongtitude = 99.844290;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnpisan:
                douLatitude = 13.544285;
                douLongtitude = 99.830138;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity16m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));
    }
}