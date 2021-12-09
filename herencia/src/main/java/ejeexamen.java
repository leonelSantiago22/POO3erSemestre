/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */

class camion{
    private int ruedas;
    public camion(int r)
    {
        ruedas = r;
    }
    public void setRuesdas(int r)
    {
        if(r>0){
            ruedas = r;
        }
    }
    public int getRuedas(){
        return ruedas;
    }
}

class tipo extends camion {
    private String tipo; 
    public tipo(String t, int ruedas) 
    {
        super(ruedas);
        tipo = t;
    }
    public void setTipo(String t)
    {
        if(t!=null)
        {
            tipo = t;
        }else
            return;
    }
    public String getTipo(){
        return tipo;
    }
}
interface pasajerosImpl{
    public void setPasajeros(int pas);
    public int getPasajeros();
}
class pasajeros extends tipo implements pasajerosImpl{
    private int pasajeros; 
    public pasajeros(int pas, String tipo, int ruedas)
    {
        
        super(tipo, ruedas);
        pasajeros = pas;
        //super(ruedas);
    }
    public void setPasajeros(int pas)
    {
        if(pas>0 && pas<10)
        {
            pasajeros = pas;
        }
    }
    public int getPasajeros()
    {
        return pasajeros;
    }
}
public class ejeexamen {
    public static void main(String[] args) {
        camion x =  new camion(3);
        x.setRuesdas(4);
        System.out.println(x.getRuedas());
        tipo y = new tipo("Ford", 4);
        y.setTipo("Ban");
        y.setRuesdas(5);
        System.out.println(y.getRuedas());
        System.out.println(y.getTipo());
        pasajeros pa = new pasajeros(0,null,0);
        pa.setPasajeros(6);
        pa.setRuesdas(8);
        pa.setTipo("Furgoneta");
        System.out.println("Class Pasajeros ");
        System.out.println(pa.getPasajeros());
        System.out.println(pa.getRuedas());
        System.out.println(pa.getTipo());
    }
}
