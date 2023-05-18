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
public class EjerciciosPracticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        //EJERCICIO 1
        
       /* 
        int [] vector = new int[100];
        
        
        System.out.println("CRECIENDO");
        for (int i = 0; i < vector.length; i++) {
           
            vector[i]=i+1;
            System.out.println(vector[i]);
        }
        
        System.out.println(" ");
        
        System.out.println("DECRECIENDO");
        for (int i = vector.length-1; i >=0 ; i--) {
            
            System.out.println(vector[i]);
            
        }
        
        */
       
       
       
       //EJERCICIO 2
       
       /*
       int contador=0;
       
        System.out.println("Ingrese el tamaño del vector");
         int n=leer.nextInt();
         
         int [] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            vector[i]=(int)(Math.random() * 10);
            
           
        }
        
        System.out.println("Ingrese un numero a buscar");
        int num=leer.nextInt();
    
        
        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i]==num) {
                contador++;
                System.out.println("El numero " +num+ " se encuentra en la posición " + i + " del arreglo");
                
            }
            
            
                
            }
             if (contador>1) {
                 
                 System.out.println("El numero se encuentra repetido " +contador+ " veces.");
             }

        */
       
       
       //EJERCICIO 3
       /*
       
       
        int contador = 0;
        int digito1 = 0;
        int digito2 = 0;
        int digito3 = 0;

        int[] vector = new int[50];

        for (int i = 0; i < vector.length; i++) {

            vector[i] = (int) (Math.random() * 1000);

        }

        for (int i = 0; i < vector.length; i++) {

            int numero = vector[i];
            do {

                numero = numero / 10;
                contador++;

            } while (numero != 0);
            //System.out.println("digitos " + contador);

            switch (contador) {

                case 1:
                    digito1++;
                    break;
                case 2:
                    digito2++;
                    break;
                case 3:
                    digito3++;
                    break;

            }

            contador = 0;

        }

        for (int i = 0; i < vector.length; i++) {

            System.out.println(vector[i]);

        }

        System.out.println("El vector tiene " + digito1 + " numero de 1 digito");
        System.out.println("El vector tiene " + digito2 + " numeros de 2 digitos");
        System.out.println("El vector tiene " + digito3 + " numeros de 3 digitos");
       
        */
       
       //EJERCICIO 4
       
       /*
       
       int [][] matriz = new int [4][4];
               
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
           
                 matriz[i][j] = (int) (Math.random() * 10);
                 
                 System.out.print(matriz[i][j]);
                
                 
             }
             System.out.println(" ");
        }
        
         System.out.println(" ");
         System.out.println("Matriz Inversa");
         
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                System.out.print(matriz[j][i]);
                
            }
            System.out.println(" ");
        }
        
        */
       
        //EJERCICIO 5
       /*
        int [][] matriz1 = new int [3][3];
        int [][] matriz2 = new int [3][3];
        int contador = 0;
        
        
        System.out.println("MATRIZ 1");
        System.out.println(" ");
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                    
               matriz1[i][j] = (int)(Math.random()*10);
               
                System.out.print(matriz1[i][j]);
            }
            System.out.println(" ");
        }
       
        System.out.println(" ");
         System.out.println("MATRIZ 2");      
        System.out.println(" ");
         
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                
                matriz2[i][j]=matriz1[j][i];
                
                System.out.print(matriz2[i][j]);
                
            }
                System.out.println(" ");
        }
         
        for (int i = 0; i < matriz1.length; i++) {
               for (int j = 0; j < matriz1.length; j++) {
                   
                   if (matriz1[i][j]==matriz2[i][j]*-1) {
                       contador++;
                       
                   }
                
                }
            
            }
            
            if (contador==matriz1.length*matriz2.length) {
            System.out.println("la matriz es antisimetrica");
            
        }else{
            System.out.println("la matriz no es antisimetrica");
        }
        
        */
        
        //EJERCICIO 6
       
         /*
        System.out.println("Ingrese el tamaño de la matriz");
        int n = leer.nextInt();
        int valorInicial, resultado, contador = 1;
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese el valor de la posicion " + "(" + i + "," + j + ")");
                matriz[i][j] = leer.nextInt();
            }
        }

        valorInicial = sumaFilas(matriz, n, 0);
        System.out.println("La suma de la fila 0 es " + valorInicial);
        for (int i = 1; i < n; i++) {
            resultado = sumaFilas(matriz, n, i);
            //System.out.println("La suma de la fila " + i + " es " + resultado);
            if (resultado == valorInicial) {
                contador++;
            }
        }

        for (int j = 0; j < n; j++) {
            resultado = sumaColumnas(matriz, n, j);
            //System.out.println("La suma de la columna " + j + " es " + resultado);
            if (resultado == valorInicial) {
                contador++;
            }
        }

        resultado = sumaDiagonal(matriz, n);
        if (resultado == valorInicial) {
            contador++;
        }

        resultado = sumaDiagonalInv(matriz, n);
        if (resultado == valorInicial) {
            contador++;
        }

        if (contador == n + n + 2) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }

        //System.out.println(contador);
    }

    public static int sumaFilas(int[][] _matriz, int n, int fila) {
        int valor = 0;
        for (int j = 0; j < n; j++) {
            valor += _matriz[fila][j];
        }
        return valor;
    }

    public static int sumaColumnas(int[][] _matriz, int n, int columna) {
        int valor = 0;
        for (int i = 0; i < n; i++) {
            valor += _matriz[i][columna];
        }
        return valor;
    }

    public static int sumaDiagonal(int[][] _matriz, int n) {
        int valor = 0;
        for (int i = 0; i < n; i++) {
            valor += _matriz[i][i];
        }
        return valor;
    }

    public static int sumaDiagonalInv(int[][] _matriz, int n) {
        int valor = 0, j = 0;
        for (int i = n - 1; i >= 0; i--) {
            valor += _matriz[i][j];
            j++;
        }
        return valor;
   
        */
          
         
    }
}
        
  

