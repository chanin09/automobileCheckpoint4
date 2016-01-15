package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity24m extends AppCompatActivity implements View.OnClickListener {
    private Button btnwinai, btnkiti;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity24m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnwinai.setOnClickListener(this);
        btnkiti.setOnClickListener(this);
    }

    private void initiawidget() {
        btnwinai = (Button) findViewById(R.id.btnwinai);
        btnkiti = (Button) findViewById(R.id.btnkiti);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnwinai:
                douLatitude = 13.533641;
                douLongtitude = 99.866128;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnkiti:
                douLatitude = 13.533576;
                douLongtitude = 99.896893;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;

        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity24m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}
