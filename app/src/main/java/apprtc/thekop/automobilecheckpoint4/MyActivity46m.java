package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity46m extends AppCompatActivity implements View.OnClickListener {
    private Button btnsijared, btnnhong, btnaodd;
    private double douLatitude, douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity46m);
        //initiawidget
        initiawidget();
        //about SetOnclick button
        btnnhong.setOnClickListener(this);
        btnsijared.setOnClickListener(this);
        btnaodd.setOnClickListener(this);
    }

    private void initiawidget() {
        btnnhong = (Button) findViewById(R.id.btnnhong);
        btnsijared = (Button) findViewById(R.id.btnsijared);
        btnaodd = (Button) findViewById(R.id.btnaodd);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnnhong:
                douLatitude = 13.694217;
                douLongtitude = 99.835696;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnaodd:
                douLatitude = 13.700544;
                douLongtitude = 99.740234;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnsijared:
                douLatitude = 13.692651;
                douLongtitude = 99.824737;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;

        }
        // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity46m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));

    }
}//Mainclass