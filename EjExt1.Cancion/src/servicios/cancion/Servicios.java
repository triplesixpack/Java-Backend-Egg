/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios.cancion;

import ejext1.cancion.entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Servicios {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cancion ficha(){
        
        System.out.println("Ingrese el titulo de la cancion");
        String titulo = leer.next();
        
        System.out.println("Ingrese el nombre del autor");
        String autor = leer.next();
        
        System.out.println("El autor es: " +autor);
        System.out.println("El titulo es: " +titulo);
        return new Cancion(titulo,autor);
    }
    
    
}
