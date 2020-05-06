import java.util.Scanner;
/**
 * Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
 * y calcule su equivalencia en metros (1 milla = 1609 m)
 * @author Roberto ADrian Bonilla Ruiz
 * @version 1.0
 */
 public class Millas{
 	public static void main(String [] pps){
 		Scanner lector = new Scanner(System.in);

 		System.out.println("Convertidor de metros a millas "+"\nIngrese num. millas");

 		int milla = lector.nextInt();
 		
 		double conversion = milla*1.69;

 		System.out.println(milla+" milla(s) "+ "son "+conversion+ " metros");


 		


 	}
 }