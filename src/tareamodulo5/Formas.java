package tareamodulo5;

/**
 *
 * @author Seilyn Carcamo
 */
public class Formas
{
    private String color;
    private String nombre;
    
    public Formas(String nombre, String color){
       this.nombre = nombre;
       this.color = color;
    }   
    
    public void set_dibujar(String nombre){
        this.nombre = nombre;
    }
    public void set_establecer_color(String color){
        this.color = color;
    }    
    public void dibujar(){
        System.out.println(this.nombre);
    }
    public String get_establecer_color(){
        return this.color;
    }
    
    public void imprimir_informacion(){
        System.out.println("El nombre es: " + this.nombre);
        System.out.println("El color es: " + this.color);
    }
}
