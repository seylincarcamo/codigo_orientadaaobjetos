
package tareamodulo5;

/**
 *
 * @author Seilyn Carcamo
 */
public class Triangulo extends Formas
{
    private int angulo;
   
    public Triangulo(String nombre, String color, int angulo){
       super(nombre,color);
       this.angulo = angulo;
    }
    
    public void set_radio(int angulo){
        this.angulo = angulo;
    }
    
    public int get_angulo(){
        return this.angulo;
    }
    
    public void calcularArea(){
        System.out.println("El calculo del area es: " + ((angulo*angulo)/2));
    }
}
