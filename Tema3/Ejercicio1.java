/**
* Ejercicio 1
*
* @author Adrián Sánchez Ramírez
*/

public class Ejercicio1 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );

    System.out.print("Introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );

    int total;
    total = primerNumero * segundoNumero;

    System.out.print("La multiplicación es ");
    System.out.print(total);   
  } 
}
