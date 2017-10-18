/**
 * 
 * Ejercicio 08
 *
 * @author Adrián Sánchez Ramírez
 */

public class Ejercicio08 {
  public static void main(String[] args) {

   System.out.println("Este programa calcula la nota media de 3 examenes");
   System.out.print("Introduce la primera nota: ");
   Double nota1= Double.parseDouble(System.console().readLine());
   
   System.out.print("Introduce la segunda nota: ");
   Double nota2= Double.parseDouble(System.console().readLine());
   
   System.out.print("Introduce la tercera nota: ");
   Double nota3= Double.parseDouble(System.console().readLine());
   
   double media= (nota1 + nota2 + nota3) / 3;
   
   System.out.printf("La media de las tres notas es: %.2f ", media);
   
   if (media <5) {
	   System.out.println("Insuficiente"); 
   }
   
   if ((media >=5) && (media <6)){
	   System.out.println("Suficiente"); 
   }
   
   if ((media >=6) && (media <7)){
	   System.out.println("Bien"); 
   }
   
   if ((media >=7) && (media <9)) {
	   System.out.println("Notable"); 
   }
   
   if ((media >=9) && (media <=10)){
	   System.out.println("Sobresalienre"); 
   }
   if (media >10) {
	   System.out.println("No puedes tener esta nota"); 
   }
  }
}
