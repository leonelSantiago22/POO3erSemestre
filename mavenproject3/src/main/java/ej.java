/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
//toString representa una cantidad de texto.
import java.lang.String;
import java.lang.Integer;
public class ej {
    public static void main(String[] args) {
        Alumno al = new Alumno();
        System.out.println("Alumno:");
        al.setEdad(14);
        al.setMatricula(120);
        al.setNombre("Leonel");
        al.mostrar();
        System.out.println("Profesor: ");
        Profesor pro = new Profesor();
        pro.setNombre("Alan");
        pro.setEdad(35);
        pro.setSueldo(1000);
        pro.mostrar();
        Lic l = new Lic();
        l.setEdad(18);
        l.setNombre("JOrge");
        l.setMatricula(10);
        l.setSemestre(4);
        System.out.println("Lic");
        System.out.println("Edad: "+l.getEdad());
        System.out.println("Nombre:"+l.getNombre());
        System.out.println("Matricula"+l.getMatricula());
        System.out.println("Semeste: "+l.getSemestre());
        Posgrado po = new Posgrado();
        po.setNombre("Barahona");
        po.setMaterias(7);
        po.setMatricula(123);
        po.setEdad(25);
        po.mostar();
    }
    
}
class Persona {
    
    private String nombre;
    private int edad;
    public Persona( )
    {
        nombre = null;
    }
    public void setNombre(String _nom)
    {
        if(_nom!=(String)null){
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
class Profesor extends Persona{
    private int sueldo; 
    
    public void setSueldo(int _sueldo)
    {
        if(_sueldo>0 && _sueldo<10000)
        {
            sueldo = _sueldo;
        }else{
            System.out.println("No se pudo ingresar el sueldo");
            return;
        }
    }
    public int getSueldo()
    {
        return sueldo;
    }
    public void mostrar()
    {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Sueldo: "+getSueldo());
    }
}

class Lic extends Alumno{
    private int semestre;
    public void setSemestre(int _semestre)
    {
        if(_semestre>0 && _semestre<=10)
        {
            semestre= _semestre;
        }else{
            System.out.println("Semestre no valido");
        }
    }
    public int getSemestre()
    {
        return semestre;
    }
}

class Posgrado extends Alumno {
    private int materias; 
    
    public void setMaterias(int _materias)
    {
        if(_materias>0 && _materias<=10 )
        {
            materias = _materias;
        }else{
            System.out.println("No es valida las materias");
        }
    }
    public int getMaterias()
    {
        return materias;
    }
    
    public void mostar()
    {
        System.out.println("clase posgrado");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Materias: "+getMaterias());
        System.out.println("Matricula:"+getMatricula());
    }
    
}