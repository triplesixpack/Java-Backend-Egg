/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.mascota.programa;

//import ej1.mascota.programa.entidades.Mascota;
import ej1.mascota.programa.servicios.MascotaServicio;

/**
 *
 * @author Seba
 */
public class Ej1MascotaPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MascotaServicio mascServ = new MascotaServicio();
        
        mascServ.mascota_servicio();
        mascServ.crear_mascota();
        
        mascServ.agregar_mascota();
        
        mascServ.lista_mascota();
      
        mascServ.recorrer_lista();
        
    }

}
