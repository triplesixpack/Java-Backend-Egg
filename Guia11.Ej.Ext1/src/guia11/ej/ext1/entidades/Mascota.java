/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11.ej.ext1.entidades;

/**
 *
 * @author Seba
 */
public class Mascota {
    
    private String nombre;
    private String raza;
    private String tamano;
    private Integer edad;
    private Persona propietario;

    public Mascota(String nombre, String raza, String tamano, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getTamano() {
        return tamano;
    }

    public Integer getEdad() {
        return edad;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", raza=" + raza + ", tamano=" + tamano + ", edad=" + edad + '}';
    }
    
    
    
}
