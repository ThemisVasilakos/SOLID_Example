package gr.themis.mainpackage.impl.keyboard;

import gr.themis.mainpackage.interfaces.Keyboard;

public class GamingKeyboard implements Keyboard {
    @Override
    public void type(String input) {
        System.out.println("Gaming keyboard says: "+ input);
    }
}
