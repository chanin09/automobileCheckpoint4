package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity extends AppCompatActivity implements View.OnClickListener{

    //declarting Variable
    private Button btnSu, btnDe, btnBank, btnSri,btnThana,btnWisut,btnRat,btnSuwit,btnWiriya,
    btnTong,btnThanut,btnSak,btnSom,btnSakon,btnPanya,btnTp,btnTip,btnSomk;
    private double douLatitude, douLongtitude;
    private  String strNameCity[];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //Initial Widget
        initiaWidget();

        //About Setonclick button
        btnSu.setOnClickListener(this);
        btnDe.setOnClickListener(this);
        btnBank.setOnClickListener(this);
        btnPanya.setOnClickListener(this);
        btnRat.setOnClickListener(this);
        btnSak.setOnClickListener(this);
        btnSakon.setOnClickListener(this);
        btnSom.setOnClickListener(this);
        btnSomk.setOnClickListener(this);
        btnSri.setOnClickListener(this);
        btnSuwit.setOnClickListener(this);
        btnThana.setOnClickListener(this);
        btnTip.setOnClickListener(this);
        btnTong.setOnClickListener(this);
        btnWiriya.setOnClickListener(this);
        btnTp.setOnClickListener(this);
        btnThanut.setOnClickListener(this);
        btnWisut.setOnClickListener(this);

            }//On Create

    private void initiaWidget() {
        btnSu = (Button) findViewById(R.id.btnSu);
        btnDe = (Button) findViewById(R.id.btnDe);
        btnBank = (Button) findViewById(R.id.btnBank);
        btnTp = (Button) findViewById(R.id.btnTp);
        btnWiriya = (Button) findViewById(R.id.btnWiriya);
        btnTong = (Button) findViewById(R.id.btnTong);
        btnTip = (Button) findViewById(R.id.btnTip);
        btnPanya = (Button) findViewById(R.id.btnPanya);
        btnRat = (Button) findViewById(R.id.btnRat);
        btnSakon = (Button) findViewById(R.id.btnSakon);
        btnSri = (Button) findViewById(R.id.btnSri);
        btnThana = (Button) findViewById(R.id.btnThana);
        btnSuwit = (Button) findViewById(R.id.btnSuwit);
        btnSak = (Button) findViewById(R.id.btnSak);
        btnSomk = (Button) findViewById(R.id.btnSomk);
        btnThanut = (Button) findViewById(R.id.btnThanut);
        btnWisut = (Button) findViewById(R.id.btnWisut);
        btnSom = (Button) findViewById(R.id.btnSom);


    }



    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnSu:
                douLatitude = 13.534061;
                douLongtitude = 99.795717;
                strNameCity = getResources().getStringArray(R.array.Suchan);
                break;

            case R.id.btnDe:
                douLatitude = 13.552894;
                douLongtitude = 99.824604;
                break;

            case R.id.btnBank:
                douLatitude = 13.539865;
                douLongtitude = 99.808353;
                break;
            case R.id.btnSri:
                douLatitude = 13.527383;
                douLongtitude = 99.796013;
                break;
            case R.id.btnThana:
                douLatitude = 13.523428;
                douLongtitude = 99.790901;
                break;
            case R.id.btnWisut:
                douLatitude = 13.531352;
                douLongtitude = 99.803826;
                break;
            case R.id.btnRat:
                douLatitude = 13.533244;
                douLongtitude = 99.806202;
                break;
            case R.id.btnSuwit:
                douLatitude = 13.550281;
                douLongtitude = 99.816687;
                break;
            case R.id.btnWiriya:
                douLatitude = 13.550588;
                douLongtitude = 99.814514;
                break;
            case R.id.btnTong:
                douLatitude = 13.523581;
                douLongtitude = 99.790799;
                break;
            case R.id.btnThanut:
                douLatitude = 13.523616;
                douLongtitude = 99.790866;
                break;
            case R.id.btnSak:
                douLatitude = 13.551556;
                douLongtitude = 99.788751;
                break;
            case R.id.btnSom:
                douLatitude = 13.555160;
                douLongtitude = 99.786035;
                break;

            case R.id.btnTp:
                douLatitude = 13.558062;
                douLongtitude = 99.782842;
                break;
            case R.id.btnSakon:
                douLatitude = 13.548780;
                douLongtitude = 99.791324;
                break;
            case R.id.btnTip:
                douLatitude = 13.538938;
                douLongtitude = 99.813301;
                break;
            case R.id.btnPanya:
                douLatitude = 13.529994;
                douLongtitude = 99.793009;
                break;
            case R.id.btnSomk:
                douLatitude = 13.527355;
                douLongtitude = 99.784158;
                break;

            default:
                break;
        }//switch

        //Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude", douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);

        startActivity(objIntent);
        Log.d("@string/app_name", "Lat == " + Double.toString(douLatitude));




    }//onClick

}//main class
