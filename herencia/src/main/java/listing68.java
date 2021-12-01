/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */
//No hay herencia multiple en java 
class Vehiculo{
    private int ruedas; 
    private int pasajeros;
    public void setRuedas(int num)
    {
        ruedas = num;
    }
    public int getRuedas()
    {
        return ruedas;
    }
    public void setPasajeros(int num)
    {
        pasajeros = num;
    }
    public int getPasajeros()
    {
        return pasajeros;
    }
}
public class listing68 extends Vehiculo{
    private int carga;
    public void setCarga(int num)
    {
        carga = num;
    }
    public int getCarga()
    {
        return carga;
    }
    public void muestra()
    {
        //Uso de metodos heredados
        System.out.println("Ruedas: "+getRuedas());
        System.out.println("Pasajeros: "+getPasajeros());
        //Metodo de la clase Camion
        System.out.println("Capacidad de carga: "+getCarga());
    }
    public static void main(String[] args) {
        listing68 ford = new listing68();
        ford.setRuedas(6);
        ford.setPasajeros(3);
        ford.setCarga(3200);
        ford.muestra();
    }
}
