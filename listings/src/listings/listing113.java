/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */
class Mihilo extends Thread{
    public Mihilo (String nombre)
    {
        super(nombre);
    }
    public void run()
    {
        for(int i = 0; i<4; i++)
        {
            System.out.println(getName()+" "+ i);
            try{
                sleep(400);
            }catch(InterruptedException e){}
        }
    }
}

public class listing113  {
    public static void main(String[] args) {
        Mihilo mascar = new Mihilo ("Mascando");
        Mihilo silbar = new Mihilo ("Silbar");
        
        mascar.start();
        silbar.start();
    }
}
