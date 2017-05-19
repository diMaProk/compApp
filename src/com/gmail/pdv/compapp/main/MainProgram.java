package com.gmail.pdv.compapp.main;

import com.gmail.pdv.compapp.printer.PaperFormat;
import com.gmail.pdv.compapp.printer.Printer;

public class MainProgram {
    
    public static void main(String[] args) {
        
//       ToshibaModel1 toshiba1= new ToshibaModel1("T1");
//       ToshibaModel2 toshiba2= new ToshibaModel2("T2");
//       
//       AsusModel1 asus1 = new AsusModel1("A1");
//       AsusModel2 asus2 = new AsusModel2("A2");
//       
//       
//       Monitor monitor = new Monitor();
//       
//       monitor.connectDevice(toshiba1);
//       monitor.connectDevice(toshiba2);
//       monitor.connectDevice(asus1);
//       monitor.connectDevice(asus2);
       
      
       testPrinter();
          
       //КЛючевое слово static  
        
    }
    
    private static void testPrinter(){
        Printer printer = new Printer("Printer 1");
        printer.printPaperTypes();
        
        printer.print(PaperFormat.A5, "1111111111111");
        printer.print(PaperFormat.A4, "0000000000000000000000000");
        printer.print(PaperFormat.A3, "555555");
        
    }
            
    
}
