/**
 * 
 * Ejercicio 16
 * 
 * @author Adrián Sánchez Ramírez
 */
public class Ejercicio16 {

  public static void main(String[] args) {
    
    System.out.println("Vamos a decir si es numero es primo");
    System.out.print("Introduce el numero entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    boolean primo= true;
    
    for(int numero=2; numero <numeroIntroducido; numero++){
      if ((numeroIntroducido % numero) ==0){
        primo= false;
      }
    }
    
    if (primo){
      System.out.print("El numero " + numeroIntroducido + " es primo");
    } else {
      System.out.print("El numero " + numeroIntroducido + " no es primo");
    }
    
  }
}
