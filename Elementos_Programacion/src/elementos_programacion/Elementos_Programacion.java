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
        System.out.println("Presione start para empezar con con calculadora Basica o ingrese cientifica para empezar con calculadora cientifica");
        bandera = entradaScanner.next();        
        if(bandera.equals("start")==true){
            mostrarOperaciones();          
            System.out.println("Ingrese que operacion va a realizar:");  
            int opcion = entradaScanner.nextInt();
            seleccionarOperacion(opcion,entradaScanner);                                                                
        }else{
            System.out.println("Cerrando...");
            if(bandera.equals("cientifica")==true){
                mostrarOperacionesCientificas();
                System.out.println("Ingrese que operacion va a realizar:");  
                int opcion = entradaScanner.nextInt();
                seleccionarOperacionCientifica(opcion, entradaScanner);
            }
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
    public static void mostrarOperacionesCientificas(){
        System.out.println("Tenemos las siguientes operaciones:");
        System.out.println("1. Sumatoria de Numeros Consecutivos");
        System.out.println("2. Sumatoria de Numeros Cuadrados Consecutivos");
        System.out.println("3. Sumatoria de Numeros Cubicos Consecutivos");
        System.out.println("4. Progresion Aritmetica");
        System.out.println("5. Diferencia en Progresion Aritmetica");
        System.out.println("6. Suma de Progresion Aritmetica");
        System.out.println("7. Progresion Geometrica");
        System.out.println("8. Suma de Progresion Geometrica Infinita");
        System.out.println("9. Suma de Progresion Geometrica Finita");
        System.out.println("10. Razon de la Progresion Geometrica");        
    }
    public static void seleccionarOperacionCientifica(int operacion, Scanner nuevaEntrada){         
        Cientifica prueba = new Cientifica();        
        int primerValor;
        int segundoValor;
        int entrada3;                
        double entrada4;
        switch(operacion){
                case 1:                                
                    System.out.println("Ingrese Limite de Sumatoria");
                    entrada3 = nuevaEntrada.nextInt();
                    prueba.sumatoriaNumerosConsecutivos(entrada3);
                    prueba.mostrarResultado();                    
                  break;
                case 2:           
                    System.out.println("Ingrese Limite de Sumatoria");
                    entrada3 = nuevaEntrada.nextInt();
                    prueba.sumatoriaCuadradosConsecutivos(entrada3);
                    prueba.mostrarResultado();
                  break;   
                case 3:           
                    System.out.println("Ingrese Limite de Sumatoria");
                    entrada3 = nuevaEntrada.nextInt();
                    prueba.sumatoriaCubosConsecutivos(entrada3);
                    prueba.mostrarResultado();
                  break;     
                case 4:
                    System.out.println("Se requiere los datos de primer termino, razon, n de la progresion aritmetica");
                    System.out.println("Ingrese Primer Termino de Pregresion");
                    primerValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese razon de la Pregresion");
                    segundoValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese valor de n");
                    entrada3 = nuevaEntrada.nextInt();
                    prueba.progresionAritmetica(primerValor, segundoValor, entrada3);
                    prueba.mostrarResultado();
                  break;
                case 5:
                    System.out.println("Ingrese Termino en la posicion n");
                    primerValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese Termino en la posicion n+1");
                    segundoValor = nuevaEntrada.nextInt();
                    prueba.diferenciaProgresionAritmetica(primerValor, segundoValor);
                    prueba.mostrarResultado();
                  break;
                case 6:                    
                    System.out.println("Ingrese Termino en la posicion n");
                    primerValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese Termino en la posicion n+1");
                    segundoValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese un numero a calcular");
                    entrada3 = nuevaEntrada.nextInt();
                    prueba.sumaProgresionAritmetica(primerValor, segundoValor, entrada3);
                    prueba.mostrarResultado();
                  break;
                case 7:
                    System.out.println("Ingrese razon de la progresion");
                    primerValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese primer Termino de la progresion");
                    segundoValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese valor de n");
                    entrada3 = nuevaEntrada.nextInt();
                    prueba.progresionGeometrica(primerValor, segundoValor, entrada3);
                    prueba.mostrarResultado();
                  break;
                case 8:
                    System.out.println("Ingrese Primer Termino de la Progresion");
                    primerValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese valor de la razon menor a 1");
                    entrada4 = nuevaEntrada.nextDouble();
                    prueba.sumaProgresionGeometricaInfinita(primerValor, entrada4);                    
                    prueba.mostrarResultado();
                  break;
                case 9:
                    System.out.println("Ingrese primer Termino de la progresion");                   
                    primerValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese razon de la progresion");
                    segundoValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese valor de n");
                    entrada3 = nuevaEntrada.nextInt();                    
                    prueba.sumaProgresionGeometricaFinita(primerValor, segundoValor, entrada3);
                    prueba.mostrarResultado();
                  break;
                case 10:
                    System.out.println("Ingrese Termino de la progresion en la posicion n");                   
                    primerValor = nuevaEntrada.nextInt();
                    System.out.println("Ingrese Termino de la progresion en la posicion n + 1");
                    segundoValor = nuevaEntrada.nextInt();                  
                    prueba.razonProgresionGeometrica(primerValor, segundoValor);                    
                  break;
            }
    }   
}
