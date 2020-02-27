package com.example.tongkrongin.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tongkrongin.Fragment.HomeFragment;
import com.example.tongkrongin.Fragment.NewsFragment;
import com.example.tongkrongin.Fragment.ProfileFragment;
import com.example.tongkrongin.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;

            switch(item.getItemId()){
                case R.id.nav_home:
//                    fragment = new HomeFragment();
//                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment, fragment.getClass().getSimpleName()).commit();
                    loadFragment(new HomeFragment());
                    return true;
                case R.id.nav_news:
//                    fragment = new NewsFragment();
//                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment, fragment.getClass().getSimpleName()).commit();
                    loadFragment(new NewsFragment());
                    return true;
                case R.id.nav_profile:
//                    fragment = new ProfileFragment();
//                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment, fragment.getClass().getSimpleName()).commit();
                    loadFragment(new ProfileFragment());
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.);
//        loadFragment(new HomeFragment());
        BottomNavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        if (savedInstanceState == null) {
            navigationView.setSelectedItemId(R.id.nav_home);
        }
    }

    public void loadFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout,fragment);
        transaction.addToBackStack(null);
        transaction.setCustomAnimations(android.R.animator.fade_in,android.R.animator.fade_out);
        transaction.commit();
    }
}
