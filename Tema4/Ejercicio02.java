/**
 * 
 * Ejercicio 02
 *
 * @author Adrián Sánchez Ramírez
 */

public class Ejercicio02 {
  public static void main(String[] args) {

    System.out.print("Introduzce una hora del día : ");
    int hora = Integer.parseInt(System.console().readLine());

    if ((hora >=6) && (hora <=12)){
		System.out.println("Buenos días");
	}
     
    if ((hora >=13) && (hora <=20)){
	    System.out.println("Buenas tardes");
	}
	
	if (((hora >=21) && (hora <=23)) || ((hora ==0) && (hora <=5))){
	    System.out.println("Buenas noches");
	}
	
	if ((hora >23) || (hora <0)){
	    System.out.println("No existe esta hora");
	}
  }
}
