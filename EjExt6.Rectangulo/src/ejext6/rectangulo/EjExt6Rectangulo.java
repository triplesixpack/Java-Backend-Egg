/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext6.rectangulo;

import ejext6.rectangulo.entidades.Rectangulo;
import ejext6.rectangulo.servicios.Servicios;

/**
 *
 * @author Seba
 */
public class EjExt6Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicios r1 = new Servicios();
        Rectangulo op = r1.n_rectangulo();
        
        r1.calcular_area(op);
       
        r1.rectangulo1(op);
        
    }
    
}
