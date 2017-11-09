/**
 * 
 * Ejercicio 12
 * 
 * @author Adrián Sánchez Ramírez
 */
public class Ejercicio12 {

  public static void main(String[] args) {
	          
    System.out.print("Introduce los numeros de Fibonacci que se mostraran: "); 
    int numeroIntroducido= Integer.parseInt(System.console().readLine());
    
	int a= 0;
    int b= 1;
    int c= 0;
    
    System.out.print(a + " " + b);
    
    for (int i = 1; i <= numeroIntroducido -2; i++){
		
		c= a+b;
		System.out.print(" " + c);
		
		a=b;
		b=c;
	}
    
  }
}
