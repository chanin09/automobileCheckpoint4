package apprtc.thekop.automobilecheckpoint4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyActivity13m extends AppCompatActivity implements View.OnClickListener{
    private Button btnrat,btnsuwit,btnsri,btnwisut,btnnet,btnsd,btnta,
    btnthai,btnhaj,btnsomk,btnbank,btnporn,btnsomp,btnemcs,btnsriporn,btnjinda;
    private double douLatitude,douLongtitude;
    private String strNameCity[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity13m);


        //Initial Widget
        initiawidget();
        //about SetOnclick button
        btnsri.setOnClickListener(this);
        btnrat.setOnClickListener(this);
        btnsuwit.setOnClickListener(this);
        btnwisut.setOnClickListener(this);
        btnjinda.setOnClickListener(this);
        btnsomk.setOnClickListener(this);
        btnsomp.setOnClickListener(this);
        btnnet.setOnClickListener(this);
        btnsd.setOnClickListener(this);
        btnta.setOnClickListener(this);
        btnthai.setOnClickListener(this);
        btnhaj.setOnClickListener(this);
        btnta.setOnClickListener(this);
        btnbank.setOnClickListener(this);
        btnemcs.setOnClickListener(this);
        btnsriporn.setOnClickListener(this);
        btnjinda.setOnClickListener(this);
        btnporn.setOnClickListener(this);

    }//On create

    private void initiawidget() {
        btnrat = (Button) findViewById(R.id.btnrat);
        btnsuwit = (Button) findViewById(R.id.btnsuwit);
        btnsri = (Button) findViewById(R.id.btnsri);
        btnwisut = (Button) findViewById(R.id.btnwisut);
        btnsd = (Button) findViewById(R.id.btnsd);
        btnthai = (Button) findViewById(R.id.btnthai);
        btnta = (Button) findViewById(R.id.btnta);
        btnnet = (Button) findViewById(R.id.btnnet);
        btnhaj = (Button) findViewById(R.id.btnhaj);
        btnsomk = (Button) findViewById(R.id.btnsomk);
        btnbank = (Button) findViewById(R.id.btnbank);
        btnporn = (Button) findViewById(R.id.btnporn);
        btnsomp = (Button) findViewById(R.id.btnsomp);
        btnemcs = (Button) findViewById(R.id.btnemcs);
        btnsriporn = (Button) findViewById(R.id.btnsriporn);
        btnjinda = (Button) findViewById(R.id.btnjinda);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnrat:
                douLatitude = 13.533244;
                douLongtitude = 99.806202;
                strNameCity = getResources().getStringArray(R.array.Decha);
                break;
            case R.id.btnsri:
                douLatitude = 13.527383;
                douLongtitude = 99.796013;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnsuwit:
                douLatitude = 13.550281;
                douLongtitude = 99.816687;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnwisut:
                douLatitude = 13.531352;
                douLongtitude = 99.803826;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnsd:
                douLatitude = 13.538938;
                douLongtitude = 99.813301;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnthai:
                douLatitude =13.530013;
                douLongtitude = 99.799563;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnta:
                douLatitude = 13.550367;
                douLongtitude = 99.818582;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnnet:
                douLatitude = 13.540692;
                douLongtitude = 99.809057;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnhaj:
                douLatitude = 13.536569;
                douLongtitude = 99.806161;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnsomk:
                douLatitude =13.527355;
                douLongtitude = 99.784158;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnbank:
                douLatitude = 13.539865;
                douLongtitude = 99.808353;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnporn:
                douLatitude = 13.545001;
                douLongtitude = 99.810528;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnsomp:
                douLatitude = 13.555160;
                douLongtitude = 99.786035;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnemcs:
                douLatitude =  13.530134;
                douLongtitude = 99.801554;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnsriporn:
                douLatitude = 13.527142;
                douLongtitude = 99.796596;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
                break;
            case R.id.btnjinda:
                douLatitude = 13.549978;
                douLongtitude = 99.814379;
                strNameCity = getResources().getStringArray(R.array.Suchan_city);
             break;
            default:
                break;
        }//switch
         // Intent & Put Value to ShowMapActivity
        Intent objIntent = new Intent(MyActivity13m.this, ShowMapActivity.class);
        objIntent.putExtra("Latitude",douLatitude);
        objIntent.putExtra("Longtitude", douLongtitude);
        objIntent.putExtra("Title", strNameCity[0]);
        objIntent.putExtra("Snippet", strNameCity[1]);
        startActivity(objIntent);

        Log.d("AutomobileCheckpoint4", "Lat == " + Double.toString(douLatitude));
    }
}//main Class
