/**
 * 
 * Ejercicio 03
 *
 * @author Adrián Sánchez Ramírez
 */

public class Ejercicio03 {
  public static void main(String[] args) {

    int numero;
    
    System.out.print("Introduzca el número y te dire el día de la semana: ");
    numero = Integer.parseInt(System.console().readLine()); 
    
    switch(numero) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miércoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("No existe ese día de la semana");
    }

  }
}
