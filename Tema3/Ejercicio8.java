/**
* Ejercicio 8
*
* @author Adrián Sánchez Ramírez
*/

public class Ejercicio8 {
  public static void main(String[] args) {

    System.out.print("Introduzca las horas semanales: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    System.out.println("El salario semanal es " + (horasTrabajadas * 12) + " euros.");
  } 
}
