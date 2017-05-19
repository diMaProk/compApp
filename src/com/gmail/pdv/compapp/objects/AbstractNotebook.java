
package com.gmail.pdv.compapp.objects;

public abstract class AbstractNotebook extends AbstractElectronicDevice implements Notebook {
    
    private int ram;
    private int hdd;
    private boolean cdWritable = true;

    public AbstractNotebook(int ram, int hdd, boolean cdWritable, String name, double weight) {
        super(name, weight);
        this.ram = ram;
        this.hdd = hdd;
        this.cdWritable = cdWritable;
    }

    public AbstractNotebook(String name) {
        super(name, 0.0);
        this.hdd = 1000;
        this.ram = 4000;
    }
    
    public void writeDisc(){
        System.out.println("Object " + this.getName());
        if (cdWritable){
            System.out.println("Writing disk...");
        } else {
            System.out.println("Unable to write disc. Operation not supported");
            
        }
    }
        
    public void reboot(){
        off();
        on();
        load();
    }

    @Override
    public void on() {
        System.out.println(getName() + " ON");
    }

    @Override
    public void off() {
        System.out.println(getName() + " OFF");
    }
    
    @Override
    public void load(){
        System.out.println(getName() + " loading");
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
