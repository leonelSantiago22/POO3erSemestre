package listings;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */

class Hiloentero extends Thread {
    public Hiloentero (String nombre)
    {
        super(nombre);
    }
    public void run()
    {
        int i =0; 
        while(true){
            System.out.println(getName()+ " "+"Cilo "+ i++);
            if(i%100==0){
                try {
                    sleep(10);  /*ceder el procezador a otros hilos */
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hiloentero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
public class listing116 {
    public static void main(String[] args) {
        Hiloentero infinito = new Hiloentero("Al infinito");
        Hiloentero masAlla = new Hiloentero("y mas alla");
        infinito.start();
        masAlla.start();
    }
}
