/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsandarrays;

import java.util.Scanner;

/**
 *
 * @author Usagui
 */
public class CollectionsAndArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                               
        ingresarDatos();
        ListaNumeros otraLista = new ListaNumeros(1,100);
        otraLista.tour();                
    }
    private static void ingresarDatos(){
        Peliculas plist = new Peliculas();               
        String entrada ="";
        Scanner entradaScanner = new Scanner(System.in);       
        entrada = entradaScanner.next();
        if(entrada.compareTo("end")== 0){            
            System.out.println("no permitido");   
            entradaScanner.close();
            plist.verLista();
        }else{
           
            System.out.println("guardando");
            plist.AddMovie(entrada);        
            plist.verLista();
                     
        }
                
    }
   
}
