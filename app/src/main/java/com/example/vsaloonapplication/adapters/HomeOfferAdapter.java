package com.example.vsaloonapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vsaloonapplication.R;
import com.example.vsaloonapplication.models.HomeOfferModel;

import java.util.List;

public class HomeOfferAdapter extends RecyclerView.Adapter<HomeOfferAdapter.ViewHolder>
{
    private List<HomeOfferModel> listdata;

    public HomeOfferAdapter(List<HomeOfferModel> listdata)
    {
        this.listdata = listdata;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.offer_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        holder.sliderImage.setImageResource(listdata.get(position).getImage());
        holder.offer.setText(listdata.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView sliderImage;
        TextView offer;
        ViewHolder(View itemView)
        {
            super(itemView);
            this.sliderImage =  itemView.findViewById(R.id.linear_layout_image);
            this.offer = itemView.findViewById(R.id.offer_textView);


        }
    }
}
