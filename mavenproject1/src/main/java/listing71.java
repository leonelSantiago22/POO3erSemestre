/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
class Empleado { 
    private String firstName, lastName; 
    public Empleado (String first, String last )
    {
        firstName = new String(first);
        lastName = new String(last);
    }
    public void print()
    {
        System.out.println(firstName+' '+lastName);
    }
}

class TrabajadoraPorhora extends Empleado 
{
    private float wage, hours; 
    public TrabajadoraPorhora(String first, String last, float initHours, float initWage)
    {
        super(first, last);
        hours = initHours; 
        wage = initWage; 
    }
    public float getPay()
    {
        return wage * hours; 
    }
    public void print()
    {
        System.out.println("Metodo priint de Trabajador por hora");
        super.print();
        System.out.println("es un trabajador por hora con sueldo de "+"$"+getPay());
    }
}
public class listing71 {
    public static void main(String[] args) {
        Empleado e = new Empleado ("nombre", "apellido");
        TrabajadoraPorhora h; 
        h = new TrabajadoraPorhora ("Juanito", "Perez", 40.0f, 7.50f);
        e.print();
        h.print();
    }
}
