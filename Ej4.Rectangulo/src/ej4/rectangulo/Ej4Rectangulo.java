/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4.rectangulo;

import rectanguloEntidades.Rectangulo;
import servicios.rectangulo.Servicios;

/**
 *
 * @author Seba
 */
public class Ej4Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicios r1 = new Servicios();
        Rectangulo op = r1.datosR();
        
        r1.dibujo(op);
        r1.superficie(op);
        r1.perimetro(op);
    }
    
}
