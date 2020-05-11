
/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.v2;

/**
 *
 * @author Usagui
 */
public class Partida {
    private boolean bandera;
    private Tablero tablero;
    
    public Partida(Jugador jugadorUno, Jugador jugadorDos){
        tablero.mostrar();
        int turno = 0;
        while(turno <=9){           
            if(turno %2 ==0){
                jugadorUno.jugada(); 
                turno++;
            }
                jugadorDos.jugada();
                turno++;            
        }
    }
    
    private boolean ganador(){
        bandera = false;        
        if(tablero.darContenido()){            
            bandera = true;
        }
        return bandera;
    }
    
}
