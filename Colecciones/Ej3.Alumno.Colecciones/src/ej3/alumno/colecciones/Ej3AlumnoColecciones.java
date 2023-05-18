/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3.alumno.colecciones;


import ej3.alumno.colecciones.servicios.ServicioAlumnos;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ej3AlumnoColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAlumnos a1 = new ServicioAlumnos();
        
        a1.alumnos_servicio();
        a1.crear_alumnos();
        a1.get_alumno();
        
        
        
        
    }
    
}
