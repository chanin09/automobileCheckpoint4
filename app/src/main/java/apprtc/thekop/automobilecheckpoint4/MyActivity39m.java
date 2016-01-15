package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity39m extends AppCompatActivity implements View.OnClickListener {
    private Button btnnpa, btnyang, btntor, btntik, btnchok, btnkor, btnpasit,btnpt;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity39m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnnpa.setOnClickListener(this);
        btnyang.setOnClickListener(this);
        btntor.setOnClickListener(this);
        btntik.setOnClickListener(this);
        btnchok.setOnClickListener(this);
        btnkor.setOnClickListener(this);
        btnpasit.setOnClickListener(this);
        btnpt.setOnClickListener(this);

    }

    private void initiawidget() {
        btnnpa = (Button) findViewById(R.id.btnnpa);
        btnyang = (Button) findViewById(R.id.btnyang);
        btntor = (Button) findViewById(R.id.btntor);
        btntik = (Button) findViewById(R.id.btntik);
        btnchok = (Button) findViewById(R.id.btnchok);
        btnkor = (Button) findViewById(R.id.btnkor);
        btnpasit = (Button) findViewById(R.id.btnpasit);
        btnpt = (Button) findViewById(R.id.btnpt);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnnpa:
                douLatitude = 13.702127;
                douLongtitude = 99.869943;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnyang:
                douLatitude = 13.702967;
                douLongtitude = 99.874919;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnpt:
                douLatitude = 13.703636;
                douLongtitude = 99.877710;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntor:
                douLatitude = 13.705711;
                douLongtitude = 99.886998;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnchok:
                douLatitude = 13.712101;
                douLongtitude = 99.891938;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnkor:
                douLatitude = 13.706325;
                douLongtitude = 99.893573;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnpasit:
                douLatitude = 13.721425;
                douLongtitude = 99.884914;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntik:
                douLatitude = 13.705748;
                douLongtitude = 99.889473;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity39m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Mainclass
