package com.example.vsaloonapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vsaloonapplication.R;
import com.example.vsaloonapplication.models.NotificationModel;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder>
{
    private List<NotificationModel> notificationModelList;

    public NotificationAdapter(List<NotificationModel> notificationModelList) {
        this.notificationModelList = notificationModelList;
    }

    @NonNull
    @Override
    public NotificationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.notification_list_item,parent,false);
        return new NotificationAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.title.setText(notificationModelList.get(position).getTitle());
        holder.subTitle.setText(notificationModelList.get(position).getSubTitle());
    }

    @Override
    public int getItemCount() {
        return notificationModelList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView title,subTitle;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            this.title = itemView.findViewById(R.id.notification_title);
            this.subTitle = itemView.findViewById(R.id.notification_subtitle);
        }
    }
}
