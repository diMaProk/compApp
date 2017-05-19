package com.gmail.pdv.compapp.objects;

import com.gmail.pdv.compapp.toshiba.ToshibaModel1;

public class Monitor extends ElectronicDevice{
    
    public Monitor(){
        this ("Default monitor");
    }

    public Monitor(String name) {
        super(name, 2);
    }
    
    public Monitor (String name, double weight){
        super (name, weight);
    }
    
    public void connectDevice (Computer comp){
        if (comp instanceof ToshibaModel1){
            ((ToshibaModel1)comp).initializeBeforeConnect();
        }
        comp.connect();
    }

    @Override
    public void on() {
        System.out.println("Monitor ON");
    }

    @Override
    public void off() {
        System.out.println("Monitor OFF");
    }
    
    
    
    
    
    
}