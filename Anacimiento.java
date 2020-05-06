import java.util.Scanner;

/**
 * Crea un programa que pida al usuario su año de nacimiento
 * y el año actual (suando datos de tipo short) y halle la 
 * diferencia de ambos para obtener su edad.
 * @author Roberto Adrian Bonilla Ruiz
 * @version 1.0
 */

 public class Anacimiento{
 	 public static void main(String [] args){
 	 	Scanner lector = new Scanner(System.in); 

 	 	System.out.println("Ingresa tu año de nacimiento");
 	 		int naci = lector.nextInt();

 	 	System.out.println("Ingresa el año actual");
 	 		int actual = lector.nextInt();

 	 	int diferencia = actual - naci;
 	 	System.out.println("Tienes "+diferencia+ " años");



 	 }

 }
