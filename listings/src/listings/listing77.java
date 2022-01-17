/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */

class Nombre{
    private String nombre, paterno, materno; 
    public Nombre (String n, String p, String m )
    {
        nombre = new String(n);
        paterno = new String(p);
        materno = new String (m);
    }
}
public class listing77 {
    private Nombre miNombre; 
    private int edad;
    public listing77(String n, String p, String m)
    {
        miNombre = new Nombre(n,p,m);
        edad =0;
    }
    
    public static void main(String[] args) {
        listing77 Per1;
        Per1 = new listing77("Uno", "Dos", "tres");
        listing77 per2 = new listing77("mi nombre", "mi apellido", "otro apellido"); 
    }
}
