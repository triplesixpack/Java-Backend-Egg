/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4.pelicula.colecciones.servicios;

import ej4.pelicula.colecciones.entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class PeliculaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private List<Pelicula> peliculas = new ArrayList();

    public Pelicula pelicula_servicio() {

        System.out.println("Bienvenido a e-Peliculas! "
                + "El programa electrónico para guardar tus peliculas favoritas");
        System.out.println(" ");
        return new Pelicula();
    }

    public void agregar_pelicula() {

        String respuesta = " ";

        do {

            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = leer.next();

            System.out.println("Ingrese el nombre del director");
            String director = leer.next();

            System.out.println("Ingrese la duración de la pelicula (hs)");
            Integer duracion = leer.nextInt();

            Pelicula movie = new Pelicula(titulo, director, duracion);
            peliculas.add(movie);

            System.out.println(" ");
            System.out.println("Desea agregar otra pelicula?");
            respuesta = leer.next().toUpperCase();

        } while (respuesta.equalsIgnoreCase("SI"));

    }

    public void mostrar_pelis() {

        System.out.println(" ");
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }

    }

    public void mostrar_duracion() {

        System.out.println(" ");
        System.out.println("Peliculas con duracion mayor a 1hs");
        for (Pelicula aux : peliculas) {
            if (aux.getDuracion() > 1) {
                System.out.println(aux);
            }
        }
    }

    public void ordenar_pelis() {

        System.out.println(" ");
        System.out.println("Peliculas ordenadas de mayor duración a menor");
        peliculas.sort(Pelicula.compararDuracion);

        for (Pelicula aux : peliculas) {
            System.out.println(aux.getTitulo());
        }

    }

    public void ordenar_menorMayor() {
        System.out.println(" ");
        System.out.println("Peliculas ordenadas de menor duracion a mayor");
        peliculas.sort(Pelicula.menorMayor);

        for (Pelicula aux : peliculas) {
            System.out.println(aux.getTitulo());
        }

    }

    public void ordenar_titulo() {
        System.out.println(" ");
        System.out.println("Peliculas ordenadas por titulo");
        peliculas.sort(Pelicula.ordenarTitulo);

        for (Pelicula aux : peliculas) {
            System.out.println(aux.getTitulo());
        }

    }

    public void ordenar_director() {
        System.out.println(" ");
        System.out.println("Peliculas ordenadas por director");
        peliculas.sort(Pelicula.ordenarDirector);

        for (Pelicula aux : peliculas) {
            System.out.println(aux.getDirector());
        }

    }

}
