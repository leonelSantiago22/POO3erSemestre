/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */

import java.io.Console;
public class lsting30 
{
 public static void main(String... args)
 {
     Console console = System.console();
     if(console == null)
     {
         System.err.println("No se obtubo la consola");
         System.exit(1);
     }
     String usuario = console.readLine("Usuario: ");
     
     //Lee pasword y lo recibe en un arreglo de caracteres
     char[] password = console.readPassword("Password: ");
     if(usuario.equals("admin")
             && String.valueOf(password).equals("secreto")){
         console.printf("Bienvenido %1$s", usuario);
     }else{
         console.printf("Usuario o passwoord invalido. \n");
     }
 }
}
