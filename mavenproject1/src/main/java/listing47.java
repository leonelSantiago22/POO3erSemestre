/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
package objeto;

public class listing47{
    private String nombre;
    private static int numObjetos;
    public Objeto(String cadena){
        if(cadena.length() != 0)
            nombre = cadena;
        else
            nombre = "Cadena por omision";
        numObjetos++;
    }
    public static int getNumObjetos(){
        return numObjetos;
    }
    
    public static void main(String[] args) {
        System.out.println("Objetos: " + getNumObjetos());
        System.out.println("Objetos: " + Objeto.getNumObjetos());
        Objeto uno, dos;
        uno = new Objeto("");
        dos = new Objeto("Objeto dos");
        System.out.println("Obejtos: " + uno.getNumObjetos());
        System.out.println("Objetos: " + dos.getNumObjetos());
    }
    