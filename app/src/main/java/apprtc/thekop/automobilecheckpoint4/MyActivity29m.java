package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity29m extends AppCompatActivity implements View.OnClickListener {
    private Button btnview, btnying;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity29m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnying.setOnClickListener(this);
        btnview.setOnClickListener(this);
    }

    private void initiawidget() {
        btnying = (Button) findViewById(R.id.btnying);
        btnview = (Button) findViewById(R.id.btnview);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnying:
                douLatitude = 13.621699;
                douLongtitude = 99.919510;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnview:
                douLatitude = 13.627604;
                douLongtitude = 99.920051;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;

        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity29m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//mainclass
