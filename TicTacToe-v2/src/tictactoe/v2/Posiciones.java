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
public class Posiciones {
    private int pos_Hor;
    private int pos_Ver;
    
    public Posiciones(){
        
    }
    public Posiciones(int pos){
        while(pos>1 || pos <9){
            registrarCoordenada(pos);
        }
        
    }    
    
    private void registrarCoordenada(int pos){
        switch(pos){
            case 1:
                pos_Hor=0;
                pos_Ver=0;
                break;
            case 2:
                pos_Hor = 0;
                pos_Ver = 1;
                break;
            case 3:
                pos_Hor = 0;
                pos_Ver = 2;                
                break;
            case 4:
                pos_Hor = 1;
                pos_Ver = 0;                
                break;
            case 5:
                pos_Hor = 1;
                pos_Ver = 1;                
                break;
            case 6:
                pos_Hor = 1;
                pos_Ver = 2;                
                break;    
            case 7:
                pos_Hor = 2;
                pos_Ver = 0;                
                break;
            case 8:
                pos_Hor = 2;
                pos_Ver = 1;                
                break;
            case 9:
                pos_Hor = 2;
                pos_Ver = 2;                
                break;    
        }
    }
    
    public void MostrarPosicion(){
        System.out.print(pos_Hor + pos_Ver);
    }
}
