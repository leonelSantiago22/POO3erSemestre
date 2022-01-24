/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */

class MiHilo extends Thread{
    public MiHilo(String nombre)
    {
        super(nombre);
    }
    
    public void run()
    {
        for(int i =0; i < 10; i ++)
        {
            System.out.println(getName()+ " "+ i);
            try{
                sleep(10);
            }catch(InterruptedException e){}
        }
    }
}
public class listing114 {
    public static void main(String[] args) {
        MiHilo hilo_min = new MiHilo("Hilo min");
        MiHilo hilo_max = new MiHilo("Hilo Max");
        
        hilo_min.setPriority(Thread.MIN_PRIORITY);
        hilo_max.setPriority(Thread.MAX_PRIORITY);
        
        hilo_min.start();
        hilo_max.start();
    }
}
