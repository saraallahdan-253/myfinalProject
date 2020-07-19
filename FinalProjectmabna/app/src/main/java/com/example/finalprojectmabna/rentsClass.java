package com.example.finalprojectmabna;

import java.io.Serializable;

public class rentsClass implements Serializable {
    public int image;
    public int price;
    public int rSpace;
    public String location;
    public int phone;
    public String details;

    public rentsClass(int image, int price, int rPlace, String location, int phone, String details) {
        this.image = image;
        this.price = price;
        this.rSpace = rPlace;
        this.location = location;
        this.phone = phone;
        this.details = details;
    }

    public int getImg() {
        return image;
    }

    public void setImg(int img) {
        this.image = img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getrPlace() {
        return rSpace;
    }

    public void setrPlace(int rPlace) {
        this.rSpace = rPlace;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}



