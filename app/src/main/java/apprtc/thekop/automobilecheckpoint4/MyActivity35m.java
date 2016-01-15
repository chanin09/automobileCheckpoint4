package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity35m extends AppCompatActivity implements View.OnClickListener {
    private Button btnrat, btnsurin, btns, btnpeng, btnwut, btnsomb;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity35m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnrat.setOnClickListener(this);
        btnsurin.setOnClickListener(this);
        btns.setOnClickListener(this);
        btnpeng.setOnClickListener(this);
        btnwut.setOnClickListener(this);
        btnsomb.setOnClickListener(this);
    }

    private void initiawidget() {
        btnrat = (Button) findViewById(R.id.btnrat);
        btnsurin = (Button) findViewById(R.id.btnsurin);
        btns = (Button) findViewById(R.id.btns);
        btnpeng = (Button) findViewById(R.id.btnpeng);
        btnwut = (Button) findViewById(R.id.btnwut);
        btnsomb = (Button) findViewById(R.id.btnsomb);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnrat:
                douLatitude = 13.588268;
                douLongtitude = 99.964872;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnsurin:
                douLatitude = 13.593132;
                douLongtitude = 99.963398;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btns:
                douLatitude = 13.558973;
                douLongtitude = 99.968504;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnpeng:
                douLatitude = 13.601043;
                douLongtitude = 99.960415;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnwut:
                douLatitude = 13.566489;
                douLongtitude = 99.970175;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnsomb:
                douLatitude = 13.562810;
                douLongtitude = 99.969482;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;

        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity35m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));


    }
}//mainclass
