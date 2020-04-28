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
public class contraJugadas {
    private int PosHorCon;
    private int PosVerCon;
    
    public contraJugadas(int posH,int posV){
    PosHorCon = posH;
    PosVerCon = posV;
    }
    
    public int getCoordenadaX(){
        return PosHorCon;
    }
    
    public int getCoordenadaY(){
        return PosVerCon;
    }
    
    public void setCoordenadaX(int newHor){
        PosHorCon = newHor;
    }
    
    public void setCoordenadaY(int newVer){
        PosVerCon = newVer;
    }
}
