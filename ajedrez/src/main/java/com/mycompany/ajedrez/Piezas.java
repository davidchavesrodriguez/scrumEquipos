/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ajedrez;

/**
 *
 * @author a22leonardofa
 */
public enum Piezas {

    PEON(1), TORRE(5), CABALLO(3), ALFIL(3), REY(100), DAMA(10);

    int valor;

    Piezas(int valor) {

        this.valor = valor;
    }

}
