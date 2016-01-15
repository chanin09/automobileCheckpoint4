package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity48m extends AppCompatActivity implements View.OnClickListener{
    private Button btnaumnaj,btnrat,btncok,btnton,btnso,btnrung;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity48m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnaumnaj.setOnClickListener(this);
        btnrung.setOnClickListener(this);
        btnrat.setOnClickListener(this);
        btnso.setOnClickListener(this);
        btnton.setOnClickListener(this);
        btncok.setOnClickListener(this);
    }

    private void initiawidget() {
        btnaumnaj = (Button) findViewById(R.id.btnaumnaj);
        btnrat = (Button) findViewById(R.id.btnrat);
        btncok = (Button) findViewById(R.id.btncok);
        btnton = (Button) findViewById(R.id.btnton);
        btnso = (Button) findViewById(R.id.btnso);
        btnrung = (Button) findViewById(R.id.btnrung);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnaumnaj:
                douLatitude = 13.684815;
                douLongtitude = 99.762015;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnrat:
                douLatitude = 13.708243;
                douLongtitude = 99.766964;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btncok:
                douLatitude = 13.693128;
                douLongtitude = 99.762927;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnton:
                douLatitude = 13.694946;
                douLongtitude = 99.762604;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnso:
                douLatitude = 13.705796;
                douLongtitude = 99.766012;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnrung:
                douLatitude = 13.714023;
                douLongtitude = 99.768722;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity48m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Mainclass
