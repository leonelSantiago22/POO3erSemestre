/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */

import java.util.Scanner;
public class listaligada { // clase maesstra 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        Persona n = new Persona();
        Persona n2 = new Persona();
        Profesor pro = new Profesor();
        pro.setNombre("profesor");
        pro.setEdad(16);
        lista.inserHead(pro);
        lista.Mostar();
        int op=-1;
        do{
            
            System.out.println("1.Ingresar en el head");
            System.out.println("2.Ingresar siguiente");
            System.out.println("3.-mostrar");
            op = Integer.parseInt(scanner.nextLine());
            switch(op)
                    {
                        case 1: System.out.println("Ingresa un nombre: ");
                                String nombre = String.valueOf(scanner.nextLine());
                                System.out.println("Ingresa una edad: ");
                                int edad = Integer.parseInt(scanner.nextLine());
                                n.setNombre(nombre);
                                n.setEdad(edad);
                                lista.inserHead(n);
                                //n = null;
                                break;
                        case 2: System.out.println("Ingresa un nombre: ");
                                String nombre2 = String.valueOf(scanner.nextLine());
                                System.out.println("Ingresa una edad: ");
                                int edad2 = Integer.parseInt(scanner.nextLine());
                                n2.setNombre(nombre2);
                                n2.setEdad(edad2);
                                lista.inserEnd(n2);
                                n2 = new Persona();
                                break;
                        case 3: 
                            lista.Mostar();
                    }
        }while(op<=5);
    }
}

class Nodo {
    private Persona nombre; 
    private Profesor profesor;
    private Nodo siguiente; 
    public Nodo (Persona _nombre, Nodo sig)
    {
        nombre = _nombre; 
        siguiente = sig; 
    }
    public Persona  getNombre()
    {
        return nombre; 
    }
    public Nodo getSig()
    {
        return siguiente;
    }
    public void setNombre(Persona _nombre )
    {
        
            nombre = _nombre;
        
    }
    public void setSig(Nodo sig)
    {
        siguiente = sig; 
    }
}

class Lista
{
    private Nodo head; 
    //private int numelementos;
    public Lista()
    {
        head = null;
       // numelementos = 0;
    }
    public void inserHead(Persona _nombre )
    {
        Nodo n = new Nodo (_nombre, head);
        head = n;
        //numelementos++;
    }
    public void inserEnd(Persona _nombre)
    {
        Nodo n = new Nodo(_nombre, null);
        if(head == null)
        {
            head = n; 
        }else {
            Nodo aux = head; 
            while(aux.getSig()!=null)
            {
                aux = aux.getSig();
            }
            aux.setSig(n);
           // numelementos++;
        }
        System.out.println("Final");
    }
    public void Mostar()
    {
        Nodo aux = head;
        Persona per; 
       // Profesor pro;
        while(aux.getSig() !=null)
        {
            per = aux.getNombre();
            if(per !=null){
            System.out.println(per.getNombre());
            System.out.println(per.getEdad());
            
            }
            aux = aux.getSig();
        }
        per = aux.getNombre();
        System.out.println(per.getNombre());
        System.out.println(per.getEdad());
    }
}

class Persona {
    
    private String nombre;
    private int edad;
    
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