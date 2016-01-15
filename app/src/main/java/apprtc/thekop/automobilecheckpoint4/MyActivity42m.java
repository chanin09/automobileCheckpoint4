package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity42m extends AppCompatActivity implements View.OnClickListener {
    private Button btnchokbun, btnjaren, btntung, btnbear, btnkoson, btnp;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity42m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnchokbun.setOnClickListener(this);
        btnjaren.setOnClickListener(this);
        btntung.setOnClickListener(this);
        btnbear.setOnClickListener(this);
        btnkoson.setOnClickListener(this);
        btnp.setOnClickListener(this);
    }

    private void initiawidget() {
        btnchokbun = (Button) findViewById(R.id.btnchokbun);
        btnjaren = (Button) findViewById(R.id.btnjaren);
        btntung = (Button) findViewById(R.id.btntung);
        btnbear = (Button) findViewById(R.id.btnbear);
        btnkoson = (Button) findViewById(R.id.btnkoson);
        btnp = (Button) findViewById(R.id.btnp);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnchokbun:
                douLatitude = 13.653017;
                douLongtitude = 99.861049;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnjaren:
                douLatitude = 13.653225;
                douLongtitude = 99.861254;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntung:
                douLatitude = 13.655435;
                douLongtitude = 99.863457;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnbear:
                douLatitude = 13.657500;
                douLongtitude = 99.865475;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnkoson:
                douLatitude = 13.662611;
                douLongtitude = 99.869793;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnp:
                douLatitude = 13.668784;
                douLongtitude = 99.872992;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity42m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

   }
}//Mainclass
