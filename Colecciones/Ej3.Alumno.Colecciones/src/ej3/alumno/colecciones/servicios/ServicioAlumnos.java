/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3.alumno.colecciones.servicios;

import ej3.alumno.colecciones.entidades.Alumnos;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class ServicioAlumnos {

    private List<Alumnos> alumno = new LinkedList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumnos alumnos_servicio() {

        System.out.println("Bienvenido a e-Alumnos");

        return new Alumnos();
    }

    public void crear_alumnos() {

        //guardo notas y luego se las paso a la lista de "entidades"
        Integer nota;
        String respuesta = " ";

        do {
            List<Integer> notas_aux = new ArrayList();

            System.out.println("Agregue el nombre del alumno");
            String nombre = leer.next();

            for (int i = 0; i < 3; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                nota = leer.nextInt();
                notas_aux.add(nota);
            }

            Alumnos a = new Alumnos(nombre, notas_aux);

            a.setAlumno(nombre);
            a.setNotas(notas_aux);

            alumno.add(a);

            System.out.println("Desea agregar otro alumno?");
            respuesta = leer.next().toUpperCase();

        } while (respuesta.equalsIgnoreCase("SI"));

        for (Alumnos aux : alumno) {
            System.out.println(aux);
        }

    }

    public double calcular_promedio(String nombre) {

        for (Alumnos aux : alumno) {
            if (aux.getAlumno().equals(nombre)) {
                return aux.calcularPromedio();
            }

        }
        return -1;

    }

    public void get_alumno() {

        String respuesta = " ";

        do {

            System.out.println("Que promedio desea conocer?");
            String nombre = leer.next();

            calcular_promedio(nombre);

            double notaFinal = calcular_promedio(nombre);

            if (notaFinal == -1) {
                System.out.println("No se encontro el nombre ingresado");
            } else {
                System.out.println("El promedio del alumno " + nombre + " es " + notaFinal);
            }

            System.out.println("Desea ver otro promedio?");
            respuesta = leer.next().toUpperCase();

        } while (respuesta.equalsIgnoreCase("SI"));

    }
}
