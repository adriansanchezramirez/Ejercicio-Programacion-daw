/**
* Ejercicio09.Realiza un programa que vaya generando números aleatorios pares entre 0
* y 100 y que no termine de generar números hasta que no saque el 24. El
* programa deberá decir al final cuántos números se han generado.
*
* @author Adrián Sánchez Ramriez
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    
    int contadorSuspenso= 0;
    int contadorSuficiente= 0;
    int contadorBien= 0;
    int contadorNotable= 0;
    int contadorSobresaliente= 0;
    
    for (int i = 1; i <=20 ; i++) {
      int  nota = (int)(Math.random()*5 + 1); 
      
      switch(nota) {
        case 1:
          System.out.println("Suspenso ");
          break;
        case 2:
          System.out.println("Suficiente ");
          break;
        case 3:
          System.out.println("Bien ");
          break;
        case 4:
          System.out.println("Notable ");
          break;
        case 5:
          System.out.println("Sobresaliente ");
          break;
        default:
      }
      if (nota == 1){
        contadorSuspenso++;
      }
      if (nota == 2){
        contadorSuficiente++;
      }
      if (nota == 3){
        contadorBien++;
      }
      if (nota == 4){
        contadorNotable++;
      }
      if (nota == 5){
        contadorSobresaliente++;
      }
    }
      System.out.println();
      System.out.println("---------------");
      System.out.println("Suspenso: " + contadorSuspenso);
      System.out.println("Suficiente: " + contadorSuficiente);
      System.out.println("Bien: " + contadorBien);
      System.out.println("Notable: " + contadorNotable);
      System.out.println("Sobresaliente: " + contadorSobresaliente);
  }
}
