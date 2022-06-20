package com.example.vsaloonapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vsaloonapplication.R;
import com.example.vsaloonapplication.models.SelectArtistModel;

import java.util.List;

public class SelectArtistAdapter extends RecyclerView.Adapter<SelectArtistAdapter.ViewHolder>
{
    private List<SelectArtistModel> selectArtistModelList;

    public SelectArtistAdapter(List<SelectArtistModel> selectArtistModelList) {
        this.selectArtistModelList = selectArtistModelList;
    }

    @NonNull
    @Override
    public SelectArtistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.select_artist_list_item,parent,false);
        return new SelectArtistAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.title.setText(selectArtistModelList.get(position).getTitle());
        holder.subTitle.setText(selectArtistModelList.get(position).getSubTitle());
        holder.description.setText(selectArtistModelList.get(position).getDescription());
        holder.image.setImageResource(selectArtistModelList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return selectArtistModelList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView title,subTitle,description;
        ImageView image;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            this.image = itemView.findViewById(R.id.image_artist_selected);
            this.title = itemView.findViewById(R.id.artist_name_title);
            this.subTitle = itemView.findViewById(R.id.artist_name_subTitle);
            this.description = itemView.findViewById(R.id.artist_description);
        }
    }
}

