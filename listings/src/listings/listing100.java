/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */
public class listing100 {
    public static void main(String[] args) {
        int i =5, j =0;
        try {
            int k = i/j;
            System.out.println("Esto no se va a ejecutar");
        }catch(ArithmeticException ex)
        {
            System.out.println("Ha intentado dividir por cero");
        }
        System.out.println("Fin del programa");
    }
}
