/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
public class listing23 {
    public class Fibonacci3 {
 public static void main(String argumentos[]) {
 int numTerm,v1=1,v2=1,aux,cont=2;
 if (argumentos.length<1) {
 System.out.println("Uso: Fibonacci num");
 System.out.println("Donde num = no de t ́erminos");
 }
 else {
 numTerm=Integer.valueOf(argumentos[0]);
 System.out.print("1,1");
 while (cont++<numTerm) {
 aux=v2;
 v2+=v1;
 v1=aux;
 System.out.print(","+v2);
 }
 System.out.println();
 }
 }
 }
}
