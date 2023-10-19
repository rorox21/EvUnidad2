package com.example.evunidad2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class activity_map extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        String dir1 = getIntent().getStringExtra("dir1");
        String[] parts1 = dir1.split(",");
        double la1 = Integer.parseInt(parts1[0]);
        double lo1 = Integer.parseInt(parts1[1]);

        String dir2 = getIntent().getStringExtra("dir2");
        String[] parts2 = dir2.split(",");
        double la2 = Integer.parseInt(parts2[0]);
        double lo2 = Integer.parseInt(parts2[1]);

        String dir3 = getIntent().getStringExtra("dir3");
        String[] parts3 = dir3.split(",");
        double la3 = Integer.parseInt(parts3[0]);
        double lo3 = Integer.parseInt(parts3[1]);

        LatLng Direct1 = new LatLng(la1, lo1);
        LatLng Direct2 = new LatLng(la2, lo2);
        LatLng Direct3 = new LatLng(la3, lo3);

        mMap.addMarker(new MarkerOptions().position(Direct1) .title("Direccion 1"));
        mMap.addMarker(new MarkerOptions().position(Direct2) .title("Direccion 2"));
        mMap.addMarker(new MarkerOptions().position(Direct3) .title("Direccion 3"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Direct1));
    }
}