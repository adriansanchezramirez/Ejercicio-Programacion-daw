/**
 * 
 * Ejercicio 04
 *
 * @author Adrián Sánchez Ramírez
 */

public class Ejercicio04 {
  public static void main(String[] args) {

    int sueldo;
    
    System.out.print("Introduzca las horas semanales: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if (horasTrabajadas <=40){
		sueldo= 12 * horasTrabajadas;
    } else{ 
		sueldo= (12 * 40) + ((horasTrabajadas - 40) * 16);
    }
    System.out.println("El sueldo semanal es " + sueldo + " euros");  
  }
}
