package com.company;

import javax.swing.JFrame;
import java.security.Principal;
import java.util.logging.Logger;//?
import java.util.logging.Level;//?


public class Main {

    public static void main(String[] args) {
	    JFrame ventana= new JFrame("PokemonRun");//?
	    Xogo xogiño= new Xogo();

	    //Axustes de ventana
	    ventana.add(xogiño);
	    ventana.setSize(1300,400);
	    ventana.setLocation(70,200);
	    ventana.setVisible(true);
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true){
            xogiño.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
