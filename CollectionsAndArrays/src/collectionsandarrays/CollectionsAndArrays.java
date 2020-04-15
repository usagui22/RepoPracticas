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
        Peliculas plist = new Peliculas("Duro de matar");
        plist.AddMovie("Arma Mortal");
        plist.verLista();
        ListaNumeros otraLista = new ListaNumeros(1,100);
        otraLista.tour();                
    }
}
