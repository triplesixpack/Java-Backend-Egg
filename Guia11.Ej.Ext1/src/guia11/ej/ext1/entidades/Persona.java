/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11.ej.ext1.entidades;

import java.util.ArrayList;

/**
 *
 * @author Seba
 */
public class Persona {

private String nombre;
private String apellido;
private Integer edad;
private Integer dni;
private ArrayList <Mascota> mascotas;

    public Persona(String nombre, String apellido, Integer edad, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.mascotas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getDni() {
        return dni;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    
    public boolean setMascota (Mascota mascota){
        if (mascota.getPropietario()== null) {
            System.out.println("Usted a adoptado a " + mascota.getNombre() + " espero que sea responsable");
            mascotas.add(mascota);
            mascota.setPropietario(this);
            return true;
                    }else{
            System.out.println("La mascota que quiere adoptar ya encontró un hogar, su dueño es " +mascota.getPropietario().getNombre());
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", mascotas=" + mascotas + '}';
    }




}
