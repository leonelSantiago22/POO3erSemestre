package listings;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */

public abstract class listing82 
{
    private String firstName;
    private String lastName; 
    
    public listing82 (String first, String last)
    {
        firstName = new String (first);
        lastName = new String (last);
    }
    public String getFirstName() 
    {
        return new String ( firstName);
    }
    public String getLastName()
    {
        return new String(lastName);
    }
    public abstract double earnings(); 
}

 final class Boss extends listing82
{
     private double weeklySalary;
     public Boss ( String first, String last, double s )
     {
         super(first, last);
         setWeeklySalary(s);
     }
     public void setWeeklySalary(double s )
     {
         weeklySalary = ( s > 0 ?s : 0);
     }
     
     //obtiene pago del jefe 
     
     public double earnings()
     {
         return weeklySalary;
     }
     public String toString()
     {
         return " jefe: "+ getFirstName() + ' ' + getLastName();
     }
}

final class PieceWorker extends listing82 {
    private double wagePerPiece; // pago por pieza 
    private int quantity; //piezas por semana 
    
    public PieceWorker(String first, String last, double w , int q)
    {
        super(first, last);
        setWage(w);
        setQuantity(q);
    }
    public void setQuantity(int q)
    {
        quantity = ( q > 0 ? q : 0 );
    }
    public void setWage( double w )
    {
        
    }
}
