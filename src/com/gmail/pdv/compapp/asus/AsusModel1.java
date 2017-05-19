package com.gmail.pdv.compapp.asus;

public class AsusModel1 extends Asus{

    public AsusModel1(String name) {
        super(name);
    }

    public AsusModel1(String name, int ram, int hdd, double weight) {
        super(name, ram, hdd, weight);
    }

    @Override
    public void connect() {
        System.out.println("Asus Model1 connect");
    }

    @Override
    public void workFromBattery() {
        System.out.println("AsusModel1 can't work from battery");
    }
    
    

    
    
    
    
}
