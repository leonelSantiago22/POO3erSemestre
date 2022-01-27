/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */

class miHilo extends Thread
{
    static Integer balance = new Integer (1000);
    static int gasto = 0;
    static{
        System.out.println("Balance inicial: "+balance);
    }
    public void run()
    {
        int cuenta;
        for(int i =0; i <10; i ++)
        {
            try{
                sleep(100);
            }catch(InterruptedException e){}
            cuenta = ((int) (Math.random() * 500));
            synchronized (balance)
            {
                if(cuenta <= balance.intValue())
                {
                    System.out.println("cheque: "+ cuenta);
                    balance = new Integer(balance.intValue()-cuenta);
                    gasto += cuenta;
                    System.out.println("bal: "+ balance.intValue());
                    System.out.println(", se gasto: "+ gasto);
                }else{
                    System.out.println("reboto: "+ cuenta);
                }
            }
        }
    }
}
public class listing118 {
    public static void main(String[] args) {
        new miHilo().start();
        new miHilo().start();
    }
}
