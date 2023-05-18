/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Circunferencia.servicios;

import Circunferencia.entidades.Circunferencia;
import java.util.Scanner;




/**
 *
 * @author Seba
 */
public class Servicios {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        public Circunferencia crearCircunferencia(){
        Circunferencia c1 = new Circunferencia(10);
        
        
        
        System.out.println("el area de la circunferencia original con radio " + c1.getRadio() + " es : " +c1.area());
        System.out.println("el perimetro de la circunferencia original con radio " + c1.getRadio() + " es : " +c1.perimetro());
        
        
        System.out.println("ingrese el nuevo radio: "); 
        crearCircunferencia(c1);
        
        System.out.println("el area de la circunferencia es: "+ c1.area());
        System.out.println("el perimetro de la circunferencia es: "+ c1.perimetro());
        
        return new Circunferencia ();
        
        }

   public static void crearCircunferencia(Circunferencia c1){
       
        Scanner leer = new Scanner(System.in);
        
        c1.setRadio(leer.nextDouble());
      
    } 
}
