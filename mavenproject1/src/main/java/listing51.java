/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */

class Fecha{
    private int dia; 
    private int mes, ano; 
    
    public Fecha(){
        dia = mes =1; 
        ano = 1900;
    }
    public boolean setDia(int d)
    {
        if(d>=1 && d<=31){
            dia = d;
            return true;
        }
          return false;
    }
    public int getDia() {
        return dia;
    }
    public boolean setMes(int m)
    {
        if(m>=1 && m<=12)
        {
            mes = m; 
            return true;
        }
        return false;
    }
    public int getMes()
    {
        return mes; 
    }
    public boolean setAno(int a)
    {
        if(a>=1900)
        {
            ano = a;
            return true;
        }
        return false;
    }
    public int getAno()
    {
        return ano;
    }
}
public class listing51 
{
    public static void main(String[] args)
    {
        final Fecha f; 
        f = new Fecha();
        f.setDia(10);
        f.setMes(3);
        f.setAno(2001);
        System.out.println(f.getDia()+"/"+f.getMes()+"/"+f.getAno());
       // f= new Fecha(); //Error: la variable f es final y no puede ser reasignada
    }
}
