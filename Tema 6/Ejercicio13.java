/**
* Ejercicio13.Escribe un programa que simule la tirada de dos dados. El programa deberá
* continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
* dados tengan el mismo valor.
*
* @author Adrián Sánchez Ramriez
*/

public class Ejercicio13 {
  public static void main(String[] args) {

    int dado1= 0;
    int dado2= 0;
    
    do {
      dado1= (int)(Math.random()*6 + 1);
      
      switch(dado1) {
        case 1:
          System.out.print("⚀ ");
          break;
        case 2:
          System.out.print("⚁ ");
          break;
        case 3:
          System.out.print("⚂ ");
          break;
        case 4:
          System.out.print("⚃ ");
          break;
        case 5:
          System.out.print("⚄ ");
          break;
        case 6:
          System.out.print("⚅ ");
          break;
        default:
      }
      
      dado2= (int)(Math.random()*6 + 1);
      
      switch(dado2) {
        case 1:
          System.out.println("⚀ ");
          break;
        case 2:
          System.out.println("⚁ ");
          break;
        case 3:
          System.out.println("⚂ ");
          break;
        case 4:
          System.out.println("⚃ ");
          break;
        case 5:
          System.out.println("⚄ ");
          break;
        case 6:
          System.out.println("⚅ ");
          break;
        default:
      }
    } while (dado1 != dado2);
  }
}
