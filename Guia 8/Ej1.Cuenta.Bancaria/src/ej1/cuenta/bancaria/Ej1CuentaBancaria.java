/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.cuenta.bancaria;

import ej1.cuenta.bancaria.entidades.CuentaBancaria;
import ej1.cuenta.bancaria.servicios.Servicios;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ej1CuentaBancaria {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Servicios cbs = new Servicios();
        CuentaBancaria c1 = cbs.cuenta_bancaria_servicios();
        
        cbs.crear_cuenta(c1);
        
        int option;
        System.out.println("Hola " + c1.getNombreCliente() + ", bienvenido a e-Bank!");
        System.out.println(" ");
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Consultar datos de la cuenta");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Retirar dinero");
            System.out.println("5. Extracción rápida");
            System.out.println("6. Salir");
            option = leer.nextInt();
            switch (option) {

                case 1:
                    cbs.consultar_saldo(c1);
                    break;
                case 2:
                    cbs.consultar_datos(c1);
                    
                    break;
                case 3:
                    cbs.ingresar_dinero(c1);
                    break;
                case 4:
                   cbs.retirar_dinero(c1);
                    break;
                case 5:
                    cbs.extraccion_rapida(c1);
                    break;
                case 6:
                    System.out.println("Adios!");
                    break;
                    
                default:
                    System.out.println("Opción no válida");
            }

        } while (option != 6);
    }

}
