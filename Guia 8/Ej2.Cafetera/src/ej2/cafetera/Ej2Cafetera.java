/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2.cafetera;

import ej2.cafetera.entidades.Cafetera;
import ej2.cafetera.servicios.Servicios;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ej2Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        
        Servicios c1 = new Servicios();
        Cafetera caf = c1.CafeteraServicio();
        
        
        int option;
        System.out.println("Hola bienvenido a e-Cafetera!");
        System.out.println(" ");
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Salir");
            System.out.println(" ");
            option = leer.nextInt();
            switch (option) {

                case 1:
                    c1.llenar_cafetera(caf);
                    break;
                    
                case 2:
                    System.out.print("Ingrese el tamaño de la taza: ");
                    int taza = leer.nextInt();
                    c1.servir_taza(caf,taza);
                    break;
                    
                case 3:
                    c1.vaciar_cafetera(caf);
                    break;
                    
                case 4:
                   c1.agregar_cafe(caf);
                    break;

                case 5:
                    System.out.println("Adios!");
                   break;
                   
                default:
                    System.out.println("Opción no válida");
            }

        } while (option != 5);
    }
    
}
