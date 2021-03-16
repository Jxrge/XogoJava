package com.company;

import javax.swing.*;
import java.awt.*;

public class Fondo {
    //Obxeto da clase Xogo
    Xogo xogiño;

    //Variable do tamaño do fondo

    int ancho_Fondo=1300;
    int alto_Fondo=400;
    //coordenadas iniciais para mopver o fondo
    int x1=1300;
    int y1=0;
    //coordenadass auxiliares que moven outro fondo
    int x2=0;
    int y2=0;

    public Fondo(Xogo xoguiño){
        this.xogiño=xogiño;
    }

    //uso do fondo
    public void paint(Graphics2D g){
        ImageIcon imaxenFondo= new ImageIcon(getClass().getResource("/com/company/Multimedia/screenshot.jpg"));
        g.drawImage(imaxenFondo.getImage(),x1,y1,ancho_Fondo,alto_Fondo,null);
        g.drawImage(imaxenFondo.getImage(),x2,y2,ancho_Fondo,alto_Fondo,null);
    }
}
