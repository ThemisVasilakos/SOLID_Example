package gr.themis.mainpackage.impl.computer;

import gr.themis.mainpackage.interfaces.Display;
import gr.themis.mainpackage.interfaces.Keyboard;

public class Linux extends Computer{

    public Linux(Keyboard keyboard, Display display) {
        super(keyboard, display);

    }

    @Override
    public void printOS() {
        System.out.println("Linux Operating System");
    }

    @Override
    public void printOSSpecialty() {
        System.out.println("Linux is free and customizable");
    }
}
