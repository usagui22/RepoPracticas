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
public class Elementos_Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora prueba = new Calculadora(3,5);
        prueba.suma();
        prueba.mostrarResultado();
        prueba.resta();
        prueba.mostrarResultado();
        prueba.multiplicacion();
        prueba.mostrarResultado();
        prueba.division();
        prueba.mostrarResultado();
        prueba.coseno(33);
        prueba.mostrarResultado();
        prueba.seno(66);
        prueba.mostrarResultado();
        prueba.tangente(98);
        prueba.mostrarResultado();
        prueba.logaritmo10(15);
        prueba.mostrarResultado();
        prueba.logaritmoE(36);
        prueba.mostrarResultado();
        prueba.potencia();        
        prueba.mostrarResultado();        
    }
    
}
