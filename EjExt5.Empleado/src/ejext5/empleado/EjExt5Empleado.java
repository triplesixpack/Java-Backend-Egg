/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext5.empleado;

import ejext5.empleado.entidades.Empleado;
import ejext5.empleado.servicios.Servicios;

/**
 *
 * @author Seba
 */
public class EjExt5Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicios e1 = new Servicios();
        
        Empleado op = e1.n_empleado();
        
    }
    
}
