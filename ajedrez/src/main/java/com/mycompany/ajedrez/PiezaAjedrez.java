/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ajedrez;

import java.awt.Point;

public class PiezaAjedrez {

    private Piezas tipo;
    private Point posicion;
    private ColorPieza color;

    public PiezaAjedrez(Piezas tipo, int x, int y, ColorPieza color) {

        this.tipo = tipo;
        posicion = new Point(x, y);
        this.color = color;
    }

    public PiezaAjedrez(Piezas tipo, ColorPieza color) {

        this.tipo = tipo;
        this.color = color;
    }

    public Piezas getTipo() {

        return tipo;
    }

    public int getX() {

        return posicion.x;
    }

    public int getY() {

        return posicion.y;
    }

    public void setPosicion(int x, int y) {

        posicion = new Point(x, y);

    }

    public ColorPieza getColor() {
        return color;
    }

    public void setColor(ColorPieza color) {
        this.color = color;
    }

//    public String toSting() {
//
//        return tipo + " " + color + " (" + posicion.x + ", " + posicion.y + ")";
//    }
    
    public String toString() {
        
        String r=String.valueOf(tipo.name().charAt(0)+"");
        return(color==color.BLANCA)?r:r.toLowerCase();
    }

}
