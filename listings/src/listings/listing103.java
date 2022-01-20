/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */
class MiException extends Exception{
    String cad;
    /*El constructor de nuestra exception copia a una cadena el mensaje que pasa al lanar la exception*/
    
    MiException(String msj)
    {
        cad = msj;
    }
    public String toString()
    {
        return ("Se lanzo Mi Exception: "+cad);
    }
}
public class listing103 {
    public static void main(String[] args) {
        try{
            System.out.println("Iniciando bloque try");
            throw new MiException("Mi mensaje de error");
        }catch(MiException exp)
        {
            System.out.println("Bloque catch");
            System.out.println(exp);
        }
    }
}
