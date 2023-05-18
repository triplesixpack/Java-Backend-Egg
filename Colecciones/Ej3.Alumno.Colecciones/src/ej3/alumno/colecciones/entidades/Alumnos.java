/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3.alumno.colecciones.entidades;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Seba
 */
public class Alumnos {
    
    
    private String alumno;
    private List <Integer> notas = new ArrayList();
    
    
    public Alumnos() {
    }

    public Alumnos(String alumno, List <Integer> notas) {
       
    }

    public String getAlumno() {
        return alumno;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public double calcularPromedio(){
        
        int suma = 0;
        for (Integer nota : notas) {
            suma += nota;
            
        }
        return (double) suma / notas.size();
    }
    
    @Override
    public String toString() {
        return "Alumnos{" + "alumno=" + alumno + ", notas=" + notas + '}';
    }


}
