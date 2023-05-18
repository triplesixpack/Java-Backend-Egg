/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        cambio();
        
    }
    
    
    public static void cambio() {
        Scanner leer = new Scanner (System.in);
        double euro, libra, dolar, yen;
        int op;
        
        System.out.println("Ingrese la cantidad de Euros a convertir: ");
        euro=leer.nextDouble();
        
        do {
            
        System.out.println("1. Convertir a LIBRA");
        System.out.println("2. Convertir a DOLAR");
        System.out.println("3. Convertir a YEN");
        System.out.println("4. Salir");
        System.out.println("Seleccione una opción: ");
        op = leer.nextInt();
        
        switch (op){
            
            case 1:
                libra=euro*0.86;
                System.out.println(+euro+ " EUROS equivalen a " +libra+ " LIBRAS.");
                System.out.println(" ");
                break;
                case 2:
                dolar=euro*1.28611;
                System.out.println(+euro+ " EUROS equivalen a " +dolar+ " DOLARES.");
                System.out.println(" ");
                break;
                case 3:
                yen=euro*129.852;
                System.out.println(+euro+ " EUROS equivalen a " +yen+ " YENES.");
                System.out.println(" ");
                break;
               
        
      
        }
        
        } while (op!=4);     
        
        System.out.println("ADIOS!");
        System.out.println(" ");
}
    
}
