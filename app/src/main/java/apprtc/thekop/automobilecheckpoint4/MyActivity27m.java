package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity27m extends AppCompatActivity implements View.OnClickListener {
    private Button btnx, btnone;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity27m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnx.setOnClickListener(this);
        btnone.setOnClickListener(this);

    }

    private void initiawidget() {
        btnx = (Button) findViewById(R.id.btnx);
        btnone = (Button) findViewById(R.id.btnone);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnx:
                douLatitude = 13.601612;
                douLongtitude = 100.019198;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnone:
                douLatitude = 13.598153;
                douLongtitude = 100.025461;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;

            default:
                break;

        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity27m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//mainclass
