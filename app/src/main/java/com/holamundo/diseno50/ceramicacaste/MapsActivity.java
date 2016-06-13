package com.holamundo.diseno50.ceramicacaste;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(14.8440059,-91.5232732);
        LatLng tienda1= new LatLng(14.8440059,-91.5222520);
        LatLng tienda2= new LatLng(14.8440059,-91.5212710);
        LatLng tienda3= new LatLng(14.8440059,-91.5032750);
        LatLng tienda4= new LatLng(14.8440059,-91.40327150);

        CameraPosition cameraPosition= new CameraPosition.Builder()
                .target(tienda1)
                .zoom(18)
                .bearing(0)
                .tilt(45)
                .build();
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        mMap.addMarker(new MarkerOptions()
                        .position(sydney)
                        .title("CERAMICA esta aqui")
                        .draggable(true) //mover iconos o marcadores
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)) //cambia el color de los iconos o marcadores
                        .alpha(0.7f)
                        .snippet("population: 4,137,400")
                  .icon(BitmapDescriptorFactory.fromResource(R.drawable.cati)) //pone la imagen
        );
        mMap.addMarker(new MarkerOptions()
                        .position(tienda1)
                        .title("Tienda 1 Ceramica esta aqui")
                        .draggable(true)
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                        .alpha(0.7f)
                        .snippet("population: 4,137,400")
                     .icon(BitmapDescriptorFactory.fromResource(R.drawable.cati)) //pone la imagen
        );


        mMap.addMarker(new MarkerOptions()
                        .position(tienda2)
                        .title("tienda 2 Ceramica esta aqui")
                        .draggable(true)
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .alpha(0.7f)
                        .snippet("population: 4,137,400")
                   .icon(BitmapDescriptorFactory.fromResource(R.drawable.cati)) //pone la imagen

        );
        mMap.addMarker(new MarkerOptions()
                        .position(tienda3)
                        .title("tienda 3 Ceramica esta aqui")
                        .draggable(true)
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
                        .alpha(0.7f)
                        .snippet("population: 4,137,400")
                   .icon(BitmapDescriptorFactory.fromResource(R.drawable.cati)) //pone la imagen
        );

        mMap.addMarker(new MarkerOptions()
                        .position(tienda4)
                        .title("templo minerva esta aqui")
                        .draggable(true)
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))
                        .alpha(0.7f)
                        .snippet("population: 4,137,400")
                       .icon(BitmapDescriptorFactory.fromResource(R.drawable.cati)) //pone la imagen
        );


        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    public void MostrarLista(View view)
    {
        Intent in = new Intent(MapsActivity.this,ListadoProductos.class);
        startActivity(in);


    }


}



