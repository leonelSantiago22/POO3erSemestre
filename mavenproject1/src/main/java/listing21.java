/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
public class listing21 {
  public static void main(String argumentos[])
  {
      int numTerm, v1 =0, v2=1, cont = 1, aux; 
      if(argumentos.length<1)
      {
          System.out.println("Uso: Fibo");
          System.out.println("Donde num = n de terminos ");
      }else {
          numTerm = Integer.valueOf(argumentos[0]);
          System.out.println("1");
          do{
              aux = v2 ; 
              v2+= v1; 
              v1 = aux; 
              System.out.println(","+v2);
          }while(++cont<numTerm);
          System.out.println();
      }
  }
}
