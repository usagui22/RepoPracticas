/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos_programacion;

/**
 *
 * @author Usagui
 */
public class Calculadora {    
    private int valor1;
    private int valor2;
    private int resultado=0;
    
    public Calculadora(int numero1, int numero2){                      
        valor1 = numero1;
        valor2 = numero2;        
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
    public void logaritmo10(int numero){
        resultado = (int) Math.log10(numero);
    }
    public void logaritmoE(int numero){
        resultado =(int) Math.log(numero);
    }
    public void coseno(int angulo){
        resultado = (int)Math.cos(angulo);
    }
    public void seno(int angulo){
        resultado = (int)Math.sin(angulo);
    }
    public void tangente(int angulo){
        resultado = (int)Math.tan(angulo);
    }
    public void mostrarResultado(){
        System.out.println("El resultado es:" + resultado);
    }
    
}
