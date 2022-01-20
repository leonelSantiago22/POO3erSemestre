/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */
class DivisionByZeroException extends Exception
{
    DivisionByZeroException(String mag) { super(mag); }
}
public class listing102 {
    public void division() throws DivisionByZeroException
    {
        int num1 = 10; 
        int num2 = 0;
        if(num2==0)
            throw new DivisionByZeroException("/Entre 0");
        System.out.println(num1+"/"+num2+" = "+(num1/num2));
        System.out.println("Terminando division().");
    }
    public static void main(String[] args) {
        try{
            new listing102().division();
        }catch(DivisionByZeroException e ){
            System.out.println("en main, tratando con "+ e);
        }finally{
                    System.out.println("Finallly ejectado en main");
                }
        System.out.println("Finalizando el main");
    }
    
}
