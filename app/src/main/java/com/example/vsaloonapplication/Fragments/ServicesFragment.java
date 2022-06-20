package com.example.vsaloonapplication.Fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.vsaloonapplication.R;
import com.example.vsaloonapplication.adapters.TabAdapter;
import com.google.android.material.tabs.TabLayout;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public class ServicesFragment extends Fragment
{
    private Unbinder unBind;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_services, container, false);
        unBind = ButterKnife.bind(this, view);
        final ViewPager viewPager = view.findViewById(R.id.view_pager_services);
        TabAdapter tabadapter = new TabAdapter(getChildFragmentManager());
        tabadapter.addFragment(new HairServiceFragement(), "Hair");
        tabadapter.addFragment(new MakeUpServiceFragment(), "Make Up");
        tabadapter.addFragment(new SkinServiceFragment(), "Skin");
        tabadapter.addFragment(new HandsAndFeetsServiceFragment(), "Hands & Feet");
        viewPager.setAdapter(tabadapter);
        TabLayout tabLayout = view.findViewById(R.id.tab_layout_services);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

}
