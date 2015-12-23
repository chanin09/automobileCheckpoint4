package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity extends AppCompatActivity implements View.OnClickListener{

    //declarting Variable
    private Button btnRatchaburi,btnBangkok,btnKhonkaen;
    private double douLatitude, douLongtitude;
    private  String strNameCity[];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //Initial Widget
        initiaWidget();

        //About Setonclick button
        btnRatchaburi.setOnClickListener(this);
        btnBangkok.setOnClickListener(this);
        btnKhonkaen.setOnClickListener(this);
    }//On Create

    private void initiaWidget() {
        btnRatchaburi = (Button) findViewById(R.id.btnRatchaburi);
        btnBangkok = (Button) findViewById(R.id.btnBangkok);
        btnKhonkaen = (Button) findViewById(R.id.btnKhonkaen);
        //initiaWidget




    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnRatchaburi:
                douLatitude = 13.52877;
                douLongtitude = 99.81330;
                strNameCity = getResources().getStringArray(R.array.ratchaburi_city);
                break;

            case R.id.btnBangkok:
                douLatitude = 13.75666;
                douLongtitude = 100.50187;
                strNameCity = getResources().getStringArray(R.array.bangkok_city);
                break;

            case R.id.btnKhonkaen:
                douLatitude = 16.44235;
                douLongtitude = 102.83611;
                strNameCity = getResources().getStringArray(R.array.khonkaen_city);

                break;

            default:
                break;
        }//switch

        //Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude", douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);

        startActivity(objIntent);
        Log.d("ThreeCity", "Lat == " + Double.toString(douLatitude));




    }//onClick

}//main class
