package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity38m extends AppCompatActivity implements View.OnClickListener {
    private Button btnsuwan, btntawe, btnstam, btnkom, btnnongpo, btnaod, btntap, btntave;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity38m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnsuwan.setOnClickListener(this);
        btntawe.setOnClickListener(this);
        btnstam.setOnClickListener(this);
        btnkom.setOnClickListener(this);
        btnnongpo.setOnClickListener(this);
        btnaod.setOnClickListener(this);
        btntap.setOnClickListener(this);
        btntave.setOnClickListener(this);
    }

    private void initiawidget() {
        btnsuwan = (Button) findViewById(R.id.btnsuwan);
        btntawe = (Button) findViewById(R.id.btntawe);
        btnstam = (Button) findViewById(R.id.btnstam);
        btnkom = (Button) findViewById(R.id.btnkom);
        btnnongpo = (Button) findViewById(R.id.btnnongpo);
        btnaod = (Button) findViewById(R.id.btnaod);
        btntap = (Button) findViewById(R.id.btntap);
        btntave = (Button) findViewById(R.id.btntave);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnsuwan:
                douLatitude = 13.748560;
                douLongtitude = 99.921622;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntawe:
                douLatitude = 13.690107;
                douLongtitude = 99.884867;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnstam:
                douLatitude = 13.736731;
                douLongtitude = 99.913032;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnkom:
                douLatitude = 13.734108;
                douLongtitude = 99.910741;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnnongpo:
                douLatitude = 13.752359;
                douLongtitude = 99.922823;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnaod:
                douLatitude = 13.736396;
                douLongtitude = 99.913481;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntap:
                douLatitude = 13.737373;
                douLongtitude = 99.914554;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntave:
                douLatitude = 13.737465;
                douLongtitude = 9.913651;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity38m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Mainclass
