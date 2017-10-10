/**
* Ejercicio 2
*
* @author Adrián Sánchez Ramírez
*/

public class Ejercicio2 {
  public static void main(String[] args) {

    
    System.out.print("Introduzca la cantidad de euros: ");
    double euros = Double.parseDouble (System.console().readLine());

    int pesetas = (int) (euros * 166.386);
    
    System.out.print(euros + " euros son " + pesetas + " pts.");   
  } 
}
