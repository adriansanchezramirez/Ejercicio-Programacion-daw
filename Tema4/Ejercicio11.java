/**
 * 
 * Ejercicio 11
 *
 * @author Adrián Sánchez Ramírez
 */

public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.println("Mostraremos los segundos que faltan para la medianoche");
    System.out.print("Introduce la hora (de 0 a 23): ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce los minutos  (de 0 a 59): ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    if ((hora >23) || (minutos >59)){
		System.out.println("No existe esta hora");
	}
		
    int segundosPasados= (hora * 3600) + (minutos * 60);
    int segundosQueFaltan= (24 * 3600) - segundosPasados;
  
    System.out.println("Quedan " + segundosQueFaltan + " segundos hasta medianoche");
  }
}
