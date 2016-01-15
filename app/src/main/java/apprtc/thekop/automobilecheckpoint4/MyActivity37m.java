package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity37m extends AppCompatActivity implements View.OnClickListener {
    private Button btnnamp, btnchai, btnrin, btnporn;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity37m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnnamp.setOnClickListener(this);
        btnchai.setOnClickListener(this);
        btnrin.setOnClickListener(this);
        btnporn.setOnClickListener(this);
    }

    private void initiawidget() {
        btnnamp = (Button) findViewById(R.id.btnnamp);
        btnchai = (Button) findViewById(R.id.btnchai);
        btnrin = (Button) findViewById(R.id.btnrin);
        btnporn = (Button) findViewById(R.id.btnporn);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnnamp:
                douLatitude = 13.758453;
                douLongtitude = 99.925733;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnchai:
                douLatitude = 13.755334;
                douLongtitude = 99.915944;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnrin:
                douLatitude = 13.760987;
                douLongtitude = 99.927679;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnporn:
                douLatitude = 13.759615;
                douLongtitude = 99.914758;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity37m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));


    }
}//Mainclass
