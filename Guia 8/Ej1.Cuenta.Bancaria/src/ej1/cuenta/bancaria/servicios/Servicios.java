/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.cuenta.bancaria.servicios;

import ej1.cuenta.bancaria.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Servicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria cuenta_bancaria_servicios() {

        return new CuentaBancaria();
    }

    public void crear_cuenta(CuentaBancaria _crear) {

        System.out.println("Ingrese su nombre y apellido");
        String nombreCliente = leer.next();
        _crear.setNombreCliente(nombreCliente);
        System.out.println(" ");

        System.out.println("Ingrese su número de cuenta");
        long nCuenta = leer.nextLong();
        _crear.setNumeroCuenta(nCuenta);
        System.out.println(" ");

        System.out.println("Ingrese su DNI");
        long dni = leer.nextLong();
        _crear.setDniCliente(dni);
        System.out.println(" ");
        
        double min = 1000;
        double max = 10000;

        double saldo = (double) Math.floor(Math.random() * (max - min + 1) + (min));

        _crear.setSaldoActual(saldo);

    }

    public void consultar_saldo(CuentaBancaria _saldo) {

        
        System.out.println("Su saldo es de $" + _saldo.getSaldoActual());
        System.out.println(" ");

    }

    public void consultar_datos(CuentaBancaria _datos) {
       
        System.out.println(" ");
        System.out.println("Nombre: " + _datos.getNombreCliente());
        System.out.println("Número de cuenta: " + _datos.getNumeroCuenta());
        System.out.println("Numero de documento: " + _datos.getDniCliente());
        System.out.println(" ");
    }

    public void ingresar_dinero(CuentaBancaria _ingresar) {

        System.out.println(" ");
        System.out.println("Ingrese el monto que desea depositar");
        double dep = leer.nextDouble();
        System.out.println(" ");

        if (dep > 0) {
            _ingresar.setSaldoActual(_ingresar.getSaldoActual() + dep);
            System.out.println("Se han ingresado $" + dep + " a su cuenta correctamente");
            System.out.println(" ");
        } else {
            System.out.println("El monto a ingresar debe ser mayor a 0");
            System.out.println(" ");
        }

        System.out.println("Su nuevo saldo es de " + _ingresar.getSaldoActual());
        System.out.println(" ");

    }

    public void retirar_dinero(CuentaBancaria _retirar) {

        System.out.println("Ingrese el monto que desea retirar");
        double ret = leer.nextDouble();

        if (ret <= _retirar.getSaldoActual()) {
            _retirar.setSaldoActual(_retirar.getSaldoActual() - ret);
            System.out.println("Se han retirado $" + ret + " de su cuenta");
            System.out.println("Su saldo actual es de $" + _retirar.getSaldoActual());
        } else {
            System.out.println("Saldo insuficiente, no se puede realizar la transacción");
        }

    }

    public void extraccion_rapida(CuentaBancaria _eRapida) {

        double saldoActual = _eRapida.getSaldoActual();
        double monto = (double) (_eRapida.getSaldoActual() * 0.2);

        System.out.println("Ingrese el monto que desea retirar");
        double ret = leer.nextDouble();

        if (saldoActual > 0 && monto > 0 && ret < monto) {
            _eRapida.setSaldoActual(saldoActual - ret);
            System.out.println("Se han retirado $" + ret + " de su cuenta");
            System.out.println("Su saldo actual es de $" + _eRapida.getSaldoActual());
        } else {
            System.out.println("Saldo insuficiente, no se puede realizar la transacción");
        }

    }

}
