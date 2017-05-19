package com.gmail.pdv.compapp.toshiba;

public class ToshibaModel2 extends Toshiba{

    public ToshibaModel2(String name) {
        super(name);
    }

    public ToshibaModel2(String name, int ram, int hdd, double weight) {
        super(name, ram, hdd, weight);
    }
    
    @Override
    public void connect() {
        System.out.println("Toshiba Model1 connect");
    }

    @Override
    public void lightKeyboard() {
        System.out.println("Keyboard light ON");
    }

    @Override
    public void workFromBattery() {
        System.out.println("ToshibaModel2 work from battery");
    }
    
    
    
    
}
