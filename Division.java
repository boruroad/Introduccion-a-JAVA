import java.util.Scanner;

/** Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.
 * @author Roberto Adrián Bonilla RUiz
 * @version 1.0
 */
public class Division{
	public static void main(String [] pps){
	
		System.out.println("Hola, ingresa 2 numeros para dividirlos");
			Scanner lector = new Scanner(System.in);
			int num1,num2;
			num1 = lector.nextInt();
			num2 = lector.nextInt();

			double resuldiv = (num1/num2);
			double residuo = (num1%num2);

			System.out.println("La división de "+num1+" entre "+num2+" es "+resuldiv);
			System.out.println("Su residuo es " + residuo+ "\nGracias :)");


	}
}
		