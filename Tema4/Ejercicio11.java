/**
 * 
 * Ejercicio 11
 *
 * @author Adrián Sánchez Ramírez
 */

public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.println("Mostraremos los segundos que faltan para la meidanoche");
    System.out.print("Introduce la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundosPasados= (hora * 3600) + (minutos * 60);
    int segundosQueFaltan= (24 * 3600) - segundosPasados;
    
    if ((hora >23) || (minutos >59)){
		System.out.println("No existe esta hora");
	}
    
    System.out.println("Quedan " + segundosQueFaltan + " segundos");
  }
}
