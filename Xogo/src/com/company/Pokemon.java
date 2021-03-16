package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import javax.swing.ImageIcon;

public class Pokemon {
    //Obxeto clase Xogo
    Xogo xogiño;
    //variables para saber se o pokemonn vai saltar
    static boolean saltando=false;
    boolean sube=false;
    boolean baixa=false;

    //variables para delimitaer a area do obxeto
    Area cabeza, corpo ,pokemon;

    //variables do tamaño do persoaxe
    int anchoPokemon=122;
    int altoPokemon=78;

    //coordenadas inicias do personaxe
    static int x_inicial=50;
    static int y_inicial=270;

    //coordenadas para manipular o personaxe
    int x_auxiliar=0;
    int y_auxiliar=0;


    public Pokemon(Xogo xogiño){
        this.xogiño=xogiño;
    }

    //uso do gif
    public void paint(Graphics2D g){
        ImageIcon pokemon= new ImageIcon(getClass().getResource("/com/company/Multimedia/pokemon.gif"));//?
        g.drawImage(pokemon.getImage(),x_inicial, y_inicial,anchoPokemon, altoPokemon,null);
    }

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_SPACE){
            saltando=true;

        }
    }
}
