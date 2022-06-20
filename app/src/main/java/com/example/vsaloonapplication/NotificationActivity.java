package com.example.vsaloonapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.vsaloonapplication.adapters.NotificationAdapter;
import com.example.vsaloonapplication.models.NotificationModel;

import java.util.ArrayList;
import java.util.List;

public class NotificationActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        List<NotificationModel> notificationModelList = new ArrayList<>();
        notificationModelList.add(new NotificationModel("New Offer","you have got a new offer"));
        notificationModelList.add(new NotificationModel("New Offer","you have got a new offer"));
        notificationModelList.add(new NotificationModel("New Offer","you have got a new offer"));
        notificationModelList.add(new NotificationModel("New Offer","you have got a new offer"));
        notificationModelList.add(new NotificationModel("New Offer","you have got a new offer"));
        notificationModelList.add(new NotificationModel("New Offer","you have got a new offer"));
        notificationModelList.add(new NotificationModel("New Offer","you have got a new offer"));
        notificationModelList.add(new NotificationModel("New Offer","you have got a new offer"));

        RecyclerView recycler_view_notification = findViewById(R.id.recycler_view_notification);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(NotificationActivity.this,RecyclerView.VERTICAL,false);
        recycler_view_notification.setLayoutManager(linearLayoutManager);
        NotificationAdapter notificationAdapter = new NotificationAdapter(notificationModelList);
        recycler_view_notification.setAdapter(notificationAdapter);
    }
}
