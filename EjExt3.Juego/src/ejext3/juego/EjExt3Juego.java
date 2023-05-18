/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext3.juego;

import ejext3.juego.entidades.Juego;
import ejext3.juego.servicios.Servicios;

/**
 *
 * @author Seba
 */
public class EjExt3Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Servicios s1 = new Servicios();
        Juego adivina = s1.iniciar_juego();
        
        
        
    }
    
}
