/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_jorgeramirez;

import javax.swing.JProgressBar;

/**
 *
 * @author Jorge Ramirez
 */
public class Bar {
    
    JProgressBar barra;
    
    //crear el hilo
    public void run() {
     
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo en ejecución: " + i);
            try {
                Thread.sleep(1000); // Duerme el hilo 
            } catch (InterruptedException e) {
             
            }
        }
    }
}
