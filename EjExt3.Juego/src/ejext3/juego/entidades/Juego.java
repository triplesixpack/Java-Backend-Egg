/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext3.juego.entidades;

/**
 *
 * @author Seba
 */
public class Juego {
    
    
    private int player1;
    private int player2;

    public Juego() {
    }

    public Juego(int player1, int player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public int getPlayer1() {
        return player1;
    }

    public int getPlayer2() {
        return player2;
    }

    public void setPlayer1(int player1) {
        this.player1 = player1;
    }

    public void setPlayer2(int player2) {
        this.player2 = player2;
    }
    
    
    
    
}
