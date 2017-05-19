package com.gmail.pdv.compapp.toshiba;

public class ToshibaModel1 extends Toshiba {

    public ToshibaModel1(String name) {
        super(name);
    }

    public ToshibaModel1(String name, int ram, int hdd, double weight) {
        super(name, ram, hdd, weight);
    }

    public void initializeBeforeConnect() {
        System.out.println("Toshiba Model1 " + getName() + " initialized for connection");
    }

    @Override
    public void connect() {
        System.out.println("Toshiba Model1 connect");
    }

    @Override
    public void lightKeyboard() {
        System.out.println("Keyboard without light");
    }

    @Override
    public void workFromBattery() {
        System.out.println("ToshibaModel1 slow working from battery");
    }
 
    
   
   
    
    
    
}
