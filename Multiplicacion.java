/**
 * Crea un programa que calcule y muestre el producto de dos números enteros que introduzca el usuario.
 */
import java .util.Scanner;

public class Multiplicacion{
	public static void main(String [] pps){
		Scanner lector = new Scanner(System.in);
		int num1, num2;

		System.out.println("\nHola, ingresa 2 numeros para multiplicarlos");

		num1 = lector.nextInt();

		num2 = lector.nextInt();

		int mult = num1*num2;

		System.out.println("\nLa multiplicación de "+num1+" y "+num2+" es "+mult+"\n\nGracias :)");

	}
}