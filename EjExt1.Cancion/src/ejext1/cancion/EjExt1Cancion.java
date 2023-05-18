/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext1.cancion;

import ejext1.cancion.entidades.Cancion;
import servicios.cancion.Servicios;

/**
 *
 * @author Seba
 */
public class EjExt1Cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Servicios s1 = new Servicios();
        Cancion song = s1.ficha();
       

    }
    
}
