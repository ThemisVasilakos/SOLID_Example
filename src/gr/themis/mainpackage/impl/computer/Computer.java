package gr.themis.mainpackage.impl.computer;

import gr.themis.mainpackage.interfaces.Display;
import gr.themis.mainpackage.interfaces.Keyboard;
import gr.themis.mainpackage.interfaces.OS;

public abstract class Computer implements OS {

    protected Keyboard keyboard;
    protected Display display;

    public Computer(Keyboard keyboard, Display display) {
        this.keyboard = keyboard;
        this.display = display;
    }

    public void displayKeyboard(String input){
        keyboard.type(input);
    }

    public void displayMonitor(String input){
        display.display(input);
    }

}
