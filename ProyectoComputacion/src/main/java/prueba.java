
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
public class prueba {
    public static void main(String[] args) throws IOException{
        try {
      int cont =0;int cont2=0;
      String regex = ".([A-Z]{4}[1-9]{2}(0?[1-9]|1[1|0|2])[A-Z| 0-9]{3})";//Expresion de la RFC
      String URL = "([aA-Zz]*|[http]|[facebook]|[https?]|[ftp]|[file])[://|/|:/][-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";//Validacion de la url
      Pattern pattern = Pattern.compile(regex);
        Pattern patternURL = Pattern.compile(URL);
      BufferedReader lector = new BufferedReader(new FileReader("C://Users/Leonel/Documents/UTM/semestre3/Programacion/ProyectoComputacion/src/data_er1.txt"));
      StringBuilder cadena = new StringBuilder();
      String line = null;
    
      while ((line = lector.readLine()) != null) {
        cadena.append(line);
      }
      lector.close();
      
      String contenido = cadena.toString();
      //System.out.println(contenido);
      Matcher matcher = pattern.matcher(contenido);
      Matcher matcherURL = patternURL.matcher(contenido);
      while(matcher.find())
      {
          System.out.println(matcher.group());
          cont++;
      }
      while(matcherURL.find())
      {
          System.out.println(matcherURL.group());
          cont2++;
      }
      System.out.println("Total de Url: "+cont2);
      System.out.println("Total de RFC: "+cont);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    }
}
