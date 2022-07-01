package com.example.if3_10119126_foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

// NIM: 10119126
// Nama: Dicky Setiadi
// Kelas: IF-3

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FragmentProfile fragmentProfile = new FragmentProfile();
    FragmentAppInfo fragmentAppInfo = new FragmentAppInfo();
    FragmentFood fragmentFood = new FragmentFood();
    FragmentLocation fragmentLocation = new FragmentLocation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.nav_bottom);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentOrientation,fragmentProfile).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentOrientation,fragmentProfile).commit();
                        return true;

                    case R.id.food:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentOrientation,fragmentFood).commit();
                        return true;

                    case R.id.location:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentOrientation,fragmentLocation).commit();
                        return true;

                    case R.id.app_info:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentOrientation,fragmentAppInfo).commit();
                        return true;
                }
                return false;
            }
        });
    }
}