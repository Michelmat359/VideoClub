/*
 * Clase película
 */
package objeto;

/**
 * @author Miguel Angel Mateo.
 */
public class Pelicula {
    //atributos
    int idPelicula;
    String titulo;
    String tema;
    int duracion;
    double precio;
    
    //constructor
    public Pelicula(int idPelicula, String titulo, String tema, int duracion, 
            double precio) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.tema = tema;
        this.duracion = duracion;
        this.precio = precio;
    }
    
    //setters
    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //getters
    public int getIdPelicula() {
        return idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTema() {
        return tema;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getPrecio() {
        return precio;
    }
    
    //toString
    @Override
    public String toString() {
        return "ID Pelicula: " + this.idPelicula + "     Titulo: " + this.titulo 
                + "     Tema: " + this.tema + "     Duración: " + this.duracion 
                + "     Precio: " + this.precio;
    }
    
}
