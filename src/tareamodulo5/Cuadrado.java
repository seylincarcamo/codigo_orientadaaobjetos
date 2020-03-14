package tareamodulo5;

/**
 *
 * @author Seilyn Carcamo
 */
    public class Cuadrado extends Formas
{
    private int area;
   
    public Cuadrado(String nombre, String color, int area){
       super(nombre,color);
       this.area = area;
    }
    
    public void set_area(int area){
        this.area = area;
    }
    
    public int get_area(){
        return this.area;
    }
    
    public void calcularArea(){
        System.out.println("El calculo del area es: " + (area*area));
    }
}
