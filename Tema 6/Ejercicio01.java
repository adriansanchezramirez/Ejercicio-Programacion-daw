/**
* Ejercicio 01
*
* @author Luis José Sánchez
*/

public class Ejercicio01 {
  public static void main(String[] args) {

    System.out.println("Muestra el resultado de 3 dados:");
    
    int suma= 0;
    for (int i = 1; i <=3 ; i++) {
      int  dado = (int)(Math.random()*6 + 1); 
      
                                             
      switch(dado) {
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
      suma = suma + dado;
    }
    
    System.out.println("La suma es: " + suma);
  }
}
