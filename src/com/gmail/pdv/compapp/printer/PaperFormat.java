package com.gmail.pdv.compapp.printer;

public enum PaperFormat{
    A5 (10, "A5"), 
    A4 (15, "A4"),
    A3 (20, "A3");
    
    private final int lenght;
    private final String name;

    private PaperFormat(int lenght, String name) {
        this.lenght = lenght;
        this.name = name;
    }
        
    public int getLenght() {
        return lenght;
    }

    public String getName() {
        return name;
    }
    
    
    
}