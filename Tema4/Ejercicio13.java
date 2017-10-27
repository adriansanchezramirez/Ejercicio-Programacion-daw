/**
 * 
 * Ejercicio 13
 *
 * @author Adrián Sánchez Ramírez
 */

public class Ejercicio13 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a ordenar 3 numeros enteros");
    System.out.print("Introduce el primer numero: ");
    int numero1= Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo numero: ");
    int numero2= Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el tercer numero: ");
    int numero3= Integer.parseInt(System.console().readLine());
    
    if ((numero1 <= numero2) && (numero1 <= numero3)){
    if (numero2 <= numero3){
      System.out.print("El orden seria " + numero1 + " luego " + numero2 + " y por ultimo " + numero3 );
      }
    else {
    System.out.print("El orden seria " + numero1 + " luego " + numero3 + " y por ultimo " + numero2 );
    }
    }
    if ((numero2 <= numero1) && (numero2 <= numero3)){
    if (numero1 <= numero3){
      System.out.print("El orden seria " + numero2 + " luego " + numero1 + " y por ultimo " + numero3 );
      }
    else {
      System.out.print("El orden seria " + numero2 + " luego " + numero3 + " y por ultimo " + numero1 );
    }
    }
    if ((numero3 <= numero1) && (numero3 <= numero2)){
    if (numero1 <= numero2){
      System.out.print("El orden seria " + numero3 + " luego " + numero2 + " y por ultimo " + numero1 );
      }
    else {
      System.out.print("El orden seria " + numero3 + " luego " + numero1 + " y por ultimo " + numero2 );
    }
    }
  }
}
