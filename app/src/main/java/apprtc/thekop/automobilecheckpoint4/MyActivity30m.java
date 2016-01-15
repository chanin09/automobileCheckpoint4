package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity30m extends AppCompatActivity implements View.OnClickListener {
    private Button btnpecha;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity30m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnpecha.setOnClickListener(this);
    }

    private void initiawidget() {
        btnpecha = (Button) findViewById(R.id.btnpecha);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnpecha:
                douLatitude = 13.552079;
                douLongtitude = 99.930553;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            default:
                break;
        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity30m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));


    }
}//Mainclass
