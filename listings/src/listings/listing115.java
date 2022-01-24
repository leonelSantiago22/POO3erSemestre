/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */
public class listing115 {
    public static void main(String[] args) {
        printthread thread1, thread2, thread3, thread4;
        
        thread1 = new printthread ("1");
        thread2 = new printthread ("2");
        thread3 = new printthread ("3");
        thread4 = new printthread ("4");
        
        thread1.start();;
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class printthread extends Thread {
    int sleepTime;
    
    public printthread(String id)
    {
        super(id);
        
        sleepTime = (int) (Math.random() * 5000);
        
        System.out.println("Nombre: "+ getName() + "; Durmiendo "+ sleepTime);
    }
    public void run()
    {
        try{
            sleep(sleepTime);
        }catch(InterruptedException exception)
        {
            System.out.println("Excepcion: "+ exception.toString());
        }
        System.out.println("Hila"+ getName());
    }
}