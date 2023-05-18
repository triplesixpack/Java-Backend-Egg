/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.cadena;

import ej1.cadena.entidades.Cadena;
import ej1.cadena.servicios.CadenaServicios;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Ej1Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicios cs1 = new CadenaServicios();

        System.out.println("Ingrese una frase");
        Cadena nuevaFrase = new Cadena(leer.next());

        cs1.contarVocales(nuevaFrase);
        cs1.invertirFrase(nuevaFrase);

        System.out.println("Ingrese un caracter");
        cs1.vecesRepetido(nuevaFrase, leer.next());

        System.out.println("Ingrese una nueva frase");
        String _nuevaFrase = leer.next();
        System.out.println(cs1.compararLongitud(nuevaFrase, _nuevaFrase));
        cs1.unirFrases(nuevaFrase, _nuevaFrase);

        System.out.println("Ingrese un caracter a modificar en la frase: ");
        cs1.reemplazar(nuevaFrase, leer.next());

        boolean valor = cs1.contiene(nuevaFrase, leer.next());
        System.out.println("La frase contiene el caracter? " + valor);

    }
}
