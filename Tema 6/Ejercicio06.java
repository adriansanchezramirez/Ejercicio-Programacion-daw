/**
* Ejercicio06.Escribe un programa que piense un número al azar entre 0 y 100. El usuario
* debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
* fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
* ducido es menor o mayor que el número secreto.
*
* @author Adrián Sánchez Ramriez
*/

public class Ejercicio06 {
  public static void main(String[] args) {

    int intentos = 5;
    int numeroIntroducido;
    boolean acertado = false;
    int numeroAzar = (int)(Math.random() * 101);
    
    System.out.println("Estoy pensando un numero del 0 al 100.Tienes 5 oportunidades");
    
    do {
      System.out.print("Introduzca un numero: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      intentos--;
      
      if ((numeroIntroducido > numeroAzar) && (intentos > 0)){
        System.out.println("El número introducido es menor");
        System.out.println("Te quedan " + intentos + " oportunidades");
      }
      
      if ((numeroIntroducido < numeroAzar) && (intentos > 0)){
        System.out.println("El número introducido es mayor");
        System.out.println("Te quedan " + intentos + " oportunidades");
      }
      
      if (numeroIntroducido == numeroAzar){
        acertado= true;
        System.out.println("ENHORABUENA HAS ACERTADO");
      }
    } while (!acertado && (intentos > 0));
    
    if (!acertado) {
      System.out.println("Lo siento, no has acertado, el número que estaba pensando era el " + numeroAzar);
    }
    
    
  }
}
