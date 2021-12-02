
import static java.lang.constant.ConstantDescs.NULL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
public class Main {
    
}




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
class Persona 
{
    
    protected String nombre;
    protected int edad;
    public Persona(String _nombre, int _edad){
        _nombre = (String) NULL;
        nombre = _nombre;
        _edad =0;
        edad = _edad;
    }
    public void setnombre(String n)
    {
        if(n!=(String)NULL)
        {
            nombre =n;
        }else{
            System.out.println("No se puede");
            return;
        }
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setEdad(int ed)
    {
        if(ed>=0)
        {
            edad = ed;
        }
    }
    public int getEdad()
    {
        return edad;
    }
}

 class Alumno extends Persona{
    protected int matricula;
    public Alumno(int _matricula)
    {
        _matricula = 0;
        matricula =_matricula;
    }
    
    public void setMAtricula(int _matricula)
    {
        if(_matricula!=0){
            matricula = _matricula;
        }
    }
    
}



