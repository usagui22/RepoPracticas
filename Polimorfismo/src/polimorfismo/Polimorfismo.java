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
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda estudiante = new AgendaEscolar();
        Agenda profesional = new AgendaProfesional();        
        
        estudiante.registroCitas(23, 5,"Comunicado Escolar: Reunion de padres de familia");
        System.out.println(estudiante);
        profesional.registroCitas(5, 3, "Reunion de Presentacion por Mantenimiento Economico");
    }
    
}
