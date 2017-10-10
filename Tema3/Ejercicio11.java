/**
* Ejercicio 11
*
* @author Adrián Sánchez Ramírez
*/

public class Ejercicio11 {
  public static void main(String[] args) {
  
    String p1;
    System.out.print("Indica la cantidad de KB: ");
    p1 = System.console().readLine();
    double kiloBytes = Double.parseDouble (p1);
    
    double megaBytes = (double) ( kiloBytes * 1024);
    
    System.out.println(kiloBytes + "Kb son " + megaBytes + "Mb");
  } 
}
