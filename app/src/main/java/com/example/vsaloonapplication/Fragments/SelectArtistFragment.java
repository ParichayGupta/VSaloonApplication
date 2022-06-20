package com.example.vsaloonapplication.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.vsaloonapplication.R;
import com.example.vsaloonapplication.adapters.SelectArtistAdapter;
import com.example.vsaloonapplication.models.SelectArtistModel;

import java.util.ArrayList;
import java.util.List;


public class SelectArtistFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_select_artist, container, false);

        List<SelectArtistModel> selectArtistModelList = new ArrayList<>();
        selectArtistModelList.add(new SelectArtistModel("Barrett C. Woods","Haircut Specialist","It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged Lorem Ipsum",R.drawable.aaa));
        selectArtistModelList.add(new SelectArtistModel("Barrett C. Woods","Haircut Specialist","It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged Lorem Ipsum",R.drawable.aaaaa));
        selectArtistModelList.add(new SelectArtistModel("Barrett C. Woods","Haircut Specialist","It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged Lorem Ipsum",R.drawable.aaaaa));
        selectArtistModelList.add(new SelectArtistModel("Barrett C. Woods","Haircut Specialist","It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged Lorem Ipsum",R.drawable.aaa));
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view_select_artist);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        SelectArtistAdapter selectArtistAdapter = new SelectArtistAdapter(selectArtistModelList);
        recyclerView.setAdapter(selectArtistAdapter);

        return view;
    }
}
