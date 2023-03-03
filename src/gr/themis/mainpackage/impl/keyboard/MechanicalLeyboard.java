package gr.themis.mainpackage.impl.keyboard;

import gr.themis.mainpackage.interfaces.Keyboard;

public class MechanicalLeyboard implements Keyboard {
    @Override
    public void type(String input) {
        System.out.println("Mechanical keyboard says: "+ input);
    }
}
