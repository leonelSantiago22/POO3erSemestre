/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
public class listing27 
{
    public static void main (String[] argumentos)
    {
        String meses[] = {"enero", "Febrero", "Marzo", "Abril", "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        /*for (int i =0; i<meses.length; i ++)
        {
            System.out.println("Mes: "+meses[i]);
        }*/
        
        //Sintaxis para recorrer el arreglo y asignar 
        //El siguiente elemento a la variable mes en cada ciclo 
        //Intruccion "for each" a partir de vesrion 5.0 (1.5 del jdk
        
        for(String mes : meses)
        {
            System.out.println("mes:"+ mes);
        }
           
    }
            
}
