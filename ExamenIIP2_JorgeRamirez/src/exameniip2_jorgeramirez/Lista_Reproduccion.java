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
public class Lista_Reproduccion {
    String title;
    int conteoLikes;
    ArrayList<Cancion> canciones = new ArrayList();

    public Lista_Reproduccion() {
    }

    public Lista_Reproduccion(String title, int conteoLikes) {
        this.title = title;
        this.conteoLikes = conteoLikes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getConteoLikes() {
        return conteoLikes;
    }

    public void setConteoLikes(int conteoLikes) {
        this.conteoLikes = conteoLikes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Lista_Reproduccion{" + "title=" + title + ", conteoLikes=" + conteoLikes + ", canciones=" + canciones + '}';
    }
    
    
                        
}
