/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */
public class listing101 {
    public static void main(String[] args) {
        int i = 5, j =0;
        try{
            int k =i/j; // Intentar la division y no intentarla
        }catch(ArithmeticException ex){
            System.out.println("Ha intentado dividir por cero");
        }finally{
            System.out.println("Salida de finally");
        }
        System.out.println("fin del programa");
    }
}
