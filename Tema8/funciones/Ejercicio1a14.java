/**
 * Ejercicio 1 al 14
 * 
 * @author Adrián Sánchez Ramírez
 */

package funciones;

public class Ejercicio1a14 {

  /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return  <code>true</code> si el número es primo
   * @return  <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) {
    
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    
    return true;
  }

  
}
