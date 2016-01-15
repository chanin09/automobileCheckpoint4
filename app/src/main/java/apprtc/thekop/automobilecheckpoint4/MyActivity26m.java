package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity26m extends AppCompatActivity implements View.OnClickListener {
    private Button btnsomsuk,btnwog,btnbun,btncod,btnwat,btndt;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity26m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnsomsuk.setOnClickListener(this);
        btnwog.setOnClickListener(this);
        btnwat.setOnClickListener(this);
        btncod.setOnClickListener(this);
        btnbun.setOnClickListener(this);
        btndt.setOnClickListener(this);

    }

    private void initiawidget() {
        btnsomsuk = (Button) findViewById(R.id.btnsomsuk);
        btnwog = (Button) findViewById(R.id.btnwog);
        btnwat = (Button) findViewById(R.id.btnwat);
        btncod = (Button) findViewById(R.id.btncod);
        btnbun = (Button) findViewById(R.id.btnbun);
        btndt = (Button) findViewById(R.id.btndt);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnsomsuk:
                douLatitude = 13.519720;
                douLongtitude = 99.971992;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnwog:
                douLatitude = 13.522128;
                douLongtitude = 99.963796;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnbun:
                douLatitude = 13.521935;
                douLongtitude = 99.966188;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btncod:
                douLatitude = 13.521946;
                douLongtitude = 99.965038;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnwat:
                douLatitude = 13.525131;
                douLongtitude = 99.969693;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btndt:
                douLatitude = 13.521748;
                douLongtitude = 99.966911;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;

        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity26m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Mainclass

