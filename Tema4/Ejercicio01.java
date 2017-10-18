/**
 * 
 * Ejercicio 01
 *
 * @author Adrián Sánchez Ramírez
 */

public class Ejercicio01 {
  public static void main(String[] args) {

    String dia;
    
    System.out.print("Introduzca el día de la semana y le diré que tiene a primera hora: ");
    dia = (System.console().readLine()); 
    
    switch(dia) {
      case "lunes":
        System.out.println("Sistemas Informaticos");
        break;
      case "martes":
        System.out.println("Programación");
        break;    
      case "miércoles":
        System.out.println("Sistemas Informáticos");
        break;
      case "jueves":
        System.out.println("Programación");
        break;
      case "viernes":
        System.out.println("Programación");
        break;
      case "sábado":
        System.out.println("No hay clase");
        break;
      case "domingo":
        System.out.println("No hay clase");
        break;
      default:
        System.out.println("No existe ese día");
    }

  }
}
