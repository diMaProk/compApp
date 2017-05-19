package com.gmail.pdv.compapp.objects;

import com.gmail.pdv.compapp.toshiba.ToshibaModel2;

public class Monitor extends AbstractElectronicDevice{
    
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
        if (comp instanceof ToshibaModel2){
            ((ToshibaModel2)comp).initializeBeforeConnect();
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