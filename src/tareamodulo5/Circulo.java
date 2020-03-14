
package tareamodulo5;

/**
 *
 * @author Seilyn Carcamo
 */
public class Circulo extends Formas
{
    private int radio;
   
    public Circulo(String nombre, String color, int radio){
       super(nombre,color);
       this.radio = radio;
    }
    
    public void set_radio(int radio){
        this.radio = radio;
    }
    
    public int get_radio(){
        return this.radio;
    }
    
    public void calcularRadio(){
        System.out.println("El calculo del area es: " + (3.1416 * Math.pow(radio,2)));
    }
}
