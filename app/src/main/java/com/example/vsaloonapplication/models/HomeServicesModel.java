package com.example.vsaloonapplication.models;

public class HomeServicesModel
{
    private String textTitle,textsubTitle,textPrice;
    private int image;

    public HomeServicesModel(String textTitle, String textsubTitle, String textPrice, int image) {
        this.textTitle = textTitle;
        this.textsubTitle = textsubTitle;
        this.textPrice = textPrice;
        this.image = image;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }

    public String getTextsubTitle() {
        return textsubTitle;
    }

    public void setTextsubTitle(String textsubTitle) {
        this.textsubTitle = textsubTitle;
    }

    public String getTextPrice() {
        return textPrice;
    }

    public void setTextPrice(String textPrice) {
        this.textPrice = textPrice;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
