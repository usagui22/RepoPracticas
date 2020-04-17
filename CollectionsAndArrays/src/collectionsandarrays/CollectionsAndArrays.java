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
        //ListaNumeros otraLista = new ListaNumeros(1,100);
        //otraLista.tour();   
        ingresarDatos();
    }
    private static void ingresarDatos(){
        Peliculas movielist = new Peliculas();               
        String entrada ="";
        Scanner entradaScanner = new Scanner(System.in);       
        entrada = entradaScanner.nextLine();
        while(!entrada.equals("end")){                                             
                System.out.println("guardando");
                movielist.AddMovie(entrada);                            
                entrada = entradaScanner.nextLine();
        }
        movielist.verLista();
    }
   
}
 