/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_jorgeramirez;

import java.io.Serializable;

/**
 *
 * @author Jorge Ramirez
 */
public class Usuario implements Serializable {
    
    String user;
    String contraseña;
    int age;

    public Usuario() {
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

    public Usuario(String user, String contraseña, int age) {
        this.user = user;
        this.contraseña = contraseña;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Usuario{" + "user=" + user + ", contraseña=" + contraseña + ", age=" + age + '}';
    }

   
    
}
