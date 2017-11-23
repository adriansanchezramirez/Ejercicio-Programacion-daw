/**
* Ejercicio14.Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
* El programa intentará adivinar el número que estás pensando - un número
* entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
* programa debe preguntar si el número que estás pensando es mayor o menor
* que el que te acaba de decir.
*
* @author Adrián Sánchez Ramriez
*/

public class Ejercicio14 {
  public static void main(String[] args) {

    int intentos= 5;
    int numeroPensado;
    int minimo= 0;
    int maximo= 100;
    boolean acertado = false;
    int mMI;
    
    System.out.println("Piensa un número del 0 al 100. El ordenador intentará adivinarlo en 5 intentos.");
    System.out.println("Pulsa la tecla INTRO cuando tengas el número pensado.");
    System.console().readLine();
    
    do {
      numeroPensado= (int)(Math.random() * (maximo - minimo) + minimo);
      System.out.println("El número es: " + numeroPensado);
      System.out.print("El número que estás pensando es 1) mayor 2) menor 3) el mismo: ");
      mMI = Integer.parseInt(System.console().readLine());
      intentos--;
      
      if ((mMI == 1) && (intentos >0))
        minimo = numeroPensado + 1;
        
      if ((mMI == 2) && (intentos >0))
        maximo = numeroPensado - 1; 
        
      if (mMI == 3) {
        acertado = true;
        System.out.println("¡Bien! ¡he acertado!");
      }
    } while (!acertado && (intentos > 0));
    
    if (!acertado) {
      System.out.println("Lo siento, no he  acertado su numero");
    }
  }
}
