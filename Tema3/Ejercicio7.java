/**
* Ejercicio 7
*
* @author Adrián Sánchez Ramírez
*/

public class Ejercicio7 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Precio sin IVA: ");
    linea = System.console().readLine();
    double precioSinIva;
    precioSinIva = Double.parseDouble( linea );
    
    double iva= precioSinIva * 0.21 ;
    double precioConIva= precioSinIva *1.21 ;
    
    System.out.println("Precio sin IVA " + precioSinIva);
    System.out.println("IVA " + iva);
    System.out.println("---------------- " );
    System.out.println("Total " + precioConIva);
  } 
}
