package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity45m extends AppCompatActivity implements View.OnClickListener {
    private Button btnsub, btnpct, btnchalong, btnphode, btnjared;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity45m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnsub.setOnClickListener(this);
        btnchalong.setOnClickListener(this);
        btnpct.setOnClickListener(this);
        btnphode.setOnClickListener(this);
        btnjared.setOnClickListener(this);
    }

    private void initiawidget() {
        btnsub = (Button) findViewById(R.id.btnsub);
        btnchalong = (Button) findViewById(R.id.btnchalong);
        btnpct = (Button) findViewById(R.id.btnpct);
        btnphode = (Button) findViewById(R.id.btnphode);
        btnjared = (Button) findViewById(R.id.btnjared);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnsub:
                douLatitude = 13.698318;
                douLongtitude = 99.844950;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnpct:
                douLatitude = 13.705060;
                douLongtitude = 99.846564;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnchalong:
                douLatitude = 13.706540;
                douLongtitude = 99.846334;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnphode:
                douLatitude = 13.706273;
                douLongtitude = 99.846719;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnjared:
                douLatitude = 13.706700;
                douLongtitude = 99.846312;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity45m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Mainclass
