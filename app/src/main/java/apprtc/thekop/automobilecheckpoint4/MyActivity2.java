package apprtc.thekop.automobilecheckpoint4;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


/**
 * Created by Namtoey on 25/12/2558.
 */
public class MyActivity2 extends AppCompatActivity implements View.OnClickListener{

    //declarting Variable
    private Button btnHoj,btnHi,btnChi,btnYod,btnTrue,btnTor,btnJinda,btnThai,btnSiam,
            btnWiroj,btnKiti,btnkaew,btnDesel,btnFive,btnChok,btnPanit,btnChom, btntanya;
    private double douLatitude, douLongtitude;
    ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my2);

        //Initial Widget
        initiaWidget();

        //About Setonclick button
        btnHoj.setOnClickListener(this);
        btnHi.setOnClickListener(this);
        btnDesel.setOnClickListener(this);
        btntanya.setOnClickListener(this);
        btnChi.setOnClickListener(this);
        btnYod.setOnClickListener(this);
        btnTrue.setOnClickListener(this);
        btnTor.setOnClickListener(this);
        btnJinda.setOnClickListener(this);
        btnThai.setOnClickListener(this);
        btnSiam.setOnClickListener(this);
        btnWiroj.setOnClickListener(this);
        btnKiti.setOnClickListener(this);
        btnkaew.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnChok.setOnClickListener(this);
        btnChom.setOnClickListener(this);
        btnPanit.setOnClickListener(this);


    }//On Create

    private void initiaWidget() {
        btnDesel = (Button) findViewById(R.id.btnDesel);
        btnYod = (Button) findViewById(R.id.btnYod);
        btnChok = (Button) findViewById(R.id.btnchok);
        btnChi = (Button) findViewById(R.id.btnChi);
        btnChom = (Button) findViewById(R.id.btnChom);
        btnKiti = (Button) findViewById(R.id.btnkiti);
        btntanya= (Button) findViewById(R.id.btnTanya);
        btnSiam = (Button) findViewById(R.id.btnSiam);
        btnWiroj = (Button) findViewById(R.id.btnWiroj);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnPanit = (Button) findViewById(R.id.btnPanit);
        btnThai = (Button) findViewById(R.id.btnThai);
        btnTrue = (Button) findViewById(R.id.btnTrue);
        btnHi = (Button) findViewById(R.id.btnHi);
        btnTor = (Button) findViewById(R.id.btnTor);
        btnJinda = (Button) findViewById(R.id.btnJinda);
        btnkaew = (Button) findViewById(R.id.btnkaew);
        btnHoj = (Button) findViewById(R.id.btnHoj);


    }



    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnHoj:
                douLatitude = 13.527883;
                douLongtitude = 99.783850;
                break;

            case R.id.btnHi:
                douLatitude = 13.505788;
                douLongtitude = 99.794878;
                break;

            case R.id.btnChi:
                douLatitude = 13.551590;
                douLongtitude = 99.821929;
                break;
            case R.id.btnTrue:
                douLatitude = 13.551869;
                douLongtitude = 99.823956;
                break;
            case R.id.btnYod:
                douLatitude = 13.552661;
                douLongtitude = 99.824638;
                break;
            case R.id.btnTor:
                douLatitude = 13.553822;
                douLongtitude = 99.825158;
                break;
            case R.id.btnJinda:
                douLatitude = 13.549978;
                douLongtitude = 99.814379;
                break;
            case R.id.btnThai:
                douLatitude = 13.529981;
                douLongtitude = 99.799571;
                break;
            case R.id.btnSiam:
                douLatitude = 13.526008;
                douLongtitude = 99.791560;
                break;
            case R.id.btnWiroj:
                douLatitude = 13.541770;
                douLongtitude = 99.806477;
                break;
            case R.id.btnkiti:
                douLatitude = 13.533576;
                douLongtitude = 99.896893;
                break;
            case R.id.btnkaew:
                douLatitude = 13.557841;
                douLongtitude = 99.830890;
                break;
            case R.id.btnDesel:
                douLatitude = 13.531337;
                douLongtitude = 99.794245;
                break;

            case R.id.btnchok:
                douLatitude = 13.532997;
                douLongtitude = 99.823254;
                break;
            case R.id.btnFive:
                douLatitude = 13.525041;
                douLongtitude =  99.792092;
                break;
            case R.id.btnPanit:
                douLatitude = 13.542730;
                douLongtitude = 99.801619;
                break;
            case R.id.btnChom:
                douLatitude = 13.542976;
                douLongtitude = 99.800389;
                break;
            case R.id.btnTanya:
                douLatitude = 13.530328;
                douLongtitude = 99.793804;
                break;
            default:
                break;
        }//switch

        //Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity2.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude", douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
       startActivity(objIntent);
        Log.d("@string/app_name", "Lat == " + Double.toString(douLatitude));




    }//onClick

}//main class

