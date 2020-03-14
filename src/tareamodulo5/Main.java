
package tareamodulo5;

/**
 *
 * @author Seilyn Carcamo
 */
public class Main
{
    public static void main(String [] args){
        Circulo circulo = new Circulo("Circulo 1" , "Rojo", 5);
        Linea linea = new Linea("Linea 1", "Verde", 17);
        Triangulo triangulo = new Triangulo("Triangulo 1", "Amarillo", 4);
        Cuadrado cuadrado = new Cuadrado("Cuadrado 1", "Morado", 5);
        
        System.out.println("################ Figura 1");
        circulo.imprimir_informacion();
        System.out.println("El radio es: "+circulo.get_radio());
        circulo.calcularRadio();
        System.out.println("\n");
        
        System.out.println("################ Figura 2");
        linea.imprimir_informacion();
        System.out.println("El largo de la linea es: "+linea.get_largo());
        System.out.println("\n");
        
        System.out.println("################ Figura 3");
        triangulo.imprimir_informacion();
        System.out.println("El radio es: "+triangulo.get_angulo());
        triangulo.calcularArea();
        System.out.println("\n");
        
        System.out.println("################ Figura 4");
        cuadrado.imprimir_informacion();
        System.out.println("El area es: "+cuadrado.get_area());
        cuadrado.calcularArea();
        System.out.println("\n");
        
    }
}

