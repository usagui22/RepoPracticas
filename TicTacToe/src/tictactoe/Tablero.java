/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import static java.lang.Math.random;

/**
 *
 * @author Usagui
 */
public class Tablero {
    private char [] [] tabla;
    private int posHorTab;
    private int posVerTab;
    
    public Tablero(){
        tabla = new char[3][3];        
    }
    public void llenarTablero(){
        char relleno = '1';
        for(int indiceHorizontal=0;indiceHorizontal<3;indiceHorizontal++){                        
            for(int indiceVertical=0;indiceVertical<3;indiceVertical++){                
                tabla [indiceHorizontal][indiceVertical] = relleno++;                
                
            }
        }
    }
   
    public void mostrarTablero(){
        for(int i=0;i<3;i++){            
            for(int j=0;j<3;j++){       
                if(j<2){
                    System.out.print( tabla[i][j]+" | " );                                                
                }else{
                    System.out.println( tabla[i][j]);
                }
            }
            System.out.println("----------");
        }        
    }
        
    public void jugada(int posicionTablero){
        int k;        
        do{                        
            k = 0;
            
            switch(posicionTablero){
                case 1:
                    posHorTab=0;
                    posVerTab=0;
                    if(tabla[posHorTab][posVerTab] == 'O' && tabla[posHorTab][posVerTab]== 'X'){
                        k = 1;
                        System.out.println("Casilla ocupada inserte otra posicion valida!!");
                    }
                    break;

                case 2:
                    posHorTab=0;
                    posVerTab=1;
                    if(tabla[posHorTab][posVerTab] == 'O' && tabla[posHorTab][posVerTab]== 'X'){
                        k = 1;
                        System.out.println("Casilla ocupada inserte otra posicion valida!!");
                    }
                    break;
                case 3:
                    posHorTab=0;
                    posVerTab=2;
                    if(tabla[posHorTab][posVerTab] == 'O' && tabla[posHorTab][posVerTab]== 'X'){
                        k = 1;
                        System.out.println("Casilla ocupada inserte otra posicion valida!!");
                    }
                    break;
                case 4:
                    posHorTab=1;
                    posVerTab=0;
                    if(tabla[posHorTab][posVerTab] == 'O' && tabla[posHorTab][posVerTab]== 'X'){
                        k = 1;
                        System.out.println("Casilla ocupada inserte otra posicion valida!!");
                    }
                    break;
                case 5:
                    posHorTab=1;
                    posVerTab=1;
                    if(tabla[posHorTab][posVerTab] == 'O' && tabla[posHorTab][posVerTab]== 'X'){
                        k = 1;
                        System.out.println("Casilla ocupada inserte otra posicion valida!!");
                    }
                    break;
                case 6:
                    posHorTab=1;
                    posVerTab=2;
                    if(tabla[posHorTab][posVerTab] == 'O' && tabla[posHorTab][posVerTab]== 'X'){
                        k = 1;
                        System.out.println("Casilla ocupada inserte otra posicion valida!!");
                    }
                    break;
                case 7:
                    posHorTab=2;
                    posVerTab=0;
                    if(tabla[posHorTab][posVerTab] == 'O' && tabla[posHorTab][posVerTab]== 'X'){
                        k = 1;
                        System.out.println("Casilla ocupada inserte otra posicion valida!!");
                    }
                    break;
                case 8:
                    posHorTab=2;
                    posVerTab=1;                    
                    if(tabla[posHorTab][posVerTab] == 'O' && tabla[posHorTab][posVerTab]== 'X'){
                        k = 1;
                        System.out.println("Casilla ocupada inserte otra posicion valida!!");
                    }
                    break;
                case 9:
                    posHorTab=2;
                    posVerTab=2;                    
                    if(tabla[posHorTab][posVerTab] == 'O' && tabla[posHorTab][posVerTab]== 'X'){
                        k = 1; 
                        System.out.println("Casilla ocupada inserte otra posicion valida!!");
                    }
                    break;
            }
        }while (k == 1);                
                     
        tabla [posHorTab][posVerTab] = 'X';
    }    
    
    public void contraJugada(){
        int posHorCon, posVerCon, k;
        
        do{            
            posHorCon = (int)random()%3;
            posVerCon = (int)random()%3;
            k=0;
            if(tabla[posHorCon][posVerCon] == 'X'|| tabla[posHorCon][posVerCon]=='O'){
                k=1;
            }
        }while(k==1);
        
        tabla[posHorCon][posVerCon]='O';
    }
}
