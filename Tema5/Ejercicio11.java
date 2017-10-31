/**
 * 
 * Ejercicio 11
 * 
 * @author Adrián Sánchez Ramírez
 */
public class Ejercicio11 {

  public static void main(String[] args) {
    
    int numero = 0;
    
    System.out.print("Introduce un numero (positivo)"); 
    int numeroIntroducido= Integer.parseInt(System.console().readLine());
    
    while (numero <=5){
      System.out.printf("%5d %8d %12d\n",numeroIntroducido,numeroIntroducido * numeroIntroducido,numeroIntroducido * numeroIntroducido * numeroIntroducido);
      numero++;
      numeroIntroducido++;
    }
  
  }
}
