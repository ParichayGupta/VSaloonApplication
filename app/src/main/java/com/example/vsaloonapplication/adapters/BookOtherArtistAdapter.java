package com.example.vsaloonapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vsaloonapplication.R;
import com.example.vsaloonapplication.models.BookOtherArtistModel;

import java.util.List;

public class BookOtherArtistAdapter extends RecyclerView.Adapter<BookOtherArtistAdapter.ViewHolder>
{
    private List<BookOtherArtistModel> bookOtherArtistModelList;

    public BookOtherArtistAdapter(List<BookOtherArtistModel> bookOtherArtistModelList) {
        this.bookOtherArtistModelList = bookOtherArtistModelList;
    }

    @NonNull
    @Override
    public BookOtherArtistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.book_other_artist_list_item,parent,false);
        return new BookOtherArtistAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.artistImage.setImageResource(bookOtherArtistModelList.get(position).getArtistImage());
    }

    @Override
    public int getItemCount() {
        return bookOtherArtistModelList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView artistImage;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            this.artistImage = itemView.findViewById(R.id.artist_image);
        }
    }
}
