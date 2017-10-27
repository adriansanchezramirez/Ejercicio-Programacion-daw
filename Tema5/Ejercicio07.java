/**
 * 
 * Ejercicio 07
 * 
 * @author Adrián Sánchez Ramírez
 */
public class Ejercicio07 {

  public static void main(String[] args) {
    
    int intento =4;
    int numIntro;
    boolean acierto= false;
    
    do {
      System.out.print("Introduce el numero de la caja fuerte: ");
      numIntro = Integer.parseInt(System.console().readLine());
      
      if (numIntro == 1234){
        acierto= true;
      } else {
          System.out.println("Contraseña Incorrecta");
      }
      
      intento -=1;
      
      } while((intento > 0) && (!acierto));
    
      if (acierto) {
        System.out.println("Ha abierto la caja fuerte");
      } else {
        System.out.println("Has agotado las 4 oportunidades");
      }
    
  }
}
