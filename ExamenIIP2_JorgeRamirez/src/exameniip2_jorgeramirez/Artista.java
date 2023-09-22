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
public class Artista extends Usuario {
    
    public Artista(String user, String contraseña, int age) {
        super(user, contraseña, age);
    }
    
    String Artista;
    ArrayList <Cancion> canciones = new ArrayList();
    ArrayList <Lanzamiento> Albumes_publicados = new ArrayList();

    public Artista() {
    }

    public Artista(String Artista) {
        this.Artista = Artista;
    }

    public Artista(String Artista, String user, String contraseña, int age) {
        super(user, contraseña, age);
        this.Artista = Artista;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Lanzamiento> getAlbumes_publicados() {
        return Albumes_publicados;
    }

    public void setAlbumes_publicados(ArrayList<Lanzamiento> Albumes_publicados) {
        this.Albumes_publicados = Albumes_publicados;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Artista{" + "Artista=" + Artista + ", canciones=" + canciones + ", Albumes_publicados=" + Albumes_publicados + '}';
    }
    
    
}
