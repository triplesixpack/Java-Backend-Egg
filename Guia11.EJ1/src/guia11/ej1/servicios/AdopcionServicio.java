/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11.ej1.servicios;

import guia11.ej1.entidades.Perro;
import guia11.ej1.entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class AdopcionServicio {

    private List<Persona> adoptantes;
    private Scanner leer;

    public AdopcionServicio() {
        this.adoptantes = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public AdopcionServicio adopcion() {

        Perro p1 = new Perro("Rolito", "Salchicha", 1, "Pequeño");
        Persona adop = new Persona("Sebastian", "Cuart", 25, 40384596);
        
        Perro p2 = new Perro("Bernardo", "Pitbull?", 5, "Grande");
        Persona adop2 = new Persona("Orlando", "Cuart", 55, 18140550);
        
        
        
        
        adop.setDog(p1);
        adop2.setDog(p2);
        
        System.out.println(adop);
        System.out.println(adop2);
        
        
        return new AdopcionServicio();

    }
    
    
}
