/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */

class Cola{
    private int q[];
    private int sloc, rloc; 
    
    public void ini()
    {
        sloc = rloc = -1; 
        q = new int [10]; 
    }
    public boolean set( int val)
    {
        if(sloc>=10)
        {
            System.out.println("La cola esta llena");
            return false; 
        }
        sloc++;
        q[sloc] = val; 
        return true; 
    }
    public int get()
    {
        if(rloc==sloc)
        {
            System.out.println("La cola esta vacia");
            return -1; 
        }else{
            rloc++;
            return q[rloc];
        }
    }
}

public class listing37 
{
    public static void main(String argv[])
    {
        Cola a=new Cola(); 
        Cola b=new Cola(); 
        Cola pCola= new Cola();
        a.ini();
        b.ini();
        pCola.ini();
        
        a.set(1);
        b.set(2);
        pCola.set(3);
        a.set(11);
        a.set(22);
        pCola.set(33);
        
        System.out.println(a.get());
        System.out.println(a.get());
        System.out.println(b.get());
        System.out.println(b.get());
        System.out.println(pCola.get());
        System.out.println(pCola.get());
        
    }
}
