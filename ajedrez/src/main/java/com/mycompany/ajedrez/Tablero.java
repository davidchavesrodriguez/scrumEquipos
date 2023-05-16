package com.mycompany.ajedrez;

public class Tablero {

    public static final int TAMANHO = 8;


    private PiezaAjedrez[][] tablero = new PiezaAjedrez[TAMANHO][TAMANHO];

    public Tablero() {

        generaTablero();

    }

    public void generaTablero() {

        for (int i = 0; i < tablero.length; i++) {

            tablero[1][i] = new PiezaAjedrez(Piezas.PEON, ColorPieza.NEGRA);

        }

        for (int i = 0; i < tablero.length; i++) {

            tablero[TAMANHO - 2][i] = new PiezaAjedrez(Piezas.PEON, ColorPieza.BLANCA);

        }

        tablero[0][0] = new PiezaAjedrez(Piezas.TORRE, ColorPieza.NEGRA);
        tablero[0][1] = new PiezaAjedrez(Piezas.CABALLO, ColorPieza.NEGRA);
        tablero[0][2] = new PiezaAjedrez(Piezas.ALFIL, ColorPieza.NEGRA);
        tablero[0][3] = new PiezaAjedrez(Piezas.DAMA, ColorPieza.NEGRA);
        tablero[0][4] = new PiezaAjedrez(Piezas.REY, ColorPieza.NEGRA);
        tablero[0][5] = new PiezaAjedrez(Piezas.ALFIL, ColorPieza.NEGRA);
        tablero[0][6] = new PiezaAjedrez(Piezas.CABALLO, ColorPieza.NEGRA);
        tablero[0][7] = new PiezaAjedrez(Piezas.TORRE, ColorPieza.NEGRA);

        tablero[7][0] = new PiezaAjedrez(Piezas.TORRE, ColorPieza.BLANCA);
        tablero[7][1] = new PiezaAjedrez(Piezas.CABALLO, ColorPieza.BLANCA);
        tablero[7][2] = new PiezaAjedrez(Piezas.ALFIL, ColorPieza.BLANCA);
        tablero[7][3] = new PiezaAjedrez(Piezas.DAMA, ColorPieza.BLANCA);
        tablero[7][4] = new PiezaAjedrez(Piezas.REY, ColorPieza.BLANCA);
        tablero[7][5] = new PiezaAjedrez(Piezas.ALFIL, ColorPieza.BLANCA);
        tablero[7][6] = new PiezaAjedrez(Piezas.CABALLO, ColorPieza.BLANCA);
        tablero[7][7] = new PiezaAjedrez(Piezas.TORRE, ColorPieza.BLANCA);

    }

    public boolean mover(int x, int y, int novaX, int novaY) {

        if (tablero[x][y] != null && tablero[novaX][novaY] == null) {
            
            tablero[novaX][novaY]=tablero[x][y];
            tablero[x][y]=null;
            
            return true;
            
        }else{    
            return false;
        }
    }
    
    public ColorPieza checkColor(int x, int y){
        
        return tablero[x][y].getColor();
        
    }

    @Override
    public String toString() {

        String resultado = "";
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                resultado = (tablero[i][j] != null) ? resultado + (" "+tablero[i][j] + " ") : resultado + (" * ");
            }

            resultado += "\n";
        }

        return resultado;
    }
    
    
    
}
