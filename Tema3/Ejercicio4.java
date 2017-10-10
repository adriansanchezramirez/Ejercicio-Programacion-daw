/**
* Ejercicio 4
*
* @author Adrián Sánchez Ramírez
*/

public class Ejercicio4 {
  public static void main(String[] args) {

    String p1;

    System.out.print("Por favor, introduce un número: ");
    p1 = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( p1 );

    System.out.print("Introduce otro, por favor: ");
    p1 = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( p1 );

    int suma= primerNumero + segundoNumero;
    int resta= primerNumero - segundoNumero;
    int mult= primerNumero * segundoNumero;
    double div= (double) (primerNumero / segundoNumero);

    System.out.println("La suma da como resultado " + suma);
    System.out.println("La resta da como resultado " + resta);
    System.out.println("La multiplicación da como resultado " + mult);
    System.out.println("La división da como resultado " + div);
       
  } 
}
