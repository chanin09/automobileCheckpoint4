package apprtc.thekop.automobilecheckpoint4;


import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class ShowMapActivity extends FragmentActivity{
    //Declaring Variable
    private Double douLatitute, douLongtitute;
    private GoogleMap objGoogleMap;
    private LatLng objLatLng;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_layout);

        //Receive Value from MyActivity
        douLatitute = getIntent().getExtras().getDouble("Latitude");
        douLongtitute = getIntent().getExtras().getDouble("Longtitute");

        //Show Log
        Log.d("FourCity", "Latitute ==> " + Double.toString(douLatitute));
        Log.d("FourCity", "Longtitute ==> " + Double.toString(douLongtitute));

        //Setup Center of Map
        objLatLng = new LatLng(douLatitute, douLongtitute);

        //Create Google map
        objGoogleMap = ((SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map)).getMap();
        objGoogleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(objLatLng,16));


    }//onCreate
}
