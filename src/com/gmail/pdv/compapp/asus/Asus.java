package com.gmail.pdv.compapp.asus;

import com.gmail.pdv.compapp.objects.Notebook;

// Asus notebook does not support dvd write operation

public abstract class Asus extends Notebook {

    protected Asus(String name) {
        super(name, false);
    }

    protected Asus(String name, int ram, int hdd, double weight) {
        super(name, ram, hdd, weight, false);
        
    }
    
    public void printStartScreen() {
        System.out.println("Asus company. All right reserved");
    }
    
    @Override
    public void load() {
        System.out.println("Asus notebook loading ...");
    }
    
    @Override
    public void on() {
        System.out.println("Asus notebook ON");
    }

    @Override
    public void off() {
        System.out.println("Asus notebook OFF");
    }
    
}
