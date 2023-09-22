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
public class Cliente extends Usuario{
    
    ArrayList <Cancion> cancion = new ArrayList();
    ArrayList <Lista_Reproduccion> save = new ArrayList();
    ArrayList <Lista_Reproduccion> playlist = new ArrayList();

    public Cliente(String user, String contraseña, int age) {
        super(user, contraseña, age);
    }
    

    public ArrayList<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.cancion = cancion;
    }

    public ArrayList<Lista_Reproduccion> getSave() {
        return save;
    }

    public void setSave(ArrayList<Lista_Reproduccion> save) {
        this.save = save;
    }

    public ArrayList<Lista_Reproduccion> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Lista_Reproduccion> playlist) {
        this.playlist = playlist;
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
        return "Cliente{" + "cancion=" + cancion + ", save=" + save + ", playlist=" + playlist + '}';
    }
    
    
}
