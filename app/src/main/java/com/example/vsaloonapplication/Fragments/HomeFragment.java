package com.example.vsaloonapplication.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vsaloonapplication.OverFlyingRecyclerViewLayoutManager;
import com.example.vsaloonapplication.R;
import com.example.vsaloonapplication.adapters.BannerAdapter;
import com.example.vsaloonapplication.adapters.HomeOfferAdapter;
import com.example.vsaloonapplication.adapters.HomeServicesAdapter;
import com.example.vsaloonapplication.models.BannerSliderModel;
import com.example.vsaloonapplication.models.HomeOfferModel;
import com.example.vsaloonapplication.models.HomeServicesModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment
{
    private List <BannerSliderModel> bannerSliderModelList;
    private List <HomeOfferModel> homeOfferModelList;
    private List <HomeServicesModel> homeServicesModelsList;
    private RecyclerView recycle_banner,recycle_viewlistoffers,recycle_viewlistservices;
    private OverFlyingRecyclerViewLayoutManager overFlyingRecyclerViewLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view =inflater.inflate(R.layout.fragment_home, container, false);

        bannerSliderModelList = new ArrayList<>();
        bannerSliderModelList.add(new BannerSliderModel(R.drawable.aaa));
        bannerSliderModelList.add(new BannerSliderModel(R.drawable.aaaaa));
        bannerSliderModelList.add(new BannerSliderModel(R.drawable.banner));
        bannerSliderModelList.add(new BannerSliderModel(R.drawable.aaa));

        recycle_banner = view.findViewById(R.id.recycle_banner);
        overFlyingRecyclerViewLayoutManager= new OverFlyingRecyclerViewLayoutManager(0.75f, 80, OverFlyingRecyclerViewLayoutManager.HORIZONTAL);
        recycle_banner.setLayoutManager(overFlyingRecyclerViewLayoutManager);
        BannerAdapter bannerAdapter = new BannerAdapter(bannerSliderModelList);
        recycle_banner.setAdapter(bannerAdapter);

        homeOfferModelList = new ArrayList<>();
        homeOfferModelList.add(new HomeOfferModel("upto\n20%\noff",R.drawable.offers1));
        homeOfferModelList.add(new HomeOfferModel("upto\n30%\noff",R.drawable.offers2));
        homeOfferModelList.add(new HomeOfferModel("upto\n40%\noff",R.drawable.offers3));
        homeOfferModelList.add(new HomeOfferModel("upto\n50%\noff",R.drawable.offers4));

        recycle_viewlistoffers = view.findViewById(R.id.recycle_viewlistoffers);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        recycle_viewlistoffers.setLayoutManager(linearLayoutManager);
        HomeOfferAdapter homeOfferAdapter = new HomeOfferAdapter(homeOfferModelList);
        recycle_viewlistoffers.setAdapter(homeOfferAdapter);

        homeServicesModelsList = new ArrayList<>();
        homeServicesModelsList.add(new HomeServicesModel("HairCut","Facial Mask, Back facial etc.","$ 27.00",R.drawable.aaa));
        homeServicesModelsList.add(new HomeServicesModel("Blow Dry","Spoorts Massage, MEdicak massage etc.","$ 27.00",R.drawable.aaa));
        homeServicesModelsList.add(new HomeServicesModel("Global COlouring","Flightlight, Root color, Hair bleach etc.","$ 27.00",R.drawable.aaa));
        homeServicesModelsList.add(new HomeServicesModel("Head Massage","Soft wax,Fruit wax etc.","$ 27.00",R.drawable.aaa));

        recycle_viewlistservices = view.findViewById(R.id.recycle_viewlistservices);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);
        recycle_viewlistservices.setLayoutManager(linearLayoutManager1);
        HomeServicesAdapter homeServicesAdapter = new HomeServicesAdapter(homeServicesModelsList);
        recycle_viewlistservices.setAdapter(homeServicesAdapter);
        return view;
    }

}