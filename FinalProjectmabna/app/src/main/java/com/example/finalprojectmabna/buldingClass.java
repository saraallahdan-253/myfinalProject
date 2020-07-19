package com.example.finalprojectmabna;


import java.util.ArrayList;

public class buldingClass {
    public int space;
    public int floors;
    public int crypt;
    public int total;

    public buldingClass(int space, int floors, int crypt, int total) {
        this.space = space;
        this.floors = floors;
        this.crypt = crypt;
        this.total = total;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getCrypt() {
        return crypt;
    }

    public void setCrypt(int crypt) {
        this.crypt = crypt;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void matching(ArrayList<buldingClass> array, buldingClass bulding) {
       for (int i = 0; i < array.size(); i++) {
//array.get(i).getTotal()== bulding.getTotal() && array.get(i).getSpace() == bulding.getSpace() && array.get(i).getFloors() == bulding.getFloors() && array.get(i).setCrypt(); == bulding.setCrypt(); &&  );
       }


    }

}