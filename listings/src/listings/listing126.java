/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listings;

/**
 *
 * @author Leonel
 */
public class listing126 {
    interface HolaMundo{
        public void saludar();
        
        public void saludarAlguien(String alguien);
    }
    
    public void decirHola()
    {
        class SaludarEnIngles implements HolaMundo{
            String nombre = "world";
            public void saludar()
            {
                SaludarAlguien("world");
            }
            public void SaludarAlguien(String alguien)
            {
                nombre = alguien;
                System.out.println("Hello "+nombre);
            }
        }
        HolaMundo saludarEnIngles =  new SaludarEnIngles();
        
        HolaMundo saludarEnFrances = new HolaMundo()
        {
         String nombre = "tout le monde";
         public void saludar ()
         {
             SaludarAlgueien("tout le monde");
         }
         @Override
         public void SaludarAlgueien(String alguien)
         {
             nombre = alguien;
             System.out.println("salut "+ nombre);
         }
        };
    }
}
