package com.upb.myrestaurant;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.upb.myrestaurant.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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
        LatLng medellin = new LatLng( 6.25184, -75.56359);

        //Latitud Longitud Sedes
        LatLng provenza = new LatLng( 6.210999246547784, -75.56522329799202);
        LatLng poblado = new LatLng( 6.187425287254308, -75.57814558642197);
        LatLng palmas = new LatLng( 6.184303995621502, -75.54755546812562);
        LatLng Envigado = new LatLng( 6.158608015189226, -75.56758620450778);

        mMap.addMarker(new MarkerOptions().position(provenza).title("EdenHall: Sede Provenza")
                .snippet("El placer de comer en el Edén")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.menu))
                .rotation(-50.0f)
        );
        mMap.addMarker(new MarkerOptions().position(poblado).title("EdenHall: Sede Poblado")
                .snippet("El sabor del jardín a tu mesa en el edén")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.menu))
                .rotation(-50.0f)
        );

        mMap.addMarker(new MarkerOptions().position(palmas).title("EdenHall: Sede Palmas")
                .snippet("El sabor del jardín a tu mesa en el edén")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.menu))
                .rotation(-50.0f)
        );
        mMap.addMarker(new MarkerOptions().position(Envigado).title("EdenHall: Sede Envigado")
                .snippet("El placer de comer en el Edén")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.menu))
                .rotation(-50.0f)
        );

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(medellin,12));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);



    }
}