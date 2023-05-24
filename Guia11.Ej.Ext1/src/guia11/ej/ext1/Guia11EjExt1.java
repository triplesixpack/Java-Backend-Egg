/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11.ej.ext1;

import guia11.ej.ext1.entidades.Mascota;
import guia11.ej.ext1.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Guia11EjExt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Persona p1 = new Persona("Juan", "Perez", 18, 25689378);
        Persona p2 = new Persona("Carlos", "Gil", 40, 9359863);
        Persona p3 = new Persona("Diego", "Gimenez", 27, 20689378);
        Persona p4 = new Persona("Juana", "Azurduy", 70, 1689378);
        Persona p5 = new Persona("Sofia", "Hughes", 25, 21579824);

        Mascota m1 = new Mascota("Rolo", "Perro", "Pequeño", 2);
        Mascota m2 = new Mascota("Pipo", "Perro", "Mediano", 7);
        Mascota m3 = new Mascota("Gerard", "Gato", "Pequeño", 1);
        Mascota m4 = new Mascota("Haku", "Loro", "Mediano", 3);
        Mascota m5 = new Mascota("Hera", "Perro", "Grande", 5);

        ArrayList<Mascota> pets = new ArrayList();
        pets.add(m1);
        pets.add(m2);
        pets.add(m3);
        pets.add(m4);
        pets.add(m5);

        ArrayList<Persona> adoptante = new ArrayList();
        adoptante.add(p1);
        adoptante.add(p2);
        adoptante.add(p3);
        adoptante.add(p4);
        adoptante.add(p5);

        for (Persona aux : adoptante) {
            System.out.println(aux.getNombre() + ", qué perro desea adoptar?");
            for (Mascota pet : pets) {
                System.out.println(pet.toString());
            }
            boolean check = false;
            do {
                System.out.println("Ingrese el nombre de la mascota que quiere adoptar");
                String nombre = leer.next();
                for (Mascota pet : pets) {
                    if (nombre.equalsIgnoreCase(pet.getNombre())) {
                        check = aux.setMascota(pet);
                    }
                }

            } while (!check);
        }
    
        for (Persona persona : adoptante) {
            System.out.println(persona);
        }
        
    }
       
}
