/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */
public class listing125 {
    public int x = 0; 
    class PrimerNivel
    {
        public int x = 1;
        
        void metodoEnPrimerNivel(int x)
        {
            System.out.println("x = "+x);
            System.out.println("this.x "+ this.x);
            System.out.println("Pruba Ocultar Variables.this.x = "+ listing125.this.x);
        }
    }
    public static void main(String[] args) {
        listing125 pov = new listing125();
        listing125.PrimerNivel pn = pov.new PrimerNivel();
        pn.metodoEnPrimerNivel(25);
    }
}
