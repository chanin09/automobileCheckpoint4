package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity33m extends AppCompatActivity implements View.OnClickListener {
    private Button btnone, btnnum;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity33m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnnum.setOnClickListener(this);
        btnone.setOnClickListener(this);
    }

    private void initiawidget() {
        btnnum = (Button) findViewById(R.id.btnnum);
        btnone = (Button) findViewById(R.id.btnone);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnnum:
                douLatitude = 13.548069;
                douLongtitude = 100.024055;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnone:
                douLatitude = 13.546518;
                douLongtitude = 100.019119;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity33m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Mainclass
