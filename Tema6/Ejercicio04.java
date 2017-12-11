/**
* Ejercicio03
*
* @author Adrián Sánchez Ramriez
*/

public class Ejercicio04 {
  public static void main(String[] args) {

    System.out.println("Veinte números aleatorios:");

    for (int i = 1; i < 21; i++) {
      int numero= (int)(Math.random()*11);
      System.out.print(numero + " ");
    }
  }
}
