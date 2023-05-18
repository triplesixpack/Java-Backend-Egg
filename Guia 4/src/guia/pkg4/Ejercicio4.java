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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
       
       
       
        System.out.println("El numero es primo? " +primo());
        
       
       
    }
    
    
    
    public static boolean primo(){
    
        Scanner leer = new Scanner (System.in);
        int n,i,j;
        
        j=0;
        
        System.out.println("Ingrese un numero");
        n = leer.nextInt();
       
        
        for (i = 1; i <= n; i++) {
            
             
            
            if (n%i==0) {
                
          
             j++;    
                
            }
           
        }
        
       
        if (j>2) {
            
            return false;
            
            
        }
        
        return true;
        
       
    
   
    
    }
   
}
