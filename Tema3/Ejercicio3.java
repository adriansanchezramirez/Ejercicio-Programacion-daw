/**
* Ejercicio 3
*
* @author Adrián Sánchez Ramírez
*/

public class Ejercicio3 {
  public static void main(String[] args) {

    
    System.out.print("Introduzca la cantidad de pesetas: ");
    int pesetas = Integer.parseInt (System.console().readLine());

    double euros = (int) (pesetas / 166.386);
    
    System.out.print(pesetas + " pts son " + euros + " euros.");   
  } 
}
