package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity43m extends AppCompatActivity implements View.OnClickListener {
    private Button btnpatta, btnpit, btnned;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity43m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnpit.setOnClickListener(this);
        btnned.setOnClickListener(this);
        btnpatta.setOnClickListener(this);
    }

    private void initiawidget() {
        btnpit = (Button) findViewById(R.id.btnpit);
        btnned = (Button) findViewById(R.id.btnned);
        btnpatta = (Button) findViewById(R.id.btnpatta);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnpit:
                douLatitude = 13.629035;
                douLongtitude = 99.847051;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnned:
                douLatitude = 13.631745;
                douLongtitude = 99.848547;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnpatta:
                douLatitude = 13.634573;
                douLongtitude = 99.850319;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity43m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));


    }
}//Mainclass
