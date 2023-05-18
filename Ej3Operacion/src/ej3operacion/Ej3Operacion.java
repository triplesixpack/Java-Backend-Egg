/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3operacion;

import operacion.entidades.Operacion;
import operacion.servicios.Servicios;

/**
 *
 * @author Seba
 */
public class Ej3Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Servicios c1 = new Servicios();
        
        Operacion op = c1.crearOperacion();
        
        c1.calculos(op);
    }
    
}
