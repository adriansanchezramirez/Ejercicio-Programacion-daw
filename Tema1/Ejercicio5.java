/**
 * 
 *  Ejercicio 5
 */

public class Ejercicio5 {
  public static void main(String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul =  "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";

    System.out.println(rojo + "Lunes\tMartes\tMiérc.\tJueves.\tViernes");
    System.out.println("------\t------\t------\t-------\t------");
    System.out.println(verde + "Sist" + azul + "\tProg" + verde +"\tSist" + azul + "\tProg\tProg");
    System.out.println(verde + "Sist" + azul + "\tProg" + verde + "\tSist" + azul +"\tProg\tProg");
    System.out.println(verde + "SIst" + azul +  "\tProg" + verde +"\tSist" + azul + "\tProg" + celeste + "\tEnt");
    System.out.println(blanco + "Fol" + morado + "\tBD" + celeste + "\tEnt" + morado +"\tBD" + naranja + "\tLM");
    System.out.println(blanco + "Fol" + morado + "\tBD" + celeste + "\tEnt" + morado + "\tBD" + naranja + "\tLM");
    System.out.println(blanco + "Fol" + morado + "\tBD" + naranja + "\tLM" + morado + "\tBD" + naranja + "\tLM");
  }
}
