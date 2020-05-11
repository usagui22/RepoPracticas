
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
public class TicTacToeV2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Jugador jugadorUno = new Jugador('X');
        Jugador jugadorDos = new Jugador('O');
        Partida partida = new Partida(jugadorUno, jugadorDos);
        
    }    
}
