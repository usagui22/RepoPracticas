/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.v2;

/**
 *
 * @author Usagui
 */
public class Tablero {
    private Fichas [][] tabla;
    private int posHor;
    private int posVer;
    
    public Tablero(){
        tabla = new Fichas[3][3];        
    }        
     public void mostrar(){}
     public Contenidos darContenido(){
         Contenidos fichas =new Contenidos();
         return fichas;
     }
}
