package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity13m extends AppCompatActivity implements View.OnClickListener{
    private Button btnrat,btnsuwit,btnsri,btnwisut;
    private double douLatitude,douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity13m);


        //Initial Widget
        initiawidget();
        //about SetOnclick button
        btnsri.setOnClickListener(this);
        btnrat.setOnClickListener(this);
        btnsuwit.setOnClickListener(this);
        btnwisut.setOnClickListener(this);


    }//On create

    private void initiawidget() {
        btnrat = (Button) findViewById(R.id.btnrat);
        btnsuwit = (Button) findViewById(R.id.btnsuwit);
        btnsri = (Button) findViewById(R.id.btnsri);
        btnwisut = (Button) findViewById(R.id.btnwisut);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnrat:
                douLatitude = 13.533244;
                douLongtitude = 99.806202;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnsri:
                douLatitude = 13.527383;
                douLongtitude = 99.796013;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnsuwit:
                douLatitude = 13.550281;
                douLongtitude = 99.816687;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnwisut:
                douLatitude = 13.531352;
                douLongtitude = 99.803826;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            default:
                break;
        }//switch
         // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity13m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));
    }
}//main Class
