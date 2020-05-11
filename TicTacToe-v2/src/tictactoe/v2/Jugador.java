/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.v2;

import static java.lang.Math.random;

/**
 *
 * @author Usagui
 */
public class Jugador {
    private int posicion;
    private char ficha;
    

    public Jugador(char f) {
        posicion = (int)random()%3;
        ficha = f;
    }
    public int darPosicion(){
        return posicion;
    }
    public char darFicha(){
        return ficha;
    }
    public Estrategias jugada(){
        return null;
    }
}
