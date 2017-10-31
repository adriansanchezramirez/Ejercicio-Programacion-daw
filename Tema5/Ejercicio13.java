/**
 * 
 * Ejercicio 13
 * 
 * @author Adrián Sánchez Ramírez
 */
public class Ejercicio13 {

  public static void main(String[] args) {
    
    int positivos= 0;
    int negativos= 0;
    int numero= 0;
    
    System.out.println("Introduzca 10 numeros enteros (positivos y negativos):");
    
    while (numero<10){
      if (Integer.parseInt(System.console().readLine()) < 0) {
        negativos++;
      } else {
        positivos++;
      }
      numero++;
    }
    
    System.out.println("Tienes " + positivos + " positivos y " + negativos + " negativos");
    
  }
}
