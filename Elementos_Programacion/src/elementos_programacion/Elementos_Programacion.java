/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos_programacion;

import java.util.Scanner;

/**
 *
 * @author Usagui
 */
public class Elementos_Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner entradaScanner = new Scanner(System.in);
        String bandera;
        System.out.println("Iniciando...");        
        System.out.println("Presione start para empezar");
        bandera = entradaScanner.next();        
        if(bandera.equals("start")==true){
            mostrarOperaciones();          
            System.out.println("Ingrese que operacion va a realizar:");  
            int opcion = entradaScanner.nextInt();
            seleccionarOperacion(opcion,entradaScanner);                                                                
        }else{
            System.out.println("Cerrando...");
        }
    }
    public static void mostrarOperaciones(){
        System.out.println("Tenemos las siguientes operaciones:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Logaritmo de Base 10");
        System.out.println("7. Logaritmo de Base e");
        System.out.println("8. coseno de un angulo");
        System.out.println("9. seno de un angulo");
        System.out.println("10. tangente de un angulo");        
    }
    public static void seleccionarOperacion(int operacion, Scanner nuevaEntrada){         
        Calculadora prueba;        
        int primerValor;
        int segundoValor;
        int entrada3;                
        switch(operacion){
                case 1:                                
                    System.out.println("Ingrese Primer Valor a Sumar");
                    primerValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese Segundo Valor a Sumar");
                    segundoValor = nuevaEntrada.nextInt();
                    prueba = new Calculadora(primerValor,segundoValor);
                    prueba.suma();
                    prueba.mostrarResultado();                    
                  break;
                case 2:           
                    System.out.println("Ingrese Primer Valor a Restar");
                    primerValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese Segundo Valor a Restar");
                    segundoValor = nuevaEntrada.nextInt();
                    prueba = new Calculadora(primerValor,segundoValor);
                    prueba.resta();
                    prueba.mostrarResultado();
                  break;   
                case 3:           
                    System.out.println("Ingrese Primer Valor a multiplicar");
                    primerValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese Segundo Valor a multiplicar");
                    segundoValor = nuevaEntrada.nextInt();
                    prueba = new Calculadora(primerValor,segundoValor);
                    prueba.multiplicacion();
                    prueba.mostrarResultado();
                  break;     
                case 4:
                    System.out.println("Ingrese Primer Valor a dividir");
                    primerValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese Segundo Valor a dividir");
                    segundoValor = nuevaEntrada.nextInt();
                    prueba = new Calculadora(primerValor,segundoValor);
                    prueba.division();
                    prueba.mostrarResultado();
                  break;
                case 5:
                    System.out.println("Ingrese un numero: ");
                    primerValor = nuevaEntrada.nextInt();
                    System.out.println("Elevado a...");
                    segundoValor = nuevaEntrada.nextInt();
                    prueba = new Calculadora(primerValor,segundoValor);
                    prueba.potencia();
                    prueba.mostrarResultado();
                  break;
                case 6:                    
                    System.out.println("Ingrese un numero a calcular");
                    entrada3 = nuevaEntrada.nextInt();
                    prueba = new Calculadora(entrada3);
                    prueba.logaritmo10();     
                    prueba.mostrarResultado();
                  break;
                case 7:
                    System.out.println("Ingrese un numero a calcular");
                    entrada3 = nuevaEntrada.nextInt();
                    prueba = new Calculadora(entrada3);
                    prueba.logaritmoE();      
                    prueba.mostrarResultado();
                  break;
                case 8:
                    System.out.println("Ingrese un angulo a calcular");
                    entrada3 = nuevaEntrada.nextInt();
                    prueba = new Calculadora(entrada3);
                    prueba.coseno();          
                    prueba.mostrarResultado();
                  break;
                case 9:
                    System.out.println("Ingrese un angulo a calcular");
                    entrada3 = nuevaEntrada.nextInt();
                    prueba = new Calculadora(entrada3);
                    prueba.seno();            
                    prueba.mostrarResultado();
                  break;
                case 10:
                    System.out.println("Ingrese un angulo a calcular");
                    entrada3 = nuevaEntrada.nextInt();
                    prueba = new Calculadora(entrada3);
                    prueba.tangente();        
                    prueba.mostrarResultado();
                  break;
            }
    }   
}
