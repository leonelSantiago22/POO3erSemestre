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
        }else {
            System.out.println("Grupo no valido");
        }
    }
    public void setLibro(Libro _l)
    {
        if(_l != null){
        int i=0;
        while(lPrestado[i]!=null)
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
            System.out.println("Posision"+(i+1)+" Libro   "+lPrestado[i]);
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
                System.out.println("Libro "+(i+1)+" "+lPrestado[i]);
            }
        }
    }
    
};

class Libro{
    private String nombreLibro;
    private String editorial;
    private int edicion; 
    private int anio;
    private Alumno aLumno;
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
        alumno.setGrupo(3);
        alumno.setNombre("Leonel");
        alumno.setMatricula(123);
        alumno.mostrar();
    }
}
