/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2.cafetera.servicios;

import ej2.cafetera.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Servicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera CafeteraServicio() {

        System.out.println("Ingrese la capacidad máxima de la cafetera (en ml)");
        int capMax = leer.nextInt();

        System.out.println(" ");

        System.out.println("Ingrese cuantos ml de café le quedan a la cafetera");
        int cantActual = leer.nextInt();

        return new Cafetera(capMax, cantActual);
    }

    public void llenar_cafetera(Cafetera _capMax) {

        int capMax = _capMax.getCapacidadMaxima();
        _capMax.setCantidadActual(capMax);

    }

   
   public void servir_taza(Cafetera _cafetera, int _taza) {
        
       int capActual = _cafetera.getCantidadActual();
        if (capActual > 0) {
            if (_taza <= capActual) {
                _cafetera.setCantidadActual(capActual - _taza);
                System.out.println("La taza está llena");
            } else {
                System.out.println("La taza se lleno hasta " + capActual);
                _cafetera.setCantidadActual(0);
            }
        } else {
            System.out.println("La cafetera está vacía");
        }

    }

    public void vaciar_cafetera(Cafetera _vaciar) {

        _vaciar.setCantidadActual(0);

        System.out.println("Se ha vaciado la cafetera");
        System.out.println(_vaciar.getCantidadActual());
        System.out.println(" ");

    }

    public void agregar_cafe(Cafetera _agregar) {

        System.out.println("Ingrese la cantidad de café que quiere agregar a la cafetera");
        int agregar = leer.nextInt();

        if (agregar > _agregar.getCapacidadMaxima()) {
            System.out.println("Has revalsado la cafetera, que enchastre!!");
            System.out.println(" ");
        }

        if (agregar <= _agregar.getCapacidadMaxima() && agregar != 0) {
            System.out.println("Se han agregado " + agregar + "ml de café a la cafetera");
            System.out.println(" ");
            _agregar.setCantidadActual(agregar);
        }

    }

}
