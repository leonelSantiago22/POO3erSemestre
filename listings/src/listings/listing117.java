/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */
class Cuenta{
    static int balance = 1000;
    static int gasto = 0; 
    
    static public synchronized void retirar(int cantidad)
    {
     if(cantidad <=balance){
         System.out.println("cheque: "+ cantidad);
         balance -= cantidad;
         System.out.println("Balance:" + balance);
         System.out.println(", Se gasto: "+ gasto);
     }else{
         System.out.println("Reboto: "+ cantidad);
     }
    }
}

class miHilo extends Thread{
    public void run()
    {
        for(int i = 0; i< 10; i++){
        try{
            sleep(100);
        }catch(InterruptedException e){}
        Cuenta.retirar((int )(Math.random() * 500));
    }
    }
}
public class listing117 {
    public static void main(String[] args) {
        new miHilo().start();
        new miHilo().start();
    }
}
