/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.mascota.programa.entidades;

/**
 *
 * @author Seba
 */
public class Mascota {
    
    
    private String raza;
    

    public Mascota() {
    }

    public Mascota(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    
    @Override
    public String toString() {
        return "Mascota{" + "raza=" + raza + '}';
    }
    
    
    
   
    
    
    
}
