/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_jorgeramirez;

/**
 *
 * @author Jorge Ramirez
 */
public class Cancion {
    
    String title;
    String duracion;
    Lanzamiento Referencia;

    public Cancion() {
    }

    public Cancion(String title, String duracion, Lanzamiento Referencia) {
        this.title = title;
        this.duracion = duracion;
        this.Referencia = Referencia;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Lanzamiento getReferencia() {
        return Referencia;
    }

    public void setReferencia(Lanzamiento Referencia) {
        this.Referencia = Referencia;
    }

    @Override
    public String toString() {
        return "Cancion{" + "title=" + title + ", duracion=" + duracion + ", Referencia=" + Referencia + '}';
    }
    
    
}
