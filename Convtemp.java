import java.util.Scanner;
/**
 *Crea un programa que pida al usuario una temperatura en grados centígrados 
 *y calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).
 * @author
 * @version 1.0
 */

public class Convtemp{
	public static void main(String [] args){
		
		Scanner lector = new Scanner(System.in);

		System.out.println("Convertidor de grados Centígrados a Fahrenheit "+"\nIngrese num. ºC");
		
		double  tempC = lector.nextDouble();
	
		double conver = (9*tempC)/5 + 32;

		//(0 °C × 9/5) + 32

		System.out.println((int)tempC + " grados Centígrados son "+ conver +" Fahrenheit");


	}
}