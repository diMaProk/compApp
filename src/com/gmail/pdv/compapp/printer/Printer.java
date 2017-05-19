package com.gmail.pdv.compapp.printer;

import com.gmail.pdv.compapp.objects.ElectronicDevice;

public class Printer extends ElectronicDevice{
    
    private boolean colorPrint = false; //by default printer is in black-white mode
    
    public Printer(String name) {
        super(name, 5);
    }
    
    public Printer (String name, boolean colorPrint){
        super(name, 5);
        this.colorPrint = colorPrint;
    }
    
    public Printer (String name, int weight, boolean colorPrint){
        super(name, weight);
        this.colorPrint = colorPrint;
    }

    @Override
    public void on() {
        System.out.println("Printer ON");
    }

    @Override
    public void off() {
        System.out.println("Printer OFF");
    }
    
    public boolean isColorPrint(){
        return colorPrint;
    }

    public void setColorPrint(boolean colorPrint) {
        this.colorPrint = colorPrint;
    }
    
    public void print (PaperFormat paperFormat, String text){
        System.out.println("Length of line sent for printing: " + text.length());
        
        //is text length suitable for paper format - printing 
        if (text.length() <= paperFormat.getLenght()){
            System.out.println("Printing text " + text + " on paper " + paperFormat.getName());
        }
        else{ // is lenght doesn't meet format
            // search for suitable format
            PaperFormat properPaperFormat = getPaperFormat (text.length());
            
            if (properPaperFormat !=null){
                System.out.println("Wrong paper format " + paperFormat + "\nNeed to use " + properPaperFormat.getName() );
            }
            else {
                System.out.println("Given text can't be printed - no suitable paper format");
            }
        }
        System.out.println();
    }
    
    //select suitable format of paper according to lenght of text
    private PaperFormat getPaperFormat(int textLength) {
        for (PaperFormat paper : PaperFormat.values()){
            if (textLength <= paper.getLenght()){
                return paper;
            }
        }
        return null;
    }

    public void printPaperTypes() {

    }
    
    
    
    
}