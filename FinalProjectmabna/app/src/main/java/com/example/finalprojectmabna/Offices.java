package com.example.finalprojectmabna;

public class Offices {
    public String name ;
    public int phone;
    public String details;

    public Offices() {
    }

    public Offices(String name, int phone, String details) {
        this.name = name;
        this.phone = phone;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

