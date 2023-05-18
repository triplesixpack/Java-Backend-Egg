/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3.persona.servicios;

import ej3.persona.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Servicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona persona_servicio() {

        
        return new Persona();

    }

    public void crearPersona(Persona _usuario) {

        System.out.println("Bienvenido a e-Persona");
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        _usuario.setNombre(nombre);
        System.out.println(" ");

        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        _usuario.setEdad(edad);
        System.out.println(" ");

        String sexo = validarSexo();
        _usuario.setSexo(sexo);
        System.out.println(" ");

        System.out.println("Ingrese su peso (kg)");
        double peso = leer.nextDouble();
        _usuario.setPeso(peso);
        System.out.println(" ");

        System.out.println("Ingrese su Altura (m)");
        double altura = leer.nextDouble();
        _usuario.setAltura(altura);
        System.out.println(" ");

    }
    
    public String validarSexo(){
        
        String sexo = "";
        do {
            System.out.println("Ingrese sexo: ");
            System.out.println("H) Hombre");
            System.out.println("M) Mujer");
            System.out.println("O) Otro");
            sexo = leer.next().toUpperCase();

            if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")) {
                System.out.println("Opción no válida");
            }

        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));
        
        return sexo;
      
    }

    public boolean mayor_edad(Persona _persona) {
        
        return _persona.getEdad() >= 18;
        
    }

    
}
