package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity41m extends AppCompatActivity implements View.OnClickListener {
    private Button btntui, btnpang;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity41m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btntui.setOnClickListener(this);
        btnpang.setOnClickListener(this);
    }

    private void initiawidget() {
        btntui = (Button) findViewById(R.id.btntui);
        btnpang = (Button) findViewById(R.id.btnpang);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btntui:
                douLatitude = 13.678410;
                douLongtitude = 99.893747;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnpang:
                douLatitude = 13.683846;
                douLongtitude = 99.880457;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity41m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Mainclass
