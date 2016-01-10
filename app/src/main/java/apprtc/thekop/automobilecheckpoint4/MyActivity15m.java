package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity15m extends AppCompatActivity implements View.OnClickListener {
    private Button btnsaoha,btnchag,btnopas,btnpt,btntanut,btntana,btntong;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity15m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnsaoha.setOnClickListener(this);
        btnchag.setOnClickListener(this);
        btnopas.setOnClickListener(this);
        btnpt.setOnClickListener(this);
        btntana.setOnClickListener(this);
        btntanut.setOnClickListener(this);
        btntong.setOnClickListener(this);

    }

    private void initiawidget() {
        btnsaoha = (Button) findViewById(R.id.btnsaoha);
        btnopas = (Button) findViewById(R.id.btnopas);
        btntanut = (Button) findViewById(R.id.btntanut);
        btnchag = (Button) findViewById(R.id.btnchag);
        btnpt = (Button) findViewById(R.id.btnpt);
        btntana = (Button) findViewById(R.id.btntana);
        btntong = (Button) findViewById(R.id.btntong);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnsaoha:
                douLatitude = 13.525041;
                douLongtitude = 99.792092;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnopas:
                douLatitude = 13.524170;
                douLongtitude = 99.791653;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnchag:
                douLatitude = 13.523507;
                douLongtitude = 99.790811;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnpt:
                douLatitude = 13.518834;
                douLongtitude = 99.789746;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntana:
                douLatitude = 13.523428;
                douLongtitude = 99.790901;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntanut:
                douLatitude = 13.523616;
                douLongtitude = 99.790866;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntong:
                douLatitude = 13.523581;
                douLongtitude = 99.790799;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity15m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//main class