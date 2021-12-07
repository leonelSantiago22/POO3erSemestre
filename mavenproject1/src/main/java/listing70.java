/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */

class Point{
    protected double x,y; //Coordenadas del punto
    
    //constructor
    public Point ( double a, double b)
    {
        setPoint(a,b);
    }
    //Asigna a x,y las coordenadas del punto
    public void setPoint(double a, double b){
        x = a; 
        y =b;
    }
    //obtiene cordenada x 
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y; 
    }
    //convierte informacaion a cadena 
    public String toString()
    {
        return"["+x+","+y+"]";
    }
}
//definicion de la clase circulo 
class Circle extends Point{ //Heteda de Point 
    protected double radius; 
    
    //contructor sin argumentos 
    public Circle()
    {
        super (0,0);//llamada a constructor de la clase base 
        setRadius(0);
    }
    public Circle ( double r, double a, double b)
    {
        super(a,b);
        setRadius(r);
    }
    //Asigna el radio del circulo
    public void setRadius(double r)
    {
        radius = (r>=0.0? r : 0.0);
    }
    //Obtiene radio del circulo
    public double getRadius()
    {
        return radius;
    }
    public double area()
    {
        return 3.14*radius * radius;
    }
    //Convierte informacion en cadena 
    public String toString()
    {
        return "Centro = " + "["+x+","+y+"]"+";Radio = "+radius;
    }
}
public class listing70 
{
    public static void main(String[] args) {
        Point pointRef, p;
        Circle circleRef, c; 
        p = new Point (3.5, 5.3);
        c = new Circle(2.7, 1.2, 8.9);
        System.out.println("Punto p: "+p.toString());
        System.out.println("Circulo c: "+p.toString());
        // Tratamiento del circulo como instancia de punto
        pointRef = c; //asigna circulo c a pointRef
        //en realidad java lo reconoce dinamicamente como objeto Circle 
        System.out.println("Circulo c (via point ref)"+pointRef.toString());
        //manejar a un circulo como circulo (obteniendolo de una refrencia de punto)
        pointRef = c; //asigna circulo c a pointRef. Se repite la operacion por claridad
        circleRef = (Circle) pointRef; //enmascaramiento de superclase a subclase 
        System.out.println("Circulo (vias circleRef: "+circleRef.toString());
        System.out.println("Area de c (via circleRef): "+circleRef.area());
        
        //intnento de refenciar a un onjeto point 
        //dede unn referencia de Cirlce (genera una excepcion)
        //circleRef = (Circle )p;//genrea error 
    }
}
