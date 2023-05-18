/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext4.cuenta;

import ejext4.cuenta.entidades.Cuenta;
import ejext4.cuenta.servicios.Servicios;

/**
 *
 * @author Seba
 */
public class EjExt4Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicios t1 = new Servicios();
        
        Cuenta op = t1.retirar_dinero();
        
        
    }
    
}
