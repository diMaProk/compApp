package com.gmail.pdv.compapp.objects;

public abstract class Notebook extends Computer {
    
    protected Notebook (String name){
        super (name);        
    }

    protected Notebook(String name, boolean dvdWriteSupport) {
        super(name, dvdWriteSupport);
    }
        

    protected Notebook(String name, int ram, int hdd, double weight) {
        super(name, ram, hdd, weight);
    }     

    protected Notebook(String name, int ram, int hdd, double weight, boolean dvdWriteSupport) {
        super(name, ram, hdd, weight, dvdWriteSupport);
    }
    
    public abstract void workFromBattery();
    
    public void charge(){
        System.out.println("Notebook charging ...");
    }

    @Override
    public void connect() {
        System.out.println("Notebook connect");
    }
    
    
    
}
