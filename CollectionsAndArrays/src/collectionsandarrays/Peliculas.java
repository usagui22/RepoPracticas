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
public class Peliculas {
    private String title;
    private ArrayList<String> lista = new ArrayList<String>();
    
    public Peliculas(String newMovie){
        title = newMovie;
        lista.add(title);
    }
    public Peliculas(){
    //    System.out.println("ingrese nombre de pelicula\n");
    }
    public void verLista(){
         System.out.println(lista);
    }
    public String FirstName(){
        return lista.get(0);
    }
    
    public void AddMovie(String newMovie){         
        lista.add(newMovie);
    }
    
}
