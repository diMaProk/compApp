package com.gmail.pdv.compapp.toshiba;

import com.gmail.pdv.compapp.objects.AbstractNotebook;

public class ToshibaModel1 extends AbstractNotebook implements Toshiba {

    public ToshibaModel1(String name) {
        super(name);
    }

    public ToshibaModel1(int ram, int hdd, boolean cdWritable, String name, double weight) {
        super(ram, hdd, cdWritable, name, weight);
    }

    
    @Override
    public void connect() {
        System.out.println("ToshibaModel1 connect");
    }

    @Override
    public void lightKeyboard() {
        System.out.println("Keyboard without light");
    }
    
    @Override
    public void workFromBattery() {
        System.out.println("ToshibaModel1 slow working from battery");
    }

    @Override
    public void useTouchPad() {
        System.out.println("ToshibaModel1 using touchpad");
    }
    
    
}
