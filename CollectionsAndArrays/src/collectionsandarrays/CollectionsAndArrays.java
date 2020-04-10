/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsandarrays;

import java.util.ArrayList;

/**
 *
 * @author Usagui
 */
public class CollectionsAndArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula pUno = new Pelicula("Duro de matar");
        Pelicula pDos = new Pelicula("Arma Mortal");
        String inside = "";
        inside = pUno.getName();
        mostrarLista(inside);
        inside = pDos.getName();
        mostrarLista(inside);
    }
    public static void mostrarLista(String nameIn){
        ArrayList<String> coleccion = new ArrayList<String>();
        coleccion.add(nameIn);
        System.out.println(coleccion);
    }
}
