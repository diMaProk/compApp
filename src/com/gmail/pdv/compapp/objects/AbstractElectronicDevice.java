package com.gmail.pdv.compapp.objects;

public abstract class AbstractElectronicDevice implements ElectronicDevice {
    
    private String name;
    private double weight;

    public AbstractElectronicDevice() {

        this.name = "Default Electronic device";
        this.weight = 0;
                
    }
    
    public AbstractElectronicDevice(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    protected void print(String str){
        System.out.println(str);
    }
    
    
    public void setName(String name) {
        if (checkForEmpty(name)){
            this.name = name;
        }
        else{
            System.out.println("Name cannot be empty");
        }
    }
    
    private boolean checkForEmpty(String str){
        return str !=null && !str.trim().equals("");
    }

    public String getName() {
        return name;
    }
    

    public void setWeigth(double weigth) {
        if (weight > 0){
            this.weight = weigth;
        }
        else{
            System.out.println("Invalid weight parameter");
        }
    }   
    
    public double getWeight() {
        return weight;
    }
    
}
