
import java.io.File;
import java.io.FileNotFoundException;
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
public class readtxt {
    public static void main(String[] args) throws FileNotFoundException {
        String regex = "^.([A-Z]{4}[1-9]{2}(0?[1-9]|1[1|0|2])[A-Z| 0-9]{3})";//Expresion de la RFC
        String URL = "(facebook|https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";//Validacion de la url
        File file  = new File("C://Users/Leonel/Documents/UTM/semestre3/Programacion/ProyectoComputacion/src/data_er1.txt");
        Pattern pattern = Pattern.compile(regex);
        Pattern patternURL = Pattern.compile(URL);
        int cont=0, contURL =0;
        Scanner scan = new Scanner(file);
        scan.useDelimiter(";");
        while(scan.hasNextLine()){
            String h = scan.next();
            Matcher matcher = pattern.matcher(h);
            Matcher matcherURL = patternURL.matcher(h);
            boolean matchFound = matcher.find();
            boolean matchFoundURL = matcherURL.find();
            if(matchFound){
                cont++;
                System.out.println(h);
            }    
            if(matchFoundURL){
                contURL++;
                System.out.println(h);
            } 
        }
        System.out.println("Total de coincidencias RFC "+cont);
        System.out.println("Coincidencias URL  "+contURL);
    }
}
