package apprtc.thekop.automobilecheckpoint4;


import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ShowMapActivity extends FragmentActivity {
    //Declaring Variable
    private Double douLatitude, douLongtitude;
    private GoogleMap objGoogleMap;
    private LatLng objLatLng;
    private String strTitle,strSnippet;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_layout);

        //Receive Value from MyActivity
        douLatitude = getIntent().getExtras().getDouble("Latitude");
        douLongtitude = getIntent().getExtras().getDouble("Longtitude");
        strTitle = getIntent().getExtras().getString("Title");
        strSnippet = getIntent().getExtras().getString("Snippet");

        //Show Log
        Log.d("@string/app_name", "Latitude ==> " + Double.toString(douLatitude));
        Log.d("@string/app_name", "Longitude ==> " + Double.toString(douLongtitude));

        //Setup Center of Map
        objLatLng = new LatLng(douLatitude, douLongtitude);

        //Create Google map
        objGoogleMap =((SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map)).getMap();
        objGoogleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(objLatLng, 16));

        //Create marker for Center Map
        objGoogleMap.addMarker(new MarkerOptions()
                .position(objLatLng)
                .title(strTitle)
                .snippet(strSnippet)
        );


    }//onCreate
}//Main class
