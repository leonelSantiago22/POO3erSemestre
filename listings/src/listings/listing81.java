/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */
class Base 
{
    public void quien()
    {
        System.out.println("Base");
    }
}

class primera extends Base 
{
    public void quien()
    {
        System.out.println("primera ");
    }
}
class segunda extends Base 
{
    public void quien()
    {
        System.out.println("Segunda");
    }
}
class tercera extends Base {}

class cuarta extends Base {
    /*public int quien()// No se vale con un tipo de dato diferente 
    {
        System.out.println("Cuarta");
    return 1;
    }
    */
}
public class listing81 
{
    public static void main(String[] args) {
        Base objBase = new Base(), pBase;
        primera obj1 = new primera();
        segunda obj2 = new segunda();
        tercera obj3 = new tercera(); 
        cuarta obj4 = new cuarta();
        pBase = objBase;
        pBase.quien();
        
        pBase = obj1;
        pBase.quien();;
        
        pBase = obj2;
        pBase.quien();;
        
        pBase = obj3; 
        pBase.quien();
        
        pBase = obj4;
        pBase.quien();
    }
}
