/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_jorgeramirez;

import java.util.Date;

/**
 *
 * @author Jorge Ramirez
 */
public class Lanzamiento {
    
    String Titulo;
    String fecha_publi;
    int conteoLikes;

    public Lanzamiento(String Titulo, String fecha_publi, int conteoLikes) {
        this.Titulo = Titulo;
        this.fecha_publi = fecha_publi;
        this.conteoLikes = conteoLikes;
    }

    public Lanzamiento() {
    }
    
     
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getFecha_publi() {
        return fecha_publi;
    }

    public void setFecha_publi(String fecha_publi) {
        this.fecha_publi = fecha_publi;
    }

    public int getConteoLikes() {
        return conteoLikes;
    }

    public void setConteoLikes(int conteoLikes) {
        this.conteoLikes = conteoLikes;
    }

    @Override
    public String toString() {
        return "Lanzamiento{" + "Titulo=" + Titulo + ", fecha_publi=" + fecha_publi + ", conteoLikes=" + conteoLikes + '}';
    }
    
    
}
