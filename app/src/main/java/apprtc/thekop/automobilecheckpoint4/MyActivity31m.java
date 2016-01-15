package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity31m extends AppCompatActivity implements View.OnClickListener {
    private Button btnbig, btnchai, btntawe, btnsorsom, btnsem;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity31m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnbig.setOnClickListener(this);
        btnchai.setOnClickListener(this);
        btntawe.setOnClickListener(this);
        btnsorsom.setOnClickListener(this);
        btnsem.setOnClickListener(this);
    }

    private void initiawidget() {
        btnbig = (Button) findViewById(R.id.btnbig);
        btnchai = (Button) findViewById(R.id.btnchai);
        btntawe = (Button) findViewById(R.id.btntawe);
        btnsorsom = (Button) findViewById(R.id.btnsorsom);
        btnsem = (Button) findViewById(R.id.btnsem);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnbig:
                douLatitude = 13.539339;
                douLongtitude = 99.965965;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnchai:
                douLatitude = 13.538623;
                douLongtitude = 99.963873;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btntawe:
                douLatitude = 13.536627;
                douLongtitude = 99.964571;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnsorsom:
                douLatitude = 13.538961;
                douLongtitude = 99.964228;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnsem:
                douLatitude = 13.550437;
                douLongtitude = 99.967559;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;

        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity31m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Mainclass
