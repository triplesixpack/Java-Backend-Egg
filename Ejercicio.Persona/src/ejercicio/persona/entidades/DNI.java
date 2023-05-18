/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.persona.entidades;

/**
 *
 * @author Seba
 */
public class DNI {
    
      private int Numero;
    private String  letra;

    public DNI() {
    }

    public DNI(int Numero, String letra) {
        this.Numero = Numero;
        this.letra = letra;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Dni{" + "Numero=" + Numero + ", letra=" + letra + '}';
    }
    
}
