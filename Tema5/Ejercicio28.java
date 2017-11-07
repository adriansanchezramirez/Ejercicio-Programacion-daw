/**
 * 
 *  28. Escribe un programa que calcule el factorial de un número entero leído por
 *      teclado
 * 
 * @author Adrian Sánchez Ramirez
 */
public class Ejercicio28 {

  public static void main(String[] args) {

    int numeroIntroducido;
    
    do {
      System.out.print("Introduce un numero entero: ");
      numeroIntroducido= Integer.parseInt(System.console().readLine());
    
      if (numeroIntroducido <0){
        System.out.println("El numero es incorrecto");
      } 
    } while (numeroIntroducido <0);
    
    int factorial= numeroIntroducido;
    
    if (numeroIntroducido == 0){
      System.out.println("El factorial de " + numeroIntroducido + " es 1");
    } else {
      for (int numero = 1; numero < numeroIntroducido; numero++) {
        factorial *= numero;
      }

      System.out.println(numeroIntroducido + "! = " + factorial);
    }
    
  }
}
