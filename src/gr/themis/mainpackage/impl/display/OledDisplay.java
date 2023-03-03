package gr.themis.mainpackage.impl.display;

import gr.themis.mainpackage.interfaces.Display;

public class OledDisplay implements Display {
    @Override
    public void display(String displayType) {
        System.out.println("Oled displayes: "+ displayType);
    }
}
