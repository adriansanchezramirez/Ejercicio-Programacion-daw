/**
 * 
 * Ejercicio 17
 * 
 * @author Adrián Sánchez Ramírez
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    
    int numeroIntroducido;
    
    do { 
      System.out.print("Introduce un numero entero positivo: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido <0){
        System.out.println("Este numero no es positivo");
      }
    } while (numeroIntroducido < 0);
    
    int suma= 0;
    
    for (int numero= numeroIntroducido; numero < numeroIntroducido + 100; numero++){
      suma += numero;
    }
    System.out.println("La suma de los 100 números siguientes de " + numeroIntroducido + " es " + suma);
  }
}
