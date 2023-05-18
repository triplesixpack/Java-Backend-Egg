/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia.pkg4.pkg6;

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class EjerciciosPracticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       
       //EJERCICIO 1
      
       /*
       int num;
       
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        if (num%2==0) {
            
            System.out.println("El número " +num+ " es par.");
            
        } else{
            System.out.println("El número " + num+ " es Impar");
            
        }
        */
       
       
       //EJERCICIO 2
       
       /*
       String pass;
     
       
        System.out.println("Ingrese la CLAVE: ");
        pass = leer.nextLine();
            
            if (pass.equalsIgnoreCase("eureka")) {
            System.out.println("CORRECTO");
            
        }else{
            
            System.out.println("INCORRECTO");
        }
         
        */
       
       
       //EJERCICIO 3
       /*
       String frase;
       
        System.out.println("Ingrese una frase con 8 digitos: ");
        frase = leer.nextLine();
        
        if (frase.length()==8) {
            
            System.out.println("CORRECTO");
            
        }else{
            
            System.out.println("INCORRECTO");
            
        }
       
        */
       
       
       //EJERCICIO 4
       /*
       
       String frase;
        System.out.println("ingresa una frase");
        frase=leer.nextLine();
        
        
        
        char caracter = frase.charAt(0);
        String str = String.valueOf(caracter);
            
        
        if (str.equalsIgnoreCase("A")){
            System.out.println("CORRECTO");
            
        }else {
            System.out.println("incorrecto");
        }
            
       */
       
       
         //EJERCICIO 5
       /*
       int limit, num, result;
       result=0;
        System.out.println("Ingrese un numero limite al que quiera llegar");
       limit = leer.nextInt();
       
        do {
            
            System.out.println("Ingrese un numero a sumar: ");
            num = leer.nextInt();
            
            result = num + result;
            
            
        } while (result<=limit);
        
            
        System.out.println("Has superado el limite: " +result);
        */
       
         //EJERCICIO 6
      
         /*
         int num1,num2,suma,resta,mult,op;
         double div, result;
       
         System.out.println("Ingrese dos numeros positivos");
         num1 = leer.nextInt();
         num2 = leer.nextInt();
         do{
         System.out.println("1. Suma");
         System.out.println("2. Resta");
         System.out.println("3. Multiplicacion");
         System.out.println("4. Division");
         System.out.println("5. Salir");
         System.out.println("Seleccione una opcion");
         op = leer.nextInt();
             
         
         switch (op) {
              
                 case 1:
                         result = num1 + num2;
                        System.out.println("La suma entre " +num1+ " y " +num2+ " es: " +result);
                        System.out.println(" ");
                        break;
                        
                 case 2:
                         result = num1 - num2;
                        System.out.println("La resta entre " +num1+ " y " +num2+ " es: " +result);
                        System.out.println(" ");
                        break;
                 case 3:
                         result = num1 * num2;
                        System.out.println("La multiplicacion entre " +num1+ " y " +num2+ " es: " +result);
                        System.out.println(" ");
                        break;
                 case 4:
                         result = num1 / num2;
                        System.out.println("La division entre " +num1+ " y " +num2+ " es: " +result);
                        System.out.println(" ");
                        break;
            }           
            
         }while (op!=5);    
         
         System.out.println("Adios!");
         
         */
         
          //EJERCICIO 7
        
          /*
        String codigo;
       int incorrecto=-1;
       int correcto=0;

       
       
       do{
        System.out.println("ingresa la secuencia");
       codigo=leer.next();
       
       int longitud=codigo.length();
       
           if (codigo.length()>5 || codigo.length()<2) {
               incorrecto++;
               
               
           }else if (codigo.substring(0,1).equalsIgnoreCase("X") && (codigo.substring(longitud-1)).equalsIgnoreCase("O")) {
               
               correcto++;
           }else{
               incorrecto++;
           }
           
           
           
       
       }while(!codigo.equals("&&&&&"));
       
       
        System.out.println("la cantidad de secuencias correctas es de " + correcto);
        System.out.println("la cantidad de secuencias incorrectas es de " + incorrecto);
         */
        
        //EJERCICIO 8
        /* 
                int i;
		int j;
		int num;
		System.out.println("Ingrese un número positivo mayor que 0");
		num = leer.nextInt();
		for (i=1;i<=num;i++) {
			for (j=1;j<=num;j++) {
				if ((i!=1 && i!=num) && (j!=1 && j!=num)) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
         */
         
         
         
      

    }
    
}
