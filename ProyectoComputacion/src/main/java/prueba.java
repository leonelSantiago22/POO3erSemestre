
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
      //System.out.println("Hola");
      int cont =0;int cont2=0, contfecha=0;
      //String fecha ="((([S|T|M|W|S|F][a-z]*)day\\,)(\\s))((0?[1-9]|[12][0-9]|3[01])+(\\s)[J|F|M|A|O|C|N|D|S][a-y]*\\s(\\d{4}))|((([S|T|M|W|S|F][a-z]*)day\\,)(\\s))([J|F|M|A|O|C|N|D|S][a-y]*(\\s)(0?[1-9]|[12][0-9]|3[01])+)((\\,)(\\s)[0-9]{4})|(((([^fhkpqwxyz;.\\d\\s]*\\,?)?)\\s?(0?[1-9]|[12][0-9]|3[01])\\sde\\s[a-z]+\\sde\\s\\d{4})|([0-9]{4}|\\d{2}|(0?[1-9]|[12][0-9]|3[01]))([\\/]|[\\-])((0?[1-9]|1[012]))([\\/]|[\\-])([0-9]{4}|[0-9]{2}))";
      String fecha ="((([S|T|M|W|S|F][a-z]*)day\\,)(\\s))((0?[1-9]|[12][0-9]|3[01])+(\\s)[J|F|M|A|O|N|D|S][a-y]*\\s(\\d{4}))|((([S|T|M|W|S|F][a-z]*)day\\,)(\\s))([J|F|M|A|O|N|D|S][a-y]*(\\s)(0?[1-9]|[12][0-9]|3[01])+)((\\,)(\\s)[0-9]{4})|(((([^fhkpqwxyz;.\\d\\s]*\\,?)?)\\s?(0?[1-9]|[12][0-9]|3[01])\\sde\\s[a-z]+\\sde\\s\\d{4})|(([^/\\d])([0-9]{4}|\\d{2}|(0?[1-9]|[12][0-9]|3[01]))([\\/]|[\\-])((0?[1-9]|1[012]))([\\/]|[\\-])([0-9]{4}|[0-9]{2})))";
      String regex = ".([A-Z]{4}[1-9]{2}(0?[1-9]|1[1|0|2])[A-Z| 0-9]{3})";//Expresion de la RFC
      String URL = "[^;]*[\\w+]+[^..][:graph:]*((([:alpha:]*)[...]*)([a-z]+|[A-Z]+|(youtube|[http]|[facebook]|[https?]|[ftp]|[file]|[blogpost]))([.com])*[://|/|:/][-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]+)";//Validacion de la url
      Pattern pattern = Pattern.compile(regex);
      Pattern patternFecha = Pattern.compile(fecha);
        Pattern patternURL = Pattern.compile(URL);
      BufferedReader lector = new BufferedReader(new FileReader("C://Users/Leonel/Documents/UTM/semestre3/Programacion/ProyectoComputacion/src/data_er1.txt"));
      StringBuilder cadena = new StringBuilder();
      String line = null;
      while ((line = lector.readLine()) != null) {
        cadena.append(line);
      }
      lector.close();//Cerramos el archivo
      String contenido = cadena.toString();
      //System.out.println(contenido);
      Matcher matcher = pattern.matcher(contenido);
      Matcher matcherURL = patternURL.matcher(contenido);
      Matcher matcherFecha = patternFecha.matcher(contenido);
      while(matcher.find())
      {
          System.out.println(matcher.group());
          cont++;
      }
      while(matcherFecha.find())
      {
          System.out.println(matcherFecha.group());
          contfecha++;
      }
            
      while(matcherURL.find())
      {
          System.out.println(matcherURL.group());
          cont2++;
      }
      System.out.println("Numero de fechas:  "+ contfecha);
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
