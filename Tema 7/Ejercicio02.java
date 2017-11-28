/**
 * 01.
 * 
 * @author Adrián Sánchez Ramírez
 */

public class Ejercicio02 {
  public static void main(String[] args) {
        
    char[] simbolo = new char[10]; 
            
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
   
    
    
    System.out.println("Los valores del array n son los siguientes: ");
    for (int i = 0; i < 12; i++) {
      System.out.println(simbolo[i]);
    }
    
  }
}
