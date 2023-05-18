/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import integrador.entidades.Estudiante;
import integrador.servicios.Servicios;

/**
 *
 * @author Seba
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicios estServ = new Servicios();
        
        Estudiante[] e1 = estServ.crearEstudiante();
        
        estServ.mostrarEstudiantePlus(e1);
        
    }
    
}
