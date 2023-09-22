/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_jorgeramirez;

import java.util.ArrayList;

/**
 *
 * @author Jorge Ramirez
 */
public class Album extends Lanzamiento {
    
     ArrayList <Cancion> cancion = new ArrayList();
     int Cantidadcanciones;

    public Album() {
    }

    public Album(String Titulo, String fecha_publi, int conteoLikes) {
        super(Titulo, fecha_publi, conteoLikes);
    }
    
    
    public Album(int Cantidadcanciones) {
        this.Cantidadcanciones = Cantidadcanciones;
    }
    

    public ArrayList<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.cancion = cancion;
    }

    public int getCantidadcanciones() {
        return Cantidadcanciones;
    }

    public void setCantidadcanciones(int Cantidadcanciones) {
        this.Cantidadcanciones = Cantidadcanciones;
    }

    @Override
    public String toString() {
        return "Album{" + "cancion=" + cancion + ", Cantidadcanciones=" + Cantidadcanciones + '}';
    }
     
   
}
