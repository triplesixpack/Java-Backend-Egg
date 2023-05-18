/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext6.rectangulo.servicios;

import ejext6.rectangulo.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Servicios {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo n_rectangulo(){
        
        
         System.out.println("Ingrese la base del rectangulo");
        double lado1 = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double lado2=leer.nextDouble();
        
        
        return new Rectangulo(lado1,lado2);
    }
    
    public void calcular_area(Rectangulo _area){
        
        double area = _area.getLado1()*_area.getLado2();
       
        System.out.println("El area del rectangulo es: " +area);
        System.out.println(" ");
        
    }
    
    public void rectangulo1(Rectangulo _rectangulo){
        
        double base = _rectangulo.getLado1();
        double altura = _rectangulo.getLado2();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");

        }
        
        
        
    }
}
