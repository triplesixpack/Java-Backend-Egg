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
public class EjerciciosExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //EJERCICIO 1
        
        /*
        int i,n,m,suma=0;
  
        System.out.println("Ingrese el tamaño del vector");   
        n = leer.nextInt();
        
        int [] vector = new int [n];
        
        for ( i = 0; i < vector.length; i++) {
            
            System.out.println("Ingrese un digito");
            m = leer.nextInt();
            
            suma=suma+m;
            
        }
        
        System.out.println("La suma de todos lo elementos agregados es: " +suma);
        
         */
        
        //EJERCICIO 2
        
        /*
        int n, cont = 0, digit;

        System.out.println("Ingrese el tamaño de los vectores.");
        n = leer.nextInt();

        int[] vec1 = new int[n];
        int[] vec2 = new int[n];

        for (int i = 0; i < vec1.length; i++) {
            digit = (int) (Math.random() * 10);
            vec1[i] = digit;
            System.out.print(vec1[i] + " ");

        }

        System.out.println(" ");

        for (int i = 0; i < vec2.length; i++) {
            digit = (int) (Math.random() * 10);
            vec2[i] = digit;
            System.out.print(vec2[i] + " ");

        }

        System.out.println(" ");

        for (int i = 0; i < vec1.length; i++) {
            if (vec1[i] == vec2[i]) {
                cont++;
            }
        }
        
            if (cont == n) {
                System.out.println("Todos los elementos son iguales");
            }else{
                System.out.println("Los elementos no son iguales");
        }
        
         */
        
        //EJERCICIO 3
        
        /*
        int n;

        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] vector = new int[n];

        vector = llenar(n);

        mostrar(vector, n);
    }

    public static int[] llenar(int n) {
        int[] _vector = new int[n];
        for (int i = 0; i < n; i++) {
            _vector[i] = (int) (Math.random() * 10);
        }
        return _vector;
    }

    public static void mostrar(int[] _vector, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(_vector[i] + " ");
        }
        System.out.println("");
         */
        
        
        //EJERCICIO 4
        
        /*
        int n1, n2, n3, n4;
        double[] notas = new double[10];
        int apr = 0;
        int desap = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Notas del alumno " + i);
            n1 = nota();
            
            n2 = nota();
            
            n3 = nota();
            
            n4 = nota();
           

            notas[i] = (n1 * 0.1) + (n2 * 0.15) + (n3 * 0.25) + (n4 * 0.5);
            
             if (notas[i] >= 7) {
                System.out.println("El alumno " + i + " aprobó con un promedio de " + notas[i]);
                apr=apr+1;
                
            } else {
                System.out.println("El alumno " + i + " no aprobó");
                desap=desap+1;
                }
        }   
            System.out.println(" ");
            System.out.println("La cantidad de aprobados es: " +apr);
            System.out.println("La cantidad de desaprobados es: " +desap);
    }

    
    public static int nota () {
        
        Scanner leer = new Scanner (System.in);
        int nota;
    
        do {
            System.out.println("La nota debe estar entre 0 y 10");
            nota=leer.nextInt();
           
            
        } while (nota<0 || nota >10);
        
    return nota;
    
}
         */
        
        //EJERCICIO 5
        
        /*
        int n,m,suma;
        suma=0;
        System.out.println("Ingrese la dimension de la matriz");
        n=leer.nextInt();
        m=leer.nextInt();
        
        int [][] matriz = new int [n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j] + " ");
               
                
                suma=suma+(matriz[i][j]);
                
                
                
            }
             System.out.println(" ");
        }
       
        System.out.println("La suma de los elementos es: " +suma);
        
        
         */
        
        //EJERCICIO 6
        
        /*
        
     String[][] matriz = new String[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int num = (int) (Math.random() * 9);
                matriz[i][j] = String.valueOf(num);
            }
        }

        for (int i = 0; i < 5; i++) {
            String palabra = checkFrase();
            llenarMatriz(matriz, palabra);
        }

    }

    public static String checkFrase() {
        String frase;
        
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese una palabra de mínimo 3 y máximo 5 caracteres");
            frase = leer.next();
            
        } while (frase.length() < 3 || frase.length() > 5);

        return frase;
    }

    public static void llenarMatriz(String[][] _matriz, String _palabra) {
        int fila = (int) (Math.random() * 19);
        int c = 0;
        int columna = (int) (Math.random() * (19 - _palabra.length()));
        for (int j = columna; j < columna + _palabra.length(); j++) {
            _matriz[fila][j] = _palabra.substring(c, c + 1);
            c++;
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(_matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
         */
        
        //EJERCICIO7
        
        /*
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                vector[i] = 1;
            } else {
                vector[i] = vector[i - 1] + vector[i - 2];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println(" ");
        
        */
       
    }
}
