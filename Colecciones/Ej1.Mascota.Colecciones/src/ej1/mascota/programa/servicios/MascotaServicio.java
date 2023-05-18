/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.mascota.programa.servicios;

import ej1.mascota.programa.entidades.Mascota;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class MascotaServicio {

    private Scanner leer;

    private List<Mascota> mascotas;

    public MascotaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public Mascota mascota_servicio() {

        System.out.println("Bienvenido a e-Mascota, la plataforma para enlistar mascotas");

        return new Mascota();
    }

    public void crear_mascota() {

        System.out.println("Agregar raza de la mascota");
        String raza = leer.next();

        Mascota m = new Mascota(raza);
        mascotas.add(m);

    }

    public void lista_mascota() {

        for (Mascota aux : mascotas) {

            System.out.println(aux);

        }
        System.out.println("cantidad = " + mascotas.size());
    }

    public void agregar_mascota() {

        System.out.println("Desea agregar otra mascota?");
        String resp = leer.next().toUpperCase();

        while (resp.equalsIgnoreCase("SI")) {
            crear_mascota();
            System.out.println("Desea agregar otra mascota?");
            resp = leer.next().toUpperCase();
        }
    }

    //  EJERCICIO 2
    public void recorrer_lista() {
        Iterator<Mascota> it = mascotas.iterator();
        

        //System.out.println("Elementos de la lista ");
        //for (Mascota aux : mascotas) {
          //  System.out.println(aux);
       // }

        System.out.println("Que elemento desea eliminar");
        String resp = leer.next();
       
        while(it.hasNext()){
            if (it.next().getRaza().equals(resp)) {
               it.remove();
            }
           
        } 

        System.out.println("Elementos de la lista luego de borrar");
        for (Mascota aux : mascotas) {
            System.out.println(aux);
        }

    }

}
