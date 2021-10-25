/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
public class listing20 {
  public static void main ( String argumentos[])
  {
      int numTerm, v1 = 1, v2=1, aux, cont; 
      if(argumentos.length<1)
      {
          System.out.println("Uso: Fiboanacci num");
          System.out.println("Donde num = n de terminos");
      }else{
          numTerm = Integer.valueOf(argumentos[0]);
          System.out.println("1,1");
          for(cont = 2; cont<numTerm; cont++)
          {
              aux = v2;
              v2+=v1 ;
              v1 = aux;
              System.out.println(","+v2);
                      
          }
          System.out.println();
      }
  }
}