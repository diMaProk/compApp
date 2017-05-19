package com.gmail.pdv.compapp.objects;

public abstract class ElectronicDevice {

    
    private String name;
    private double weight;

    
    public abstract void on();
    
    public abstract void off();

    protected ElectronicDevice(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (checkForEmpty(name)){
            this.name = name;
        }
        else{
            System.out.println("Name cannot be empty");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeigth(double weigth) {
        if (weight > 0){
            this.weight = weigth;
        }
        else{
            System.out.println("Invalid weight parameter");
        }
    }   
    
    private boolean checkForEmpty(String str){
        return str !=null && !str.trim().equals("");
    }
    
}
