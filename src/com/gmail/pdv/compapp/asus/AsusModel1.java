package com.gmail.pdv.compapp.asus;

import com.gmail.pdv.compapp.objects.AbstractNotebook;

public class AsusModel1 extends AbstractNotebook implements Asus{

    public AsusModel1(String name) {
        super(name);
    }
    
    
    public AsusModel1(int ram, int hdd, boolean cdWritable, String name, double weight) {
        super(ram, hdd, cdWritable, name, weight);
    }

    @Override
    public void connect() {
        System.out.println("AsusModel1 connect");
    }

    @Override
    public void workFromBattery() {
        System.out.println("AsusModel1 can't work from battery");
    }

    @Override
    public void useTouchPad() {
        System.out.println("AsusModel1 using touchpad");
    }

    @Override
    public void printStartScreen() {
        System.out.println("AsusModel1 printStartScreen");
    }

    
}
