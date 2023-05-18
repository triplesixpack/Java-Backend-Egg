/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion.servicios;

import java.util.Scanner;
import operacion.entidades.Operacion;

/**
 *
 * @author Seba
 */
public class Servicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {

        System.out.println("Ingrese 2 numeros:");
        double numero1 = leer.nextDouble();
        double numero2 = leer.nextDouble();

        return new Operacion(numero1, numero2);
    }

    public void calculos(Operacion _operacion) {
        
        double division=0;
        
        double numero1 = _operacion.getNumero1();
        double numero2 = _operacion.getNumero2();

        double suma = numero1 + numero2;
        System.out.println("La suma de los numeros " + numero1 + " y " + numero2 + " es: " + suma);
        double resta = numero1 - numero2;
        System.out.println("La resta de los numeros " + numero1 + " y " + numero2 + " es: " + resta);
        double multi = numero1 * numero2;
        System.out.println("La multiplicacion de los numeros " + numero1 + " y " + numero2 + " es: " + multi);
        if (numero2 != 0) {
            division = numero1 / numero2;
            System.out.println("La division de los numeros " + numero1 + " y " + numero2 + " es: " + division);
        } else {
            System.out.println("Error, no se puede dividir por 0");
        }

    }

}
