/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11.ej3.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Baraja {

    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasEliminadas = new ArrayList();

    public Baraja() {

        String nombre = null;
        Carta carta;
        cartas = new ArrayList();

        for (int j = 0; j < 4; j++) {
            switch (j) {

                case 0:
                    nombre = "basto";
                    break;
                case 1:
                    nombre = "espada";
                    break;
                case 2:
                    nombre = "copa";
                    break;
                case 3:
                    nombre = "oro";
                    break;

            }
            for (int i = 1; i < 13; i++) {
                if (i != 8 && i != 9) {
                    carta = new Carta(i, nombre);
                    cartas.add(carta);
                }
            }
        }

    }

    public void mostrarBaraja() {
        for (Carta aux : cartas) {
            System.out.println(aux);
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public void siguienteCarta() {

        Iterator<Carta> iterador = cartas.iterator();

        if (iterador.hasNext()) {
            Carta cartaSiguiente = iterador.next();
            System.out.println("Toma tu carta " + cartaSiguiente);
            cartasEliminadas.add(cartaSiguiente);
            iterador.remove();
        } else {
            System.out.println("No hay mas cartas en el mazo");
        }
    }

    public void cartasDisponibles() {
      
        int cantidadCartas = cartas.size();
        System.out.println("La cantidad de cartas disponilbes es: " + cantidadCartas);
    }

    public void darCartas() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuantas cartas quiere?");
        int cartasPedidas = leer.nextInt();

        if (cartasPedidas <= this.cartas.size()) {
            for (int i = 0; i < cartasPedidas; i++) {
                siguienteCarta();
            }
        } else {
            System.out.println("No hay cartas disponibles");
        }
    }

    public void cartasMonton() {

        if (!cartasEliminadas.isEmpty()) {
            for (Carta aux : cartasEliminadas) {
                System.out.println(aux + " fue eliminada");
            }
        } else {
            System.out.println("No se eliminó ninguna carta");

        }

    }

}
