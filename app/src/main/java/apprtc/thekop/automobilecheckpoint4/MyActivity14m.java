package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity14m extends AppCompatActivity implements View.OnClickListener{
    private Button btnbawon,btnsunton,btnchom,btnsucan,btntp,btnsukh
            ,btntira,btnbun,btnhoj,btnbunca,btnpud,btnpet;
    private double douLatitude,douLongtitude;
    private String strNameCity[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity14m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnbawon.setOnClickListener(this);
        btnbun.setOnClickListener(this);
        btnbunca.setOnClickListener(this);
        btnchom.setOnClickListener(this);
        btnhoj.setOnClickListener(this);
        btnsunton.setOnClickListener(this);
        btnsucan.setOnClickListener(this);
        btntp.setOnClickListener(this);
        btnsukh.setOnClickListener(this);
        btntira.setOnClickListener(this);
        btnpud.setOnClickListener(this);
        btnpet.setOnClickListener(this);

    }

    private void initiawidget() {
        btnbawon = (Button) findViewById(R.id.btnbawon);
        btnsunton = (Button) findViewById(R.id.btnsunton);
        btnchom = (Button) findViewById(R.id.btnchom);
        btntp = (Button) findViewById(R.id.btntp);
        btnsucan = (Button) findViewById(R.id.btnsucan);
        btnsukh = (Button) findViewById(R.id.btnsukh);
        btntira = (Button) findViewById(R.id.btntira);
        btnbun = (Button) findViewById(R.id.btnbun);
        btnhoj = (Button) findViewById(R.id.btnhoj);
        btnbunca = (Button) findViewById(R.id.btnbunca);
        btnpud = (Button) findViewById(R.id.btnpud);
        btnpet = (Button) findViewById(R.id.btnpet);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnbawon:
                douLatitude = 13.547955;
                douLongtitude=99.807757;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnsunton:
                douLatitude = 13.534259;
                douLongtitude = 99.795402;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnchom:
                douLatitude = 13.542976;
                douLongtitude = 99.800389;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntp:
                douLatitude = 13.558062;
                douLongtitude = 99.782842;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnsucan:
                douLatitude = 13.534061;
                douLongtitude = 99.795717;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnsukh:
                douLatitude = 13.551556;
                douLongtitude = 99.788751;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntira:
                douLatitude = 13.527312;
                douLongtitude = 99.795126;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case  R.id.btnbun:
                douLatitude = 13.526097;
                douLongtitude = 99.792890;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnhoj:
                douLatitude = 13.527883;
                douLongtitude = 99.783850;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnbunca:
                douLatitude = 13.529994;
                douLongtitude = 99.793009;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnpud:
                douLatitude = 13.531337;
                douLongtitude =99.794245;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnpet:
                douLatitude =13.528884;
                douLongtitude = 99.792564;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }


        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity14m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));
    }
}//Main Class
