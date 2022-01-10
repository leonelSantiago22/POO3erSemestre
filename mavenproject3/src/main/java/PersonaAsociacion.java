
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
class Alumno{
    private String nombre;
    private int matricula;
    private int grupo;
    private Libro lPrestado[];
    public void Alumno()
    {
        nombre = null;
        matricula =0;
        grupo = 0;
        lPrestado = new Libro[5];
        for(int i=0; i<5; i++)
        {
            lPrestado[i] = null;
        }
    }
    public void setNombre(String _nombre)
    {
        if(_nombre!=null){
            nombre = _nombre;
        }else {
            System.out.println("nombre no valido");
        }
    }
    public void setMatricula(int _ma)
    {
        if(_ma>0 && _ma<100000){
            matricula = _ma;
        }else {
            System.out.println("Matricula no valida ");
        }
    }
    public void setGrupo(int _gr)
    {
        if(_gr>0 && _gr<100 ){
            grupo = _gr;
        }
    }
    public void setLibro(Libro _l)
    {
        if(_l != null){
        int i=0;
        while(this.lPrestado[i]!=null)
        {
            i++;
        }
        lPrestado[i] = _l;
        }else{
            System.out.println("Libro no valido");
        }
    }
    public String getNombre(){
        return nombre;
    }
    public int getGrupo()
    {
        return grupo;
    }
    public int getMatricula()
    {
        return matricula;
    }
    public void mostrarLibros()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Posision"+(i+1)+" Libro   "+lPrestado[i].toString());
        }
    }
    public void Devolucion(int pos)
    {
        if(lPrestado[pos]!=null)
        {
            System.out.println(lPrestado[pos]);
            lPrestado[pos] = null;
        }else{
            System.out.println("Posicion no encontrada");
        }
    }
    public void mostrar()
    {
        System.out.println("nombre: "+getNombre());
        System.out.println("Matricula: "+getMatricula());
        System.out.println("Grupo: "+getMatricula());
        for(int i=0; i<5; i++)
        {
            if(lPrestado[i]!=null)
            {
                System.out.println("Libro "+(i+1)+" "+lPrestado[i].toString());
            }
        }
    }
    
};

class Libro{
    private String nombreLibro;
    private String editorial;
    private int edicion; 
    private int anio;
    protected Alumno aLumno;
    public Libro()
    {
           aLumno = null;
    }
    public void setNombreLibro(String _nombre)
    {
        if(_nombre!=null)
        {
            nombreLibro = _nombre;
        }else{
            System.out.println("Nombre del libro no valido");
        }
    }
    public String getNombreLibro()
    {
        return nombreLibro;
    }
    public void setEditorial(String _editorial)
    {
        if(_editorial!=null)
        {
            editorial = _editorial;
        }else{
            System.out.println("Editorial no valida");
        }
    }
    public String getEditorial()
    {
        return editorial;
    }
    public void setEdicion(int _ed)
    {
        if(_ed>0)
        {
            edicion = _ed;
        }else{
            System.out.println("Edicion no valida");
        }
    }
    public int getEdicion()
    {
        return edicion;
    }
    public void setAnio(int _an)
    {
        if(_an>0 && _an<=2021)
        {
            anio = _an;
        }else{
            System.out.println("Anio no valido");
        }
    }
    public int getAnio()
    {
        return anio;
    }
    public void setAlumno(Alumno _al)
    {
        aLumno = _al;
    }
};

public class PersonaAsociacion {
       public static void main(String[] args) {
        Alumno alumno = new Alumno();
        Libro libro = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();
        Libro libro5 = new Libro();
        alumno.setGrupo(6);
        alumno.setNombre("Leonel");
        alumno.setMatricula(123);
        libro.setAlumno(alumno);
        libro.setAnio(1234);
        libro.setEdicion(2);
        libro.setEditorial("Lobesno");
        libro.setNombreLibro("Hasta que te conoci");
        libro2.setAlumno(alumno);
        libro2.setAnio(1234);
        libro2.setEdicion(2);
        libro2.setEditorial("Lobesno");
        libro2.setNombreLibro("Hasta que te conoci");
        libro3.setAlumno(alumno);
        libro3.setAnio(1234);
        libro3.setEdicion(2);
        libro3.setEditorial("Lobesno");
        libro3.setNombreLibro("Hasta que te conoci");
        libro4.setAlumno(alumno);
        libro4.setAnio(1234);
        libro4.setEdicion(2);
        libro4.setEditorial("Lobesno");
        libro4.setNombreLibro("Hasta que te conoci");
        libro5.setAlumno(alumno);
        libro5.setAnio(1234);
        libro5.setEdicion(2);
        libro5.setEditorial("Lobesno");
        libro5.setNombreLibro("Hasta que te conoci");
        alumno.setLibro(libro);
        alumno.setLibro(libro2);
        alumno.setLibro(libro3);
        alumno.setLibro(libro4);
        alumno.setLibro(libro5);
        alumno.mostrar();
    }
}
