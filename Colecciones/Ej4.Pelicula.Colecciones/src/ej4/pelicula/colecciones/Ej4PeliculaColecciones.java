/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4.pelicula.colecciones;

import ej4.pelicula.colecciones.servicios.PeliculaServicio;

/**
 *
 * @author Seba
 */
public class Ej4PeliculaColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        PeliculaServicio p1 = new PeliculaServicio();
        
        
        p1.agregar_pelicula();
        p1.mostrar_pelis();
        p1.mostrar_duracion();
        p1.ordenar_pelis();
        p1.ordenar_menorMayor();
        p1.ordenar_titulo();
        p1.ordenar_director();
        
    }
    
}
