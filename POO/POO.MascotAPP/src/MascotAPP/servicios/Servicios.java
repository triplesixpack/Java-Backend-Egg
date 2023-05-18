/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MascotAPP.servicios;

import MascotAPP.entidades.MASCOTA;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Servicios {
    
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
            
    
    public MASCOTA crearMascota(){
        
        System.out.println("Introducir nombre:");
        String nombre = leer.next();
        
        System.out.println("Introducir raza:");
        String raza = leer.next();
        
        System.out.println("Introducir edad");
        int edad = leer.nextInt();
        
        return new MASCOTA (nombre, raza, 0);
                    
        
    }
}
