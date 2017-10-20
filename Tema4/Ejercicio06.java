/**
 * 
 * Ejercicio 06
 *
 * @author Adrián Sánchez Ramírez
 */

public class Ejercicio06 {
  public static void main(String[] args) {

    final double g= 9.81;
    System.out.print("Introduce la altura(cm) desde que cae el objeto: ");
    Double h= Double.parseDouble(System.console().readLine());
    
    double solucion = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer.\n", solucion);
  }
}
