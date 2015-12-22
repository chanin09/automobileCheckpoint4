package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MyActivity extends AppCompatActivity implements View.OnClickListener{

    //declarting Variable
    private Button btnRatchaburi,btnBangkok,btnKhonkaen;
    private double douLatitude, douLongtitude;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        //Initial Widget
        initiaWidget();
        //About Setonclick button
        btnRatchaburi.setOnClickListener(this);
        btnBangkok.setOnClickListener(this);
        btnKhonkaen.setOnClickListener(this);
    }//On Create

    private void initiaWidget() {
        btnRatchaburi = (Button) findViewById(R.id.btnRatchaburi);
        btnBangkok = (Button) findViewById(R.id.btnBangkok);
        btnKhonkaen = (Button) findViewById(R.id.btnKhonkaen);
        //initiaWidget




    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnRatchaburi:
                douLatitude = 13.52877;
                douLongtitude = 99.81330;
                break;
            case R.id.btnBangkok:
                douLatitude = 13.52877;
                douLongtitude = 99.81330;
                break;
            case R.id.btnKhonkaen:
                douLatitude = 16.44235;
                douLongtitude = 102.83611;
                break;
            default:
                break;

        }//switch
        //Inten & Put Valre to ShowMapACtivity
        Intent objIntent = new Intent(MyActivity.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude", douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        startActivity(objIntent);
    }//onClick
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {}
}//main class
