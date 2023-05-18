/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11.ej2.servicio;

import guia11.ej2.entidades.Jugador;
import guia11.ej2.entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class JuegoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void agregar_jugadores() {
        
        List <Jugador> jugadores = new ArrayList <>();

        System.out.println("Bienvenido a e-Ruleta Rusa");
        System.out.println("Por favor, ingrese la cantidad de jugadores: ");
        Integer players = leer.nextInt();
        if (players < 1 || players > 6) {
            players = 6;
        }
        
        System.out.println("La cantidad de jugadores es: " +players);
        
        for (int i = 1; i < players+1; i++) {
            System.out.println("Ingrese el nombre del jugador " + i);
            String nombre = leer.next();
            
            Jugador j1 = new Jugador(i, nombre);
            
           jugadores.add(j1);
            
        }

        for (Jugador aux : jugadores) {
            System.out.println(aux);
        }
    }

    
    public void llenarRevolver(){
       
        RevolverDeAgua r1 = new RevolverDeAgua();
        
        r1.setPosActual((int) (Math.random() * 6));
        r1.setPosAgua((int) (Math.random() * 6));
        
    }
    
    
    public boolean mojar(){
        RevolverDeAgua r = new RevolverDeAgua();
        // Retorna true si la posción actual es igual a la posición del agua
        return (r.getPosActual()==r.getPosAgua()); 
    }
    
    public void sigPosicion(){
        RevolverDeAgua r = new RevolverDeAgua();
        
        if(r.getPosActual()==5){
            r.setPosActual(0);
        } else {
            r.setPosActual(r.getPosActual()+1);
        }
    }
     
   
}