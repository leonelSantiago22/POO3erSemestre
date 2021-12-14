
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
public class readtxt2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filename = "C://Users/Leonel/Documents/UTM/semestre3/Programacion/ProyectoComputacion/src/data_er1.txt";
        
        String regex = "^.([A-Z]{4}[1-9]{2}(0?[1-9]|1?[1|0|2]){2}(0?[1-9]|1?[1|0|2]){2}[A-Z|0-9]{3})";//Expresion de la RFC
        int cont=0;
        Pattern pattern = Pattern.compile(regex);
        String h=" ";
        try(FileInputStream fis = new FileInputStream(filename)){
            int i;
            while((i = fis.read())!=-1){
                  System.out.print((char)i);
                  h+=String.valueOf((char)i);
            }
            System.out.println(h);
            /*
            Matcher matcher = pattern.matcher(h);
            boolean matchFound = matcher.find();
            while(matchFound){
                cont++;
               System.out.println(matcher.group());
            }
            System.out.println(cont);
            fis.close();*/
        }
                
                
    }
}
