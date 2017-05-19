package com.gmail.pdv.compapp.asus;

public class AsusModel2 extends Asus {

    public AsusModel2(String name) {
        super(name);
    }

    public AsusModel2(String name, int ram, int hdd, double weight) {
        super(name, ram, hdd, weight);
    }

    @Override
    public void connect() {
        System.out.println("Asus Model2 connect");
    }

    @Override
    public void workFromBattery() {
       System.out.println("Asus Model2 working form battery");
    }
    
    

  
    
}
