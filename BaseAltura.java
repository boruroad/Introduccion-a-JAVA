import java.util.Scanner;
/**
 * Crea un programa que pregunte al usuario la base y 
 * la altura de un triángulo y muestre su superficie (S = B*A/2).
 * @author Roberto Adrian Bonilla Ruiz
 * @version 1.0
 */
public class BaseAltura{
	public static void main(String [] args){
		Scanner lector = new Scanner(System.in);

		System.out.println("Conoce la superficie de un triángulo :) "+"\nPor favor, ingrese la base");
			double base = lector.nextDouble();

		System.out.println("Ingrese la altura");
			double altura = lector.nextDouble();
			 	
			 	double superficie = (base*altura)/2;

		System.out.println("La superficie de su triangulo es " + superficie);

      
	} 
}