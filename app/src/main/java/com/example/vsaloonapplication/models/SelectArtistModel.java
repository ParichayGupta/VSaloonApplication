package com.example.vsaloonapplication.models;

public class SelectArtistModel
{
    String title,subTitle,description;
    int Image;

    public SelectArtistModel(String title, String subTitle,String description, int image) {
        this.title = title;
        this.subTitle = subTitle;
        this.description = description;
        Image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
