abstract class Employee {
 private String firstName;
 private String lastName;

 // Constructor
 public Employee( String first, String last ) {
firstName = new String ( first );
lastName = new String( last );
 }

public String getFirstName() {
 return new String( firstName );
 }

 public String getLastName() {
 return new String( lastName );
}

 // el metodo abstracto debe de ser implementado por cada
// clase derivada de Employee para poder ser
// instanciadas las subclases
 public abstract double earnings();
 }

// Clase Boss class derivada de Employee
  final class Boss extends Employee {
 private double weeklySalary;

 public Boss( String first, String last, double s) {
 super( first, last ); // llamada al constructor de clase base
setWeeklySalary( s );
 }


public void setWeeklySalary( double s ){
weeklySalary = ( s > 0 ?s: 0 );
}

 // obtiene pago del jefe
 public double earnings() {
 return weeklySalary;
 }

 public String toString() {
return "Jefe: " + getFirstName() + ' ' +
 getLastName();
}
}

 // Clase PieceWorker derivada de Employee
  final class PieceWorker extends Employee {
 private double wagePerPiece; // pago por pieza
 private int quantity; // piezas por semana

 public PieceWorker( String first, String last,
 double w, int q) {
 super( first, last );
 setWage( w );
 setQuantity( q );
 }

public void setWage( double w) {
 wagePerPiece = ( w > 0 ?w: 0 );
}

 public void setQuantity( int q) {
 quantity = ( q > 0 ?q: 0 );
 }

 public double earnings() {
 return quantity * wagePerPiece;
 }

 public String toString() {
return "Trabajador por pieza: " +

 getFirstName() + ' ' + getLastName();
 }
 }

 // Clase HourlyWorker derivada de Employee
 final class HourlyWorker extends Employee {
private double wage; // pago por hora
 private double hours; // horas trabajadas por semana

 public HourlyWorker( String first, String last,
 double w, double h) {
super( first, last );
 setWage( w );
setHours( h );
 }

 public void setWage( double w) {
wage = ( w > 0 ?w: 0 );
 }

 public void setHours( double h) {
hours = ( h >= 0 && h < 168 ?h: 0 );
 }

 public double earnings() {
 return wage * hours;
 }

 public String toString() {
 return "Trabajador por hora: " +
 getFirstName() + ' ' + getLastName();
 }
 }

 // Clase CommissionWorker derivada de Employee
  final class CommissionWorker extends Employee {
 private double salary; // salario base por semana
private double commission; // monto por producto vendido
 private int quantity; // total de productos vendidos por semana

 public CommissionWorker( String first, String last,
 double s, double c, int q) {

 super( first, last );
 setSalary( s );
 setCommission( c );
 setQuantity( q );
 }

 public void setSalary( double s) {
 salary = ( s > 0 ?s: 0 );
 }

 public void setCommission( double c) {
 commission = ( c > 0 ?c: 0 );
}

 public void setQuantity( int q) {
 quantity = ( q > 0 ?q: 0 );
 }
 public double earnings() {
 return salary + commission * quantity;
 }

 public String toString() {
 return "Trabajador por Comision : " +
 getFirstName() + ' ' + getLastName();
 }
}

// Programa de ejemplo Polimorfismo
 public class listing82{
 public static void main( String rgs[] ) {
 Employee ref; // referencia de clase base
 Boss b;
 CommissionWorker c;
 PieceWorker p;
 HourlyWorker h;
 b = new Boss( "Alan", "Turing", 800.00 );
 c = new CommissionWorker( "Ada", "Lovelace",
 400.0, 3.0, 150);
 p = new PieceWorker( "Grace", "Hopper", 2.5, 200 );
 h = new HourlyWorker( "James", "Gosling", 13.75, 40 );


 ref = b; // referencia de superclase a objeto de subclase
 System.out.println( ref.toString() + " gan´o $" +
 ref.earnings() );
 System.out.println( b.toString() + " gan´o $" +
 b.earnings() );

 ref = c; // referencia de superclase a objeto de subclase
System.out.println( ref.toString() + " gan´o $" +
 ref.earnings() );
 System.out.println( c.toString() + " gan´o $" +
 c.earnings() );
 ref = p; // referencia de superclase a objeto de subclase
 System.out.println( ref.toString() + " gan´o $" +
 ref.earnings() );
 System.out.println( p.toString() + " gan´o $" +
 p.earnings() );

 ref = h; // referencia de superclase a objeto de subclase
 System.out.println( ref.toString() + " gan´o $" +
 ref.earnings() );
 System.out.println( h.toString() + " gan´o $" +
 h.earnings() );
 }
 }