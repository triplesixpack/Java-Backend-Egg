/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12.ej1;

import guia12.ej1.entidades.Animal;
import guia12.ej1.entidades.Caballo;
import guia12.ej1.entidades.Gato;
import guia12.ej1.entidades.Perro;

/**
 *
 * @author Seba
 */
public class Guia12EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal perro1 = new Perro("CarloMagno" , "Carne" , 5 , "Gran Danés");
        perro1.Alimentarse();
        
        Animal gato1 = new Gato("Haku" , "Croquetas" , 3 , "Atigrado");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("Malacara" , "Pasto" , 7 , "Fino");
        caballo1.Alimentarse();
    }
    
}
