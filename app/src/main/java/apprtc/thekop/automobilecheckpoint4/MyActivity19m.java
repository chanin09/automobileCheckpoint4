package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity19m extends AppCompatActivity implements View.OnClickListener {
    private Button btnpor, btnban;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity19m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnpor.setOnClickListener(this);
        btnban.setOnClickListener(this);
    }

    private void initiawidget() {
        btnban = (Button) findViewById(R.id.btnban);
        btnpor = (Button) findViewById(R.id.btnpor);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnpor:
                douLatitude = 13.475558;
                douLongtitude = 99.795419;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnban:
                douLatitude = 13.488858;
                douLongtitude = 99.794438;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;

            default:
                break;

        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity19m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }

}//mainclass
