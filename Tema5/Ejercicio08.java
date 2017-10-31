/**
 * 
 * Ejercicio 08
 * 
 * @author Adrián Sánchez Ramírez
 */
public class Ejercicio08 {

  public static void main(String[] args) {
    
    int numeroIntroducido= 0;
    int numero= 1;
    
    System.out.print("Introduzca un número del cual sacaremos su tabla de multiplicar: ");
    numeroIntroducido= Integer.parseInt(System.console().readLine());
    
    while (numero <= 10){
      System.out.println(numeroIntroducido * numero);
      numero ++;
    }
      
  }
}
