 class listing47 
{
    private String nombre;
        private static int numObjectos;
        public Objeto(String cadena)
        {
            if(cadena.length()!=0)
                nombre = cadena;
            else
                nombre = "Cadena por omision";
         numObjectos++;
        }

        public static int getNumObjectos(){
            return numObjectos;
        }
        public static void main (String argv[]) 
        {
            System.out.println("Objetos: "+getNumObjectos()); 
            System.out.println("Objetos: "+Objeto.getNumObjectos());
            Objeto uno,dos;
            uno = new Objeto("");
            dos = new Objeto("Objeto dos");

            System.out.println("Objetos: "+uno.getNumObjectos());
            System.out.println("Objetos: "+dos.getNumObjectos());
        }
}
