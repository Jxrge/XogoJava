package com.company;

import org.w3c.dom.html.HTMLAppletElement;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//para o son do xogo
import java.net.URL;
import java.applet.AudioClip;

//Para enseñar o panel
import javax.swing.JPanel;

public class Xogo  extends JPanel{

    //sons do xogo
    URL dirSonidoGolpe,dirSonidoSalto;
    AudioClip sonidoGolpe,sonidoSalto;

    //objetos das clases pokemon, obstaculo e fondo;
    Pokemon pokemon=new Pokemon(this);
    Obstaculo obstaculo=new Obstaculo(this);
    Fondo fondo= new Fondo(this);

    //variables para o xogo

    static boolean xogoFinalizado=false;
    static boolean perdeVida=false;
    static int vidas=3;
    static int nivel= 1;
    static int puntos=0;

    public Xogo(){

        //ligazon cas pistas de audio gardadas noutro arquivo e unindo gardadnoo no programa como un Clip de Audio
        dirSonidoGolpe=getClass().getResource("/Multimedia/Pikachu Sound Effect.mp3");
        sonidoGolpe= Applet.newAudioClip(dirSonidoGolpe);

        dirSonidoSalto=getClass().getResource("/Multimedia/Pikachu.mp3");
        sonidoSalto= Applet.newAudioClip(dirSonidoSalto);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }
            @Override
            public void keyPressed(KeyEvent e) {
                //para activar o sonido cando se salta un obstaculo e dicir cando se presiona Space
                if(e.getKeyCode()==KeyEvent.VK_SPACE){
                    sonidoSalto.play();
                    pokemon.keyPressed(e);
                }
            }
            @Override
            public void keyReleased(KeyEvent e) { }
        });
        setFocusable(true);

    }

    public void paintComponent(Graphics2D g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        debuxar(g2);
        debuaxrPuntuaxe(g2);
    }

    public void debuxar(Graphics2D g){
        fondo.paint(g);
        pokemon.paint(g);
        obstaculo.paint(g);
    }

    public void debuaxrPuntuaxe(Graphics2D g){

    }
}
