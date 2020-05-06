
/**
 *Calcula "a mano" el resultado de las siguientes operaciones
 *con números enteros, y luego crea un programa que muestre el resultado.
 * @author Roberto Adrian Bonilla Ruiz
 * @version 1.0
 */

public class IncreDecre{
	public static void main(String [] args){

		double a;
		a = 5;
		
		System.out.println((a++)+", " +(a*=2)+ ", " + (a-=3)+ ", " + (a%=5)+ ", "+ (a=a+7));
		
	}
} 
