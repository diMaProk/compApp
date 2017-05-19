package com.gmail.pdv.compapp.toshiba;

import com.gmail.pdv.compapp.objects.Notebook;

public abstract class Toshiba extends Notebook{

    protected Toshiba(String name) {
        super(name);
    }
    
   
    protected Toshiba(String name, int ram, int hdd, double weight) {
        super(name, ram, hdd, weight);
    }
    
    public abstract void lightKeyboard();

    @Override
    public void on() {
        System.out.println("Toshiba notebook ON");
    }

    @Override
    public void off() {
        System.out.println("Toshiba notebook OFF");
    }

    @Override
    public void load() {
        System.out.println("Toshiba notebook loading ...");
    }
    
    
    

    
}
