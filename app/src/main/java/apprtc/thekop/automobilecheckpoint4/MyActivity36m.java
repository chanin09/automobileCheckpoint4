package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity36m extends AppCompatActivity implements View.OnClickListener {
    private Button btnst, btnpan, btnake, btnwad, btny;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity36m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btny.setOnClickListener(this);
        btnwad.setOnClickListener(this);
        btnst.setOnClickListener(this);
        btnake.setOnClickListener(this);
        btnpan.setOnClickListener(this);
    }

    private void initiawidget() {
        btny = (Button) findViewById(R.id.btny);
        btnwad = (Button) findViewById(R.id.btnwad);
        btnst = (Button) findViewById(R.id.btnst);
        btnake = (Button) findViewById(R.id.btnake);
        btnpan = (Button) findViewById(R.id.btnpan);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnst:
                douLatitude = 13.702080;
                douLongtitude = 99.857109;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnpan:
                douLatitude = 13.702020;
                douLongtitude = 99.857550;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnake:
                douLatitude = 13.688545;
                douLongtitude = 99.857199;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnwad:
                douLatitude = 13.701715;
                douLongtitude = 99.852085;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btny:
                douLatitude = 13.689252;
                douLongtitude = 99.842468;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity36m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));


    }
}//Mainclass
