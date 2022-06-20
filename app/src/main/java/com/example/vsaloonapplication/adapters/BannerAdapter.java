package com.example.vsaloonapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.vsaloonapplication.R;
import com.example.vsaloonapplication.models.BannerSliderModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHolder> {

    private List<BannerSliderModel> listdata;

    public BannerAdapter(List<BannerSliderModel> listdata)
    {
        this.listdata = listdata;
    }
    @NonNull
    @Override
    public BannerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.banner_slider_list_item, parent, false);
        return new BannerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        holder.sliderImage.setImageResource(listdata.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView sliderImage;
        ViewHolder(View itemView)
        {
            super(itemView);
            this.sliderImage =  itemView.findViewById(R.id.imageView_home_slider);

        }
    }
}
