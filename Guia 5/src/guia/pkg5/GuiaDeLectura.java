/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class GuiaDeLectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
       
        //EJERCICIOS 13 Y 14       
       
       int i,n;
       
       
        System.out.println("Ingrese la dimension del arreglo");
        n=leer.nextInt();
      
        
       String[] equipo = new String [n];
       
        for (i = 0; i < equipo.length; i++) {
        
            System.out.println("Ingrese un nombre: ");
            equipo[i] = leer.next();
            
        }
        
        for (String elemento: equipo) {
            System.out.println("Los nombres ingresados son: " +elemento);
        }
       
    }
}
