/**
* Ejercicio03
*
* @author Adrián Sánchez Ramriez
*/

public class Ejercicio03 {
  public static void main(String[] args) {

    System.out.println("Muestra una carta de la baraja española al azar:");
    
    int aux= 0;
    for (int i = 1; i <=1 ; i++) {
      int carta = (int)(Math.random()*10 + 1); 
      
      switch(carta) {
        case 1:
          System.out.print("As ");
          break;
        case 2:
          System.out.print("2 ");
          break;
        case 3:
          System.out.print("3 ");
          break;
        case 4:
          System.out.print("4 ");
          break;
        case 5:
          System.out.print("5 ");
          break;
        case 6:
          System.out.print("6 ");
          break;
        case 7:
          System.out.print("7 ");
          break;
        case 8:
          System.out.print("Sota ");
          break;
        case 9:
          System.out.print("Caballo ");
          break;
        case 10:
          System.out.print("Rey ");
          break;
        default:
      }
      
      
    }
    for (int i = 1; i <=1 ; i++) {
      int palo = (int)(Math.random()*4 + 1); 
      
      switch(palo) {
        case 1:
          System.out.print("de Copas");
          break;
        case 2:
          System.out.print("de Espadas");
          break;
        case 3:
          System.out.print("de Oros");
          break;
        case 4:
          System.out.print("de Bastos");
          break;
        default:
      }
    
    }
   
   
  }
}
