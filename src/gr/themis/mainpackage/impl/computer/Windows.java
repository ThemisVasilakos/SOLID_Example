package gr.themis.mainpackage.impl.computer;

import gr.themis.mainpackage.interfaces.Display;
import gr.themis.mainpackage.interfaces.Keyboard;

public class Windows extends Computer{

    public Windows(Keyboard keyboard, Display display) {
        super(keyboard, display);
    }

    @Override
    public void printOS() {
        System.out.println("Windows Operating System");
    }

    @Override
    public void printOSSpecialty() {
        System.out.println("Windows can play games!");
    }
}
