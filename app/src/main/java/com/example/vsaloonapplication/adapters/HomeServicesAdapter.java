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
import com.example.vsaloonapplication.models.HomeServicesModel;

import java.util.List;

public class HomeServicesAdapter extends RecyclerView.Adapter<HomeServicesAdapter.ViewHolder>
{
    private List<HomeServicesModel> listdata;

    public HomeServicesAdapter(List<HomeServicesModel> listdata)
    {
        this.listdata = listdata;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.services_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        holder.Image.setImageResource(listdata.get(position).getImage());
        holder.title.setText(listdata.get(position).getTextTitle());
        holder.subtitle.setText(listdata.get(position).getTextsubTitle());
        holder.price.setText(listdata.get(position).getTextPrice());
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView Image;
        TextView title,subtitle,price;
        ViewHolder(View itemView)
        {
            super(itemView);
            this.Image =  itemView.findViewById(R.id.image1);
            this.title = itemView.findViewById(R.id.shop_nameTV);
            this.subtitle = itemView.findViewById(R.id.offer_descTV);
            this.price= itemView.findViewById(R.id.offer_priceTV);
        }
    }
}
