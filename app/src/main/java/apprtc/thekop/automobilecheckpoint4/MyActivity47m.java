package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity47m extends AppCompatActivity implements View.OnClickListener {
    private Button btnaodjared, btnma, btnrin;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity47m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnaodjared.setOnClickListener(this);
        btnrin.setOnClickListener(this);
        btnma.setOnClickListener(this);
    }

    private void initiawidget() {
        btnaodjared = (Button) findViewById(R.id.btnaodjared);
        btnrin = (Button) findViewById(R.id.btnrin);
        btnma = (Button) findViewById(R.id.btnma);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnma:
                douLatitude = 13.720772;
                douLongtitude = 99.778961;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnrin:
                douLatitude = 13.721567;
                douLongtitude = 99.788470;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnaodjared:
                douLatitude = 13.718493;
                douLongtitude = 99.773890;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity47m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Mainclass
