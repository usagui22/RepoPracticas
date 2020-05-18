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
public class Cientifica {
    private int resultado ;
    private double razon;
   
    public Cientifica(){     
    }    
     public void sumatoriaNumerosConsecutivos(int limite){                        
        for(int i = 1; i <= limite;i++){
            resultado=((limite*(limite+1))/2);
        }        
    }
    public void sumatoriaCuadradosConsecutivos(int limiteCuadrado){
        for(int i=1;i<=limiteCuadrado;i++){
            resultado = (limiteCuadrado * (limiteCuadrado+1)*(2*limiteCuadrado+1))/6;
        }
    }
    public void sumatoriaCubosConsecutivos(int limiteCubo){
        for(int i=1; i<=limiteCubo;i++){
            resultado = (int) Math.pow(((limiteCubo*(limiteCubo+1))/2),2);
        }
    }
    public void progresionAritmetica(int primerTermino, int razon,int n){
        resultado= primerTermino+razon * (n-1);
    }
    public void diferenciaProgresionAritmetica(int primerTermino, int siguienteTermino){
        resultado = primerTermino - siguienteTermino;
    }
    public void sumaProgresionAritmetica(int primerTermino, int n, int ultimoTermino){
        resultado = (n*(primerTermino + ultimoTermino)) / 2;
    }
    public void progresionGeometrica(int razon, int primerTermino, int n){
        resultado = (int)primerTermino * (int)Math.pow(razon, n-1);        
    }
    public void sumaProgresionGeometricaInfinita(int primerTermino, double razon){
        resultado = primerTermino/(int)(razon-1);
    }
    public void sumaProgresionGeometricaFinita(int primerTermino, int razon,int n){
        resultado = (int)(primerTermino*(Math.pow(razon, n)-1))/(razon-1);
    }
    public void razonProgresionGeometrica(int primerTermino, int siguienteTermino){
        razon = siguienteTermino / primerTermino;
        System.out.println("La razon es: " + razon);
    }
    public void mostrarResultado(){
        System.out.println("El resultado es:" + resultado);
    }     
}
