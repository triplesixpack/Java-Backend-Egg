/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.entidades;

/**
 *
 * @author Seba
 */
public class Libro {

    
    private String Título;
    private String Autor;
    private int Pagina;
    private int ISBN;
   
    public Libro() {
    }

    public Libro(String Título, String Autor, int Pagina, int ISBN) {
        this.Título = Título;
        this.Autor = Autor;
        this.Pagina = Pagina;
        this.ISBN = ISBN;
    }

    


    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPagina(int Pagina) {
        this.Pagina = Pagina;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public String getAutor() {
        return Autor;
    }

    public int getPagina() {
        return Pagina;
    }

    @Override
    public String toString() {
        return "Libro: {" + "ISBN= " + ISBN + ", Título= " + Título + ", Autor= " + Autor + ", Paginas= " + Pagina + '}';
    }

}
