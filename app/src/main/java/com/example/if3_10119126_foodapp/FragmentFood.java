package com.example.if3_10119126_foodapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

// NIM: 10119126
// Nama: Dicky Setiadi
// Kelas: IF-3

public class FragmentFood extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        @Override
        public void onMapReady(GoogleMap googleMap) {
            googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

            LatLng location_1 = new LatLng(-7.006425416975332, 107.61427662943066);
            googleMap.addMarker(new MarkerOptions().position(location_1).title("Ramen Bajuri"));
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location_1,16));

            LatLng location_2 = new LatLng(-7.006357863299325, 107.61469715536711);
            googleMap.addMarker(new MarkerOptions().position(location_2).title("Pizza Hut Delivery"));

            LatLng location_3 = new LatLng(-7.006670428227271, 107.61304700308598);
            googleMap.addMarker(new MarkerOptions().position(location_3).title("Kaybun Dimsum Baleendah"));

            LatLng location_4 = new LatLng(-7.007375470802738, 107.61285666174047);
            googleMap.addMarker(new MarkerOptions().position(location_4).title("RM Padang"));

            LatLng location_5 = new LatLng(-7.0080044582924135, 107.61228171692888);
            googleMap.addMarker(new MarkerOptions().position(location_5).title("Mimut Donat"));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}