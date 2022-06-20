package com.example.vsaloonapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vsaloonapplication.R;
import com.example.vsaloonapplication.models.BookNowSlotsModel;

import java.util.List;

public class BookNowSlotsAdapter extends RecyclerView.Adapter<BookNowSlotsAdapter.ViewHolder>
{
    private List<BookNowSlotsModel> slotsModelList;

    public BookNowSlotsAdapter(List<BookNowSlotsModel> slotsModelList) {
        this.slotsModelList = slotsModelList;
    }

    @NonNull
    @Override
    public BookNowSlotsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) 
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.book_now_list_item,parent,false);
        return new BookNowSlotsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.time.setText(slotsModelList.get(position).getTime());
    }


    @Override
    public int getItemCount() {
        return slotsModelList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView time;
        public ViewHolder(@NonNull View itemView) 
        {
            super(itemView);
            this.time = itemView.findViewById(R.id.book_now_time_slots);
        }
    }
}
