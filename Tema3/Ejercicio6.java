/**
* Ejercicio 6
*
* @author Adrián Sánchez Ramírez
*/

public class Ejercicio6 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce la base en centimetros: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt( linea );
    
    System.out.print("introduce la altura en centimetros: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt( linea );
    
    int area= (base * altura) / 2;
    
    System.out.println("La base de un Triangulo es " + base);
    System.out.println("La altura de un Triangulo es " + altura);
    System.out.println("El area del rectangulo es " + area + " centimetros");
  } 
}
