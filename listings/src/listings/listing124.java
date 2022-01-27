/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */
public class listing124 {
    private final static int Tamano = 15; 
    private int [] arregloDeEnteros = new int [Tamano];
    
    public  listing124()
    {
        for(int i =0; i < Tamano; i++)
        {
            arregloDeEnteros [i] = i;
        }
    }
    
    public void depliegaPAres()
    {
        //Despliega calores de indices pares del arreglo 
        IteradorDeEstructuradeDatos iterador = this.new IteradorPares();
        
        while(iterador.hasNext())
        {
            System.out.println(iterador.next()+ " ");
        }
        System.out.println();
    }
    
    interface IteradorDeEstructuradeDatos extends java.util.Iterator<Integer>{}
    
    private class IteradorPares implements IteradorDeEstructuradeDatos{
        private int nextIndice = 0; 
        @Override
        public boolean hasNext()
        {
            return ( nextIndice <= Tamano - 1);
        }
        @Override
        public Integer next()
        {
            Integer reValor = Integer.valueOf(arregloDeEnteros[nextIndice]);
            nextIndice +=2;
            return reValor;
        }
        public void Remove()
        {
            throw new UnsupportedOperationException();
        }
    }
    public static void main(String s[]) {
        listing124 edd = new listing124();
        edd.depliegaPAres();
    }
}
