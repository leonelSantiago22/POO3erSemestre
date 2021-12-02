/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
class Acceso{
    protected int b;
    protected int f2(){
        return b;
    }
    
    private int c;
    private int f3(){
        return c;
    }
    public int d,f;
    public int f4(){
        return d;
    }
}
public class listing69 
{
    public static void main(String[] args) {
        Acceso obj = new Acceso();
        obj.f2();//Es valido, ya que por omision
        obj.b=2;//las dos clases esntan el el mismo paquete
        
        //obj.c = 3;//Error son atributos provados
        //obj.f3();
        
        obj.d = 5;
        obj.f4();
    }
}
