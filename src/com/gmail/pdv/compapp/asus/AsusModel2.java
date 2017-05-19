package com.gmail.pdv.compapp.asus;

import com.gmail.pdv.compapp.objects.AbstractNotebook;

public class AsusModel2 extends AbstractNotebook implements Asus {

    public AsusModel2(String name) {
        super(name);
    }

    public AsusModel2(int ram, int hdd, boolean cdWritable, String name, double weight) {
        super(ram, hdd, cdWritable, name, weight);
    }
    
    

    @Override
    public void workFromBattery() {
        System.out.println("AsusModel2 working form battery");
    }

    @Override
    public void useTouchPad() {
        System.out.println("AsusModel2 using touchpad");
    }

    @Override
    public void connect() {
        System.out.println("AsusModel2 connect");
    }

    @Override
    public void printStartScreen() {
        System.out.println("AsusModel2 printStartScreen");
    }

}
