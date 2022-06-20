package com.example.vsaloonapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.vsaloonapplication.Fragments.BookNowFragment;
import com.example.vsaloonapplication.Fragments.HomeFragment;
import com.example.vsaloonapplication.Fragments.OffersFragment;
import com.example.vsaloonapplication.Fragments.ServicesFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    int navigation_index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFragment(new HomeFragment(),"home");
    }

    private void loadFragment(Fragment fragment, String tag)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_host_fragment, fragment,tag);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener()
    {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item)
        {
            Fragment fragment;
            switch (item.getItemId())
            {
                case R.id.navigation_home:
                    navigation_index = 0;
                    fragment = new HomeFragment();
                    loadFragment(fragment,"home");
                    return true;

                case R.id.navigation_offers:
                    navigation_index = 1;
                    fragment = new OffersFragment();
                    loadFragment(fragment,"offer");
                    return true;

                case R.id.navigation_services:
                    navigation_index = 2;
                    fragment = new ServicesFragment();
                    loadFragment(fragment,"services");
                    return true;

                case R.id.navigation_book_appoi:
                    navigation_index = 3;
                    fragment = new BookNowFragment();
                    loadFragment(fragment,"book_now");
                    return true;

                case R.id.navigation_profile:
                    return true;
            }
            return false;
        }
    };

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
    {
        return false;
    }


}
