/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador.servicios;

import integrador.entidades.Estudiante;

/**
 *
 * @author Seba
 */
public class Servicios {

    public Estudiante[] crearEstudiante() {

        Estudiante[] _array = new Estudiante[8];

        String nombre[] = {"Seba", "Bruno", "Jorge", "Pame", "Sofi", "Agus", "Sole", "Julio"};

        for (int i = 0; i < 8; i++) {
            Estudiante _estudiante = new Estudiante(nombre[i], (int) (Math.random() * 10));
            _array[i] = _estudiante;
        }

        return _array;
    }

    public double mostrarPromedio(Estudiante[] _array) {

        int sumaNota = 0;
        double promedio;

        for (Estudiante _array1 : _array) {
            int nota = _array1.getNota();
            sumaNota += nota;
        }

        promedio = sumaNota / _array.length;
        System.out.println("El promedio de las notas es: " + promedio);

        return promedio;
    }

    public String[] mostrarNombre(Estudiante[] _array) {

        double promedio = this.mostrarPromedio(_array);
        int nota;
        int cont = 0;
        int i = 0;

        for (Estudiante objeto : _array) {
            nota = objeto.getNota();
            if (nota > promedio) {
                cont++;
            }
        }

        String[] notaPlus = new String[cont];

        for (Estudiante objeto : _array) {
            nota = objeto.getNota();
            if (nota > promedio) {
                notaPlus[i] = objeto.getNombre();
                System.out.println("El estudiante " + objeto.getNombre() + " tiene una nota de: " + objeto.getNota());
                i++;
            }
        }

        return notaPlus;
    }

    public void mostrarEstudiantePlus(Estudiante[] _array) {

        String[] notaPlus = mostrarNombre(_array);

    }

}
