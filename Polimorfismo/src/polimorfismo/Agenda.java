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
public abstract class  Agenda  {
    private int dia;
    private int mes;
    private int anio;
    private String contenido;
    private boolean importancia;
    
    public Agenda(){
    System.out.println("Bienvenido a tu Agenda");
    };
    public void registroCitas(int d, int m, String msg){};

    
}
