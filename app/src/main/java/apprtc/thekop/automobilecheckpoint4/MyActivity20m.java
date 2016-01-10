package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity20m extends AppCompatActivity implements View.OnClickListener {
    private Button btnchaiyut, btntor, btnkaew, btnsin, btntrue, btnyod, btnpichit, btnsor, btnchaij;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity20m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnchaiyut.setOnClickListener(this);
        btnyod.setOnClickListener(this);
        btnchaij.setOnClickListener(this);
        btnkaew.setOnClickListener(this);
        btnpichit.setOnClickListener(this);
        btntor.setOnClickListener(this);
        btnsin.setOnClickListener(this);
        btntrue.setOnClickListener(this);
        btnsor.setOnClickListener(this);
    }

    private void initiawidget() {
        btntor = (Button) findViewById(R.id.btntor);
        btnchaiyut = (Button) findViewById(R.id.btnchaiyut);
        btnyod = (Button) findViewById(R.id.btnyod);
        btnchaij = (Button) findViewById(R.id.btnchaij);
        btnkaew = (Button) findViewById(R.id.btnkaew);
        btnpichit = (Button) findViewById(R.id.btnpichit);
        btnsin = (Button) findViewById(R.id.btnsin);
        btntrue = (Button) findViewById(R.id.btntrue);
        btnsor = (Button) findViewById(R.id.btnsor);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnchaiyut:
                douLatitude = 13.559591;
                douLongtitude = 99.829029;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntor:
                douLatitude = 13.552069;
                douLongtitude = 99.825039;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnkaew:
                douLatitude = 13.557741;
                douLongtitude = 99.830769;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnsin:
                douLatitude = 13.559532;
                douLongtitude = 99.829690;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntrue:
                douLatitude = 13.551869;
                douLongtitude = 99.823956;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnyod:
                douLatitude = 13.552661;
                douLongtitude = 99.824638;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnpichit:
                douLatitude = 13.578930;
                douLongtitude = 99.831346;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnsor:
                douLatitude = 13.553806;
                douLongtitude = 99.825145;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnchaij:
                douLatitude = 13.551590;
                douLongtitude = 99.821929;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity20m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Mainclass
