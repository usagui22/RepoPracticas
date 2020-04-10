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
    private int posActHor;
    private int posActVer;
    
    
    public Jugadas(int pos1, int pos2){
        posActHor = pos1;
        posActVer = pos2;
    }
    public void jugaCentral(){
        Coordenada posCentral = new Coordenada(posActHor, posActVer);
        if(posCentral.getCoordenadaX()==1){
            if(posCentral.getCoordenadaY()==1){
                contraJugadaCentral();
            }
        }
    }
    
    public void contraJugadaCentral(){
        int posHor;
        int posVer;
        
    }
}
