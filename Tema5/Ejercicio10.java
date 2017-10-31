/**
 * 
 * Ejercicio 10
 * 
 * @author Adrián Sánchez Ramírez
 */
public class Ejercicio10 {

  public static void main(String[] args) {
    
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Calculamos la media de los números positivos introducidos.");
    System.out.println("Vaya introduciendo números (puede parar con un número negativo):");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
    }
    
    System.out.println("La media de los números es " + (suma - numeroIntroducido)/ (numeros - 1));
      
  }
}
