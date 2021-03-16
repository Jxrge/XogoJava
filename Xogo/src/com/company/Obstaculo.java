package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;


public class Obstaculo {

    //obxeto da clase Xogo
    Xogo xogiño;

    //variables que delimitan a area do obstaculo
    Area ciruclo, pokeball;

    //variables para o tamaño do obstaculo
    int anchoObstaculo=70;
    int altoObstaculo=70;

    //coordenadas iniciais onde se ubica o obxeto
    static int x_inicial=1300;
    static int y_inicial=270;

    //coordenadas para a manipulación do obxeto
    static int x_auxiliar=-4;

    public Obstaculo(Xogo xogiño){
        this.xogiño=xogiño;

    }
    //uso do gif
    public void paint(Graphics2D g){
        ImageIcon pokeball= new ImageIcon(getClass().getResource("/com/company/Multimedia/pokeball.gif"));
        g.drawImage(pokeball.getImage(), x_inicial, y_inicial, anchoObstaculo,altoObstaculo,null);

    }
}
