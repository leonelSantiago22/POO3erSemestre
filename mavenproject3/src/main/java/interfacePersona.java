/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */

interface personaImpl
{
    public void setNombre(String _nom);
    public String getNombre();
    public void setEdad(int _edad);
    public int getEdad();
}

class Persona implements personaImpl
{
    private String nombre;
    private int edad;
    public void setNombre(String _nom)
    {
        if(_nom!=null)
        {
            nombre = _nom;
        }else{System.out.println("No se puede resolver");
        return;}
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int _edad)
    {
        if(_edad>0)
        {
            edad = _edad;
        }else{
            System.out.println("LA edad no puede ser negavita ");
            return;
        }
    }
    public int getEdad(){
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
interface profesorImplements{
    public void setSueldo(int _sueldo);
    public int getSueldo();
    public void mostrar();
}
class Profesor extends Persona implements profesorImplements{
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
class estudianteProfesor extends Posgrado implements profesorImplements{
    private int clasesSemanales;
    private int sueldo; 
    public void setClaSemanales(int _cla)
    {
        if(_cla>0 && _cla<10)
        {
            clasesSemanales = _cla;
        }else{
            System.out.println("Supero las clases semanales");
            return;
        }
    }
    public int getClaSemanales()
    {
        return clasesSemanales;
    }
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
        System.out.println("Clase Estudiante Profesor");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Sueldo: "+getSueldo());
        System.out.println("Materias"+getMaterias());
        System.out.println("Matricula:"+getMatricula());
        System.out.println("Clases Semanales: "+getClaSemanales());
    }
    
    
}
public class interfacePersona {
    public static void main(String[] args) {
        estudianteProfesor ESpro = new estudianteProfesor();
        ESpro.setNombre("Leonel");
        ESpro.setEdad(19);
        ESpro.setMaterias(4);
        ESpro.setMatricula(123);
        ESpro.setClaSemanales(5);
        ESpro.mostrar();
    }
}
