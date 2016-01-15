package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity50m extends AppCompatActivity implements View.OnClickListener {
    private Button btnsomkid;
    private double douLatitude, douLongtitude;
    private String strNameCity[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity50m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnsomkid.setOnClickListener(this);

    }

    private void initiawidget() {
        btnsomkid = (Button) findViewById(R.id.btnsomkid);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnsomkid:
                douLatitude = 13.720198;
                douLongtitude = 99.665414;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
        }
    // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity50m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Mainclass
