/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext4.cuenta.servicios;

import ejext4.cuenta.entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Servicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta retirar_dinero() {

        int option;
        double min = 1000;
        double max = 10000;

        double saldo = (double) Math.floor(Math.random() * (max - min + 1) + (min));

        System.out.println("Por favor, ingrese el nombre del titular de la cuenta");
        String titular = leer.next();
        System.out.println(" ");
        
        System.out.println("Hola " + titular + ", bienvenido a e-Bank!");
        System.out.println(" ");
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1. Ver saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            option = leer.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Su saldo es de: $" + saldo);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Ingrese el monto a depositar");
                    double dep = leer.nextDouble();
                    System.out.println(" ");
                    ingresarDinero(saldo, dep);
                    break;
                case 3:
                    System.out.println("Ingrese el monto a retirar");
                    double ret = leer.nextDouble();
                    System.out.println(" ");
                    retirarDinero(saldo, ret);
                    break;
                case 4:
                    System.out.println("Adios!");
                    break;
            }

        } while (option != 4);

        return new Cuenta();

    }

    public void ingresarDinero(double _saldo, double _dep) {

        if (_dep > 0) {

            _saldo += _dep;
            System.out.println("Se ingresaron $" + _dep + " a la cuenta");
            System.out.println("Su nuevo saldo es: " + _saldo);
            System.out.println(" ");

        }

    }

    public void retirarDinero(double _csaldo, double _ret) {

        if (_ret > 0 && _csaldo >= _ret) {
            _csaldo -= _ret;
            System.out.println("Extracción realizada con éxtio");
            System.out.println("Su nuevo saldo es: " + _csaldo);
            System.out.println(" ");

        } else {

            if (_csaldo == 0 || _csaldo < _ret) {
                System.out.println("Saldo insuficiente, no se pudo retirar el monto ingresado");
                System.out.println(" ");
            }
        }

    }
}
