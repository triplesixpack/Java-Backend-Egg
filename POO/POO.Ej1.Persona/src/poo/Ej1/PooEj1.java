/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.Ej1;

import java.util.Scanner;
import poo.entidades.Persona;

/**
 *
 * @author Seba
 */
public class PooEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        
        
        p1.nombre = "Sebastián Gabriel Cuart";
        p1.apodo = "Seba";
        p1.edad = 25;
        p1.género = "Hombre";
        p1.pelo = true;
        
        System.out.println(p1.nombre + " " + p1.apodo + " " + p1.edad + " " + p1.género + " " + " pelo= " + p1.pelo);
    }
    
}
