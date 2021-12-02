
import static java.lang.constant.ConstantDescs.NULL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
public class Main3 {
    public static void main(String[] args) {
        Alumno al = new Alumno();
        al.setEdad(18);
        al.setNombre("Leonel");
        al.setMatricula(102);
        al.mostrar();
    }
}

class Persona {
    
    private String nombre;
    private int edad;
    public Persona(String _nombre, int _edad)
    {
        _nombre = (String) NULL;
        nombre = _nombre;
        _edad =0; 
        edad = _edad;
    }
    
    public void setNombre(String _nom)
    {
        if(_nom!=(String)NULL){
            nombre = _nom;
        }
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setEdad(int _edad)
    {
        if(_edad>=0)
        {
            edad = _edad;
        }
    }
    public int getEdad()
    {
        return edad;
    }
}

class Alumno extends Persona{
    private int matricula;
    public void setMatricula(int _matricula)
    {
        if(_matricula>=0 && matricula<=1000)
        {
            matricula = _matricula;
        }else{
            System.out.println("La matricula no es valida");
            return;
        }
    }
    public int getMatricula()
    {
        return matricula;
    }
    public void mostrar()
    {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Matricula :"+getMatricula());
    }
}


