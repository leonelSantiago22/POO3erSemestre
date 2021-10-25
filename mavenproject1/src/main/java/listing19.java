/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 * @name Operadores logicos
 */
public class listing19 
{
    public static void main (String argumentos[])
    {
        boolean a = true;
        boolean b = true;
        boolean c = false; 
        boolean d = false;
        System.out.println("True y True = "+(a&&b));
        System.out.println("True y False = "+(a&&b));
        System.out.println("False y false= "+(c&&d));
        System.out.println("True 0 true = "+(a||b));
        System.out.println("true 0 false = "+(a||c));
        System.out.println("False 0 False = "+(c||d));
        System.out.println("N0 true = "+!a);
        System.out.println("No false = "+!c);
        System.out.println("(3>4) Y true = "+((3>4)&&a));
    }
}
