/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia11.ej2.entidades;

/**
 *
 * @author Seba
 */
public class Juego {
    
    private Jugador jugador;
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public Juego(Jugador jugador, RevolverDeAgua revolver) {
        this.jugador = jugador;
        this.revolver = revolver;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }
    
    
    
}
