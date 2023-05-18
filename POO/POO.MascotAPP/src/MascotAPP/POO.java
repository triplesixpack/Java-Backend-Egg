/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MascotAPP;

import MascotAPP.entidades.MASCOTA;
import MascotAPP.servicios.Servicios;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicios sm = new Servicios();
        
        Scanner leer = new Scanner (System.in);
       
        MASCOTA m1 = sm.crearMascota();
       
        System.out.println(m1.toString());
        
    }

}
