/**
 * 
 * Ejercicio 15
 * 
 * @author Adrián Sánchez Ramírez
 */
public class Ejercicio15 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número real como base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca un múmero entero como exponente: ");
    int exponenteFinal = Integer.parseInt(System.console().readLine());

    double potencia;
    int exponente;
        
    for (int numero = 1; numero <= exponenteFinal; numero++) {
        
      potencia = 1;
      exponente = numero;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + numero + " = " + potencia);
    }
  }
}
