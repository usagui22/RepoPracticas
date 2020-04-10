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
        mostrarLista(pUno);
        mostrarLista(pDos);
    }
    public static void mostrarLista(Pelicula p){
        ArrayList<Pelicula> coleccion = new ArrayList<Pelicula>();
        coleccion.add(p);
        System.out.println(coleccion);
    }
}
