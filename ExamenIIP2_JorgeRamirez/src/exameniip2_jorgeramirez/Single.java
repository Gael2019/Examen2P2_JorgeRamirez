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
public class Single extends Lanzamiento{
    
    Cancion cancion;

    public Single(String Titulo, String fecha_publi, int conteoLikes) {
        super(Titulo, fecha_publi, conteoLikes);
    }

    public Single() {
    }

    public Single(Cancion cancion) {
        this.cancion = cancion;
    }
    

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
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
        return "Single{" + "cancion=" + cancion + '}';
    }
    
    
}
