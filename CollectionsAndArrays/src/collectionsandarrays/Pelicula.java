/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsandarrays;

/**
 *
 * @author Usagui
 */
public class Pelicula {
    private String name;
    private int duracion;
    
    public Pelicula(String Newname){
    name = Newname;
    }
    public void verNombre(){
         System.out.println(name);
    }
    public String getName(){
        return name;
    }
}
