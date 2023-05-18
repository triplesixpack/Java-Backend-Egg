/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import libro.servicios.Servicios;
import libro.entidades.Libro;
/**
 *
 * @author Seba
 */
public class Ej1Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicios L = new Servicios();
       
        Libro L1 = L.crearLibro();
        
        System.out.println(L1.toString());
        
    }
    
}
