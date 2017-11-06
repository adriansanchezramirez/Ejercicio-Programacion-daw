/**
 * 
 * Ejercicio 14
 * 
 * @author Adrián Sánchez Ramírez
 */
public class Ejercicio14 {

  public static void main(String[] args) {
    
    System.out.println("Cálculo de una potencia");
    
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int numero = 0; numero < exponente; numero++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int numero = 0; numero < -exponente; numero++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

    System.out.println(base + "^" + exponente + " = " + potencia);
  }
}
