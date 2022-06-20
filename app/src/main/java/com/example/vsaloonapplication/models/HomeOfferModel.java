package com.example.vsaloonapplication.models;

public class HomeOfferModel
{
    private String text;
    private int Image;

    public HomeOfferModel(String text, int image) {
        this.text = text;
        Image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
