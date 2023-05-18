/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext3.juego.servicios;

import ejext3.juego.entidades.Juego;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Servicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Juego iniciar_juego() {

        int i = 1; //contador intentos
        

        System.out.println("Jugador 1: Ingresa el numero a adivinar");
        int p1 = leer.nextInt();
        System.out.println("Jugador 2: Adivina el numero!");
        int p2 = leer.nextInt();

        

        do {
            if (i == 3 && p2 != p1) {
                System.out.println("Se han terminado los intentos, has perdido");

                break;
            }

            if (p2 != p1) {

                i++;
                System.out.println("Incorrecto! Intenta nuevamente");
                p2 = leer.nextInt();

            } else {

                System.out.println("Has adivinado el numero!");
                System.out.println("Te ha tomado " +i+ " intentos adivinar el numero");
                break;
            }

        } while (p2 != p1 || i <= 3);
        
        
        
        return new Juego();
    }

}
