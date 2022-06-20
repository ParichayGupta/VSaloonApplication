package com.example.vsaloonapplication.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vsaloonapplication.R;
import com.example.vsaloonapplication.adapters.HomeServicesAdapter;
import com.example.vsaloonapplication.models.HomeServicesModel;

import java.util.ArrayList;
import java.util.List;


public class HairServiceFragement extends Fragment
{
    private List<HomeServicesModel> homeServicesModelsList;
    private RecyclerView recycle_viewlistservices;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_hair_service_fragement, container, false);

        homeServicesModelsList = new ArrayList<>();
        homeServicesModelsList.add(new HomeServicesModel("HairCut","Facial Mask, Back facial etc.","$ 27.00",R.drawable.aaa));
        homeServicesModelsList.add(new HomeServicesModel("Blow Dry","Spoorts Massage, MEdicak massage etc.","$ 27.00",R.drawable.aaa));
        homeServicesModelsList.add(new HomeServicesModel("Global COlouring","Flightlight, Root color, Hair bleach etc.","$ 27.00",R.drawable.aaa));
        homeServicesModelsList.add(new HomeServicesModel("Head Massage","Soft wax,Fruit wax etc.","$ 27.00",R.drawable.aaa));

        recycle_viewlistservices = view.findViewById(R.id.recycler_view_hair_services);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL,false);
        recycle_viewlistservices.setLayoutManager(linearLayoutManager1);
        HomeServicesAdapter homeServicesAdapter = new HomeServicesAdapter(homeServicesModelsList);
        recycle_viewlistservices.setAdapter(homeServicesAdapter);
        return view;
    }
}
