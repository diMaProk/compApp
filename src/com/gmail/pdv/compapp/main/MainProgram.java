package com.gmail.pdv.compapp.main;

import com.gmail.pdv.compapp.asus.AsusModel1;
import com.gmail.pdv.compapp.asus.AsusModel2;
import com.gmail.pdv.compapp.objects.Monitor;
import com.gmail.pdv.compapp.objects.Notebook;
import com.gmail.pdv.compapp.printer.PaperFormat;
import com.gmail.pdv.compapp.printer.Printer;
import com.gmail.pdv.compapp.toshiba.ToshibaModel1;
import com.gmail.pdv.compapp.toshiba.ToshibaModel2;

public class MainProgram {
    
    public static void main(String[] args) {
        
       testMonitor();
       testPrinter();
          
    }
    
    private static void testMonitor(){
        System.out.println("testMonitor()\n");

        Notebook t1 = new ToshibaModel1("Toshiba_1");
        Notebook t2 = new ToshibaModel2("Toshiba_2");
        Notebook a1 = new AsusModel1("Asus_1");
        Notebook a2 = new AsusModel2("Asus_2");

        Monitor monitor = new Monitor();
        monitor.connectDevice(t1);
        monitor.connectDevice(t2);
        monitor.connectDevice(a1);
        monitor.connectDevice(a2);
       
    }
    
    private static void testPrinter(){
        System.out.println("\ntestPrinter()\n");
        
        Printer printer = new Printer("Printer 1");
        printer.printPaperTypes();
        
        printer.print(PaperFormat.A5, "1111111111111");
        printer.print(PaperFormat.A4, "0000000000000000000000000");
        printer.print(PaperFormat.A3, "555555");
        
    }
    
            
    
}
