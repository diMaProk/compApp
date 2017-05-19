package com.gmail.pdv.compapp.objects;



public abstract class Computer extends ElectronicDevice{

    private int ram = 1024*4;
    private int hdd = 1000;
    private boolean dvdWriteSupport = true;
    
    protected Computer(String name){
        super (name, 0);        
    }
    
    protected Computer (String name, boolean dvdWriteSupport){
        super (name, 0); 
        this.dvdWriteSupport = dvdWriteSupport;
    }
    
    
    protected Computer(String name, int ram, int hdd, double weight) {
        super(name, weight);
        this.ram = ram;
        this.hdd = hdd;        
    }

    protected Computer(String name, int ram, int hdd, double weight, boolean dvdWriteSupport) {
        super(name, weight);
        this.ram = ram;
        this.hdd = hdd;
        this.dvdWriteSupport = dvdWriteSupport;
    }
    
    
    
    public abstract void connect();
    public abstract void load();
    

    //service methods
    
    
    public void reboot(){
        System.out.println("Rebooting system ...");
    }
    
    public void writeDisk(){
        if (dvdWriteSupport){
            System.out.println("Writing DVD disk ...");
        }
        else{
            System.out.println("DVD writing error: operation is not supported");
        }
    }
        
        

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    
           

        
}






    
    
    
    
    
    

        

    

