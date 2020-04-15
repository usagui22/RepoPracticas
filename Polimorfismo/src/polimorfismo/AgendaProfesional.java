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
public class AgendaProfesional extends Agenda {
    private int dia;
    private int mes;
    private int anio;
    private String contenido;
    private boolean importancia;
    
    public AgendaProfesional(){
    System.out.println("Bienvenido a tu Agenda");
    };
    public void registroCitas(int d, int m, String msg){
        boolean importa= false;
        System.out.print("Determine su importancia>");
       registroCitas(d,m,2020,importa,msg);
    };
    private void registroCitas(int d, int m,int a, boolean imp, String msg){
    dia = d;
    mes = m;
    anio = a;
    importancia = imp;
    contenido = msg;
    
    };
    
    public String toString(){
        return "Tiene una cita: ln"+dia+"/"+mes+"/"+anio+"/n"+contenido;
    }
}
