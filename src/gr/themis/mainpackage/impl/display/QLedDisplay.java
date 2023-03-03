package gr.themis.mainpackage.impl.display;

import gr.themis.mainpackage.interfaces.Display;

public class QLedDisplay implements Display {
    @Override
    public void display(String displayType) {
        System.out.println("Qled displayes: "+ displayType);
    }
}
