package com.mycompany.ajedrez;

import java.util.Scanner;

public class AppAjedrez {

    public static void main(String[] args) {
        Tablero t = new Tablero();
        Scanner sc = new Scanner(System.in);
        boolean blancas = true;
        int posFila = 0;
        int posColumna = 0;
        int fila = 0;
        int columna = 0;
        int continuar = 0;

        while (continuar == 0) {

            if (blancas) {

                System.out.print(t.toString() + "\nJUEGAN BLANCAS\n");

            } else {
                System.out.print(t.toString() + "\nJUEGAN NEGRAS\n");

            }
            System.out.print("Columna ficha: ");
            posColumna = getNumColumna(sc.nextLine().toUpperCase().charAt(0));

            System.out.print("Fila ficha:");
            posFila = sc.nextInt() - 1;
            sc.nextLine();

            System.out.print("Introuduce nueva columna: ");
            columna = getNumColumna(sc.nextLine().toUpperCase().charAt(0));

            System.out.print("Introuduce nueva fila: ");
            fila = sc.nextInt() - 1;
            sc.nextLine();

            if ((t.checkColor(posFila, posColumna) == ColorPieza.BLANCA && blancas) || (t.checkColor(posFila, posColumna) == ColorPieza.NEGRA && !blancas)) {

                t.mover(posFila, posColumna, fila, columna);
                blancas = !blancas;

            } else {

                System.out.println("El movimiento es incorrecto");
            }

            System.out.print("¿Continuar? Sí(0) No(1):");

            continuar = sc.nextInt();
            sc.nextLine();
            System.out.println("");
        }

    }

    public static int getNumColumna(char c) {

        int num = 0;

        num = switch (c) {
            case 'A' ->
                0;
            case 'B' ->
                1;
            case 'C' ->
                2;
            case 'D' ->
                3;
            case 'E' ->
                4;
            case 'F' ->
                5;
            case 'G' ->
                6;
            case 'H' ->
                7;
            default ->
                -1;
        };
        return num;
    }

}
