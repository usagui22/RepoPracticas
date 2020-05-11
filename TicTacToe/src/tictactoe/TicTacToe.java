/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author Usagui
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int turno = 0; 
        Tablero tab = new Tablero();    
        tab.llenarTablero();
        tab.mostrarTablero();
        do{        
        System.out.println("Seleccione ubicacion para primera jugada:");
        Scanner entrada = new Scanner(System.in);
        int entradaJuego=entrada.nextInt();  
        
        if(turno %2 == 0){
            tab.jugada(entradaJuego);                               
            tab.contraJugada();
            tab.mostrarTablero();            
            turno++;
        }        
        }while(turno <= 3);   
    }
    
}
