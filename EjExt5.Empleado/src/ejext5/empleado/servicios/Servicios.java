/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext5.empleado.servicios;

import ejext5.empleado.entidades.Empleado;
import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Servicios {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Empleado n_empleado(){
        
        
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println(" ");
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();
        System.out.println(" ");
        System.out.println("Ingrese su sueldo: ");
        double sueldo = leer.nextDouble();
        System.out.println(" ");
        
        calcular_aumento(nombre,edad,sueldo);
        
        
        return new Empleado();
    }
    
    
    public void calcular_aumento(String _nombre, int _edad, double _sueldo){
        
        double aumento=0;
        
        if (_edad<30) {
            aumento = (_sueldo*0.05);
        }else{
            if (_edad>=30) {
              aumento = (_sueldo*0.10);
            }
        }
        
        System.out.println("El aumento salarial de: " +_nombre+ ", edad: " +_edad + ", es de: " +aumento);
     
    }
    
}
