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
public class Coordenada {
    private int PosX;
    private int PosY;
    
    public Coordenada(int x,int y){
    PosX = x;
    PosY = y;
    }
    
    public int getCoordenadaX(){
        return PosX;
    }
    
    public int getCoordenadaY(){
        return PosY;
    }
    
    public void setCoordenadaX(int nuevoX){
        PosX = nuevoX;
    }
    
    public void setCoordenadaY(int nuevoY){
        PosY = nuevoY;
    }
}
