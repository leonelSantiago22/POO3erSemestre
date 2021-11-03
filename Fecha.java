class FECHA2 {
    private int dia,mes,an;
    
    public int getDia()
    {
        return dia;
    }
    public int getMes()
    {
        return mes;
    }
    public int getAn()
    {
        return an;
    }
    
    public boolean setDia(int d )
    {
        if(d<=31 && d>0)
        {
            System.out.println("El dia es correcto");
            dia = d; 
            return true;
        }else{
            System.out.println("El dia no es correcto");
            dia = -1; 
            return false;
        }
    }
    public boolean setMes(int m)
    {
        if(m<=12 && m>0){
            System.out.println("el mes es correcto");
            mes = m;
            return true;
        }else{
            System.out.println("El mes es incorrecto");
            mes = -1;
            return false;
        }
    }
    public boolean setAn(int a)
    {
        if((a>0)&&(a<=9999))
        {
            System.out.println("El ano es correcto");
            an = a; 
            return true; 
        }else{
            System.out.println("El ano no es correcto");
            an = -1; 
            return false; 
        }
    }
}

public class Fecha 
{
    public static void main(String argv[]){
    FECHA2  a = new FECHA2();
    a.setMes(11);
    a.setAn(2021);
    a.setDia(12);
    
        System.out.println(a.getAn());
        System.out.println(a.getDia());
        System.out.println(a.getDia());
    
    }
    
}
