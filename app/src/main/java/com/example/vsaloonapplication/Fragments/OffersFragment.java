package com.example.vsaloonapplication.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vsaloonapplication.R;
import com.example.vsaloonapplication.adapters.HomeOfferAdapter;
import com.example.vsaloonapplication.adapters.HomeServicesAdapter;
import com.example.vsaloonapplication.models.HomeOfferModel;
import com.example.vsaloonapplication.models.HomeServicesModel;

import java.util.ArrayList;
import java.util.List;


public class OffersFragment extends Fragment {

    private List <HomeServicesModel> homeServicesModelsList;
    private RecyclerView recycle_view_offers;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_offers, container, false);

        homeServicesModelsList = new ArrayList<>();
        homeServicesModelsList.add(new HomeServicesModel("HairCut","Facial Mask, Back facial etc.","$ 27.00",R.drawable.aaa));
        homeServicesModelsList.add(new HomeServicesModel("Blow Dry","Spoorts Massage, MEdicak massage etc.","$ 27.00",R.drawable.aaa));
        homeServicesModelsList.add(new HomeServicesModel("Global COlouring","Flightlight, Root color, Hair bleach etc.","$ 27.00",R.drawable.aaa));
        homeServicesModelsList.add(new HomeServicesModel("Head Massage","Soft wax,Fruit wax etc.","$ 27.00",R.drawable.aaa));

        recycle_view_offers = view.findViewById(R.id.recycle_view_offers);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);
        recycle_view_offers.setLayoutManager(linearLayoutManager1);
        HomeServicesAdapter homeServicesAdapter = new HomeServicesAdapter(homeServicesModelsList);
        recycle_view_offers.setAdapter(homeServicesAdapter);


        return view;
    }

}
