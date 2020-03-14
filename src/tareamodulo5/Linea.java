package tareamodulo5;

/**
 *
 * @author Seilyn Carcamo
 */
public class Linea extends Formas
{
    private int largo;
   
    public Linea(String nombre, String color, int largo){
       super(nombre,color);
       this.largo = largo;
    }
    
    public void set_largo(int largo){
        this.largo = largo;
    }
    
    public int get_largo(){
        return this.largo;
    }   
   
}

