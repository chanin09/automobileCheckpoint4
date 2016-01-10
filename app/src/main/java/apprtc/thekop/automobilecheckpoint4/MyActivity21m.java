package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity21m extends AppCompatActivity implements View.OnClickListener {
    private Button btnsuem;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity21m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnsuem.setOnClickListener(this);
    }

    private void initiawidget() {
        btnsuem = (Button) findViewById(R.id.btnsuem);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnsuem:
                douLatitude = 13.607645;
                douLongtitude = 99.849344;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity21m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Main class
