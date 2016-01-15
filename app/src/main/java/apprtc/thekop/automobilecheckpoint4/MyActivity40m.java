package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity40m extends AppCompatActivity implements View.OnClickListener {
    private Button btnkovit, btnhai, btnsan;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity40m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnkovit.setOnClickListener(this);
        btnhai.setOnClickListener(this);
        btnsan.setOnClickListener(this);
    }

    private void initiawidget() {
        btnkovit = (Button) findViewById(R.id.btnkovit);
        btnhai = (Button) findViewById(R.id.btnhai);
        btnsan = (Button) findViewById(R.id.btnsan);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnkovit:
                douLatitude = 13.701905;
                douLongtitude = 99.865893;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnhai:
                douLatitude = 13.702214;
                douLongtitude = 99.867219;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnsan:
                douLatitude = 13.701836;
                douLongtitude = 99.867406;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity40m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));


    }
}//Mainclass
