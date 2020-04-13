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
public class ListaNumeros {
    private int starttour;
    private int endtour;
    
    public ListaNumeros(int in, int fi){
    starttour = in;
    endtour = fi;
    }
    
    public void tour(){
    int [] t = new int [endtour];
    int contenido = starttour;
     for(int indice = 0;indice<=101;indice ++){
            if(contenido < endtour){
                t[indice] = contenido; 
                System.out.println(t[indice]);                
                contenido ++;
                
            }
            System.out.println(t[indice] + t[indice+1]);
        }     
    }
    
}
