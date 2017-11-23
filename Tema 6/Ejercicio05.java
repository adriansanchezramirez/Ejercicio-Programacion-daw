/**
* Ejercicio03
*
* @author Adrián Sánchez Ramriez
*/

public class Ejercicio05 {
  public static void main(String[] args) {

    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    
    System.out.println("Cincuenta números aleatorios:");

    for (int i = 1; i < 51; i++) {
      int numero= (int)((Math.random()*100) + 100);
      System.out.print(numero + " ");
      suma+= numero;
      
      if (numero < minimo) {
        minimo = numero;
      }
      
      if (numero > maximo) {
        maximo = numero;
      }
    }
    System.out.println("\nMinimo: " + minimo);
    System.out.println("Maximo: " + maximo);
    System.out.println("Media: " + (suma/50));
  }
}
