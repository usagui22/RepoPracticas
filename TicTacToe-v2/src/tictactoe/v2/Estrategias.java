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
public class Estrategias {
    private char Fichas;
    private Posiciones posJug;
    
    
    public Estrategias(){
        posJug = new Posiciones();
    }
    public Posiciones estrategiaInicial(){
        posJug = new Posiciones((int)random()%3);
        return posJug;        
    }
    public Posiciones estrategiaExterior(int sup){
        
        return posJug;
    }
}
