/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
import java.util.Scanner;
//llamamos a la funcion que nos permite escanear

public class listing29 
{
        public static void main (String[] args)
        {
            String nom; 
            int edad; 
            Scanner in = new Scanner(System.in);
            
            System.out.print("Nombre : "); 
            nom = in.nextLine();//Lee una linea de la consola
            
            System.out.println("Edad: ");
            edad = in.nextInt(); // Lee un entero de consola 
            in.close();
            
            System.out.println("Nombre: "+nom);
            System.out.println("Edad: "+edad);
        }
}
