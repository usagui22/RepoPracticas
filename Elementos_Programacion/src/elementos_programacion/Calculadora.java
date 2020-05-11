/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos_programacion;

import java.lang.Math;

/**
 *
 * @author Usagui
 */
public class Calculadora {    
    private int valor1;
    private int valor2;
    private int valor3;
    private int resultado=0;
    
    
    public Calculadora(int numero1, int numero2){                      
        valor1 = numero1;
        valor2 = numero2;        
    } 
    public Calculadora(int numero3){
        valor3 = numero3;
    }
    public void suma(){         
        resultado = valor1 + valor2;        
    }
    public void resta(){                    
        resultado = valor1 - valor2;        
    }
    public void multiplicacion(){        
        resultado = valor1 * valor2;
    }
    public void division(){
        resultado = valor2 / valor1;
    }
    public void potencia(){
        System.out.println("base: "+valor1+" y el exponente: "+valor2);
        resultado = (int) Math.pow(valor1,valor2);
    }
    public void logaritmo10(){
        resultado = (int) Math.log10(valor3);
    }
    public void logaritmoE(){
        resultado =(int) Math.log(valor3);
    }
    public void coseno(){
        resultado = (int)Math.cos(valor3);
    }
    public void seno(){
        resultado = (int)Math.sin(valor3);
    }
    public void tangente(){
        resultado = (int)Math.tan(valor3);
    }
    public void mostrarResultado(){
        System.out.println("El resultado es:" + resultado);
    }      
}
