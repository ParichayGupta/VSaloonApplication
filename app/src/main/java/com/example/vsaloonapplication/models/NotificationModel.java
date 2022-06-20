package com.example.vsaloonapplication.models;

public class NotificationModel
{
    String title,subTitle;

    public NotificationModel(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }
}
