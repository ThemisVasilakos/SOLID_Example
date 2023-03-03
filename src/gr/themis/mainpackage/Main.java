package gr.themis.mainpackage;

import gr.themis.mainpackage.impl.computer.Linux;
import gr.themis.mainpackage.impl.computer.Mac;
import gr.themis.mainpackage.impl.computer.Windows;
import gr.themis.mainpackage.impl.display.OledDisplay;
import gr.themis.mainpackage.impl.display.QLedDisplay;
import gr.themis.mainpackage.impl.keyboard.GamingKeyboard;
import gr.themis.mainpackage.impl.keyboard.MechanicalLeyboard;

public class Main {

    public static void main(String[] args){
        GamingKeyboard razer = new GamingKeyboard();
        OledDisplay samsung = new OledDisplay();

        MechanicalLeyboard logitech = new MechanicalLeyboard();
        QLedDisplay sony = new QLedDisplay();

        Windows winPC = new Windows(razer,samsung);
        winPC.displayKeyboard("Hello");
        winPC.displayMonitor("Nice blacks");
        winPC.printOS();
        winPC.printOSSpecialty();

        System.out.println("\n");

        Linux linuxPc = new Linux(logitech,sony);
        linuxPc.displayKeyboard("Nice typing");
        linuxPc.displayMonitor("Bright colors");
        linuxPc.printOS();
        linuxPc.printOSSpecialty();

        System.out.println("\n");

        Mac macbook = new Mac(logitech,samsung);
        macbook.displayKeyboard("Macbooks are fast");
        macbook.displayMonitor("Retina quality");
        macbook.printOS();
        macbook.printOSSpecialty();
    }
}
