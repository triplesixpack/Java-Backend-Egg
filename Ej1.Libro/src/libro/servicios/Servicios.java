/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.servicios;

import java.util.Scanner;
import libro.entidades.Libro;

/**
 *
 * @author Seba
 */
public class Servicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {

        System.out.println("Bienvenido! A continuación deberá cargar los datos de su libro.");
        System.out.println(" ");

        System.out.println("Ingrese el título");
        String Título = leer.next();
        System.out.println(" ");

        System.out.println("Ingrese el Autor");
        String Autor = leer.next();
        System.out.println(" ");

        System.out.println("Ingrese el número total de páginas");
        int Pagina = leer.nextInt();
        System.out.println(" ");

        System.out.println("Ingrese el número ISBN");
        int ISBN = leer.nextInt();

        return new Libro(Título, Autor, Pagina, ISBN);

    }

}
