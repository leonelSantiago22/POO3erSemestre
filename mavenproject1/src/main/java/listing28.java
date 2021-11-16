/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */

enum Temporada { PRIMAVERA, VERANO, OTONO, INVIERNO}
public class listing28 
{
    public static void main (String args[])
    {
        Temporada tem; 
        tem = Temporada.PRIMAVERA;
        System.out.println("Temporada: "+tem);
        
        System.out.println("\nListado de temporadas:");
        
        for(Temporada t: Temporada.values())
        {
            System.out.println("Temporada: "+t);
        }
    }
}
