package com.gmail.pdv.compapp.asus;

import com.gmail.pdv.compapp.objects.Notebook;

// Asus notebook does not support dvd write operation

public interface Asus extends Notebook {
    
    void printStartScreen();
}
