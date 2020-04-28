/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Usagui
 */
public class Jugadas {
    private int posicionTablero;    
    private Tablero t;
    
    public Jugadas(int posActual){        
        if(posActual <1 || posActual>9){
            System.out.println("Introduce una posicion valida para el tablero");
        }else{
            posicionTablero = posActual;
        }                                  
    }
    
}
