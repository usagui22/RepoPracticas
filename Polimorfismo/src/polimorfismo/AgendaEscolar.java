/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Usagui
 */
public class AgendaEscolar extends Agenda{
    private int dia;
    private int mes;
    private int anio=2020;
    private String contenido;
    private boolean importancia;
    
    public AgendaEscolar(){
        System.out.println("Bienvenido a tu Agenda");
    };
    public void registroCitas(int d, int m,String msg){
        dia = d;
        mes = m;
        contenido = msg;
        
    };
    
    public String toString(){
        return "Tiene una cita: "+dia+"/"+mes+"/"+anio+"/n"+contenido;
    }
    
}
