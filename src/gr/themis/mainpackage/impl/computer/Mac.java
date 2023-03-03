package gr.themis.mainpackage.impl.computer;

import gr.themis.mainpackage.interfaces.Display;
import gr.themis.mainpackage.interfaces.Keyboard;

public class Mac extends Computer{

    public Mac(Keyboard keyboard, Display display) {
        super(keyboard, display);
    }

    @Override
    public void printOS() {
        System.out.println("Macintosh Operating System");
    }

    @Override
    public void printOSSpecialty() {
        System.out.println("Macintosh is based on Unix but are expensive");
    }
}
