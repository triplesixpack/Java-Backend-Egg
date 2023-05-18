/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3.persona;

import ej3.persona.entidades.Persona;
import ej3.persona.servicios.Servicios;

/**
 *
 * @author Seba
 */
public class Ej3Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicios per = new Servicios();
        Persona p1 = per.persona_servicio();
        
        per.crearPersona(p1);
        System.out.println(p1.toString());
    }
    
}
