/**
* Ejercicio12.Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
* con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
* convertir un entero en un carácter.
*
* @author Adrián Sánchez Ramriez
*/

public class Ejercicio12 {
  public static void main(String[] args) {

    String verde= "\033[32m";
    
   System.out.print(verde);
    
    for (long i = 1; i < 900000000; i++) {
      int numero= (int)((Math.random()*94) + 32);
      
      System.out.print((char)(numero));
    }
  }
}
