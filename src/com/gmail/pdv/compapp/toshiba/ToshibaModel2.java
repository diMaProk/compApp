package com.gmail.pdv.compapp.toshiba;

import com.gmail.pdv.compapp.objects.AbstractNotebook;

public class ToshibaModel2 extends AbstractNotebook implements Toshiba{

    public ToshibaModel2(String name) {
        super(name);
    }

    public ToshibaModel2(int ram, int hdd, boolean cdWritable, String name, double weight) {
        super(ram, hdd, cdWritable, name, weight);
    }

    @Override
    public void connect() {
        System.out.println("ToshibaModel2 connect");
    }
    
    public void initializeBeforeConnect(){
        System.out.println("ToshibaModel2 " + getName() + " initializing before connection...");
    }

    @Override
    public void lightKeyboard() {
        System.out.println("ToshibaModel2kKeyboard light ON");
    }

    @Override
    public void workFromBattery() {
        System.out.println("ToshibaModel2 work from battery");
    }

    @Override
    public void useTouchPad() {
        System.out.println("ToshibaModel2 using touchpad");
    }
    
    
}
