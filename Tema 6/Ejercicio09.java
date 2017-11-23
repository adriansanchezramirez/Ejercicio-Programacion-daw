/**
* Ejercicio09.Realiza un programa que vaya generando números aleatorios pares entre 0
* y 100 y que no termine de generar números hasta que no saque el 24. El
* programa deberá decir al final cuántos números se han generado.
*
* @author Adrián Sánchez Ramriez
*/

public class Ejercicio09 {
  public static void main(String[] args) {

    int contador= 0;
    int numero= 0;
    
    while (numero != 24){
       numero= (int)((Math.random()*51)*2);
      System.out.print(numero + " ");
      contador++;
    }
    
    System.out.println();
    System.out.println("Los cantidad de números es: " + contador);
  }
}
