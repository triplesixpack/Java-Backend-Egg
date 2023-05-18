/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package servicios.rectangulo;

import java.util.Scanner;
import rectanguloEntidades.Rectangulo;

/**
 *
 * @author Seba
 */
public class Servicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo datosR() {

        System.out.println("Ingrese Base y Altura (en ese orden) del Rectangulo");
        double base = leer.nextDouble();
        double altura = leer.nextDouble();

        return new Rectangulo(base, altura);
    }

    public void dibujo(Rectangulo _rectangulo) {

        double base = _rectangulo.getBase();
        double altura = _rectangulo.getAltura();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");

        }

    }
    
    public void superficie(Rectangulo _rectangulo){
        
        double base = _rectangulo.getBase();
        double altura = _rectangulo.getAltura();
        
        double superficie = base*altura;
        System.out.println("La superficie del rectangulo es: " +superficie);
        System.out.println(" ");
    }
    
    
    public void perimetro(Rectangulo _rectangulo){
        
        double base = _rectangulo.getBase();
        double altura = _rectangulo.getAltura();
        
        double perimetro = (base+altura)*2;
        System.out.println("El perimetro del rectangulo es: " +perimetro);
        System.out.println(" ");
    }
}
