/**
* Ejercicio 10
*
* @author Adrián Sánchez Ramírez
*/

public class Ejercicio10 {
  public static void main(String[] args) {
  
    String p1;
    System.out.print("Indica la cantidad de MB: ");
    p1 = System.console().readLine();
    double megaBytes = Double.parseDouble (p1);
    
    double kiloBytes = (double) ( megaBytes / 1024);
    
    System.out.println(megaBytes + "Mb son " + kiloBytes + "Kb");
  } 
}
