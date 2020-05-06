 import java.util.Scanner;
 /**
  * Crea un programa que calcule y muestre la suma de dos
  * números de dos cifras (de tipo byte) que introduzca el usuario.
  * @author
  * @version 1.0
  */
 public class Suma2Num{
 	public static void main(String [] args){
 		Scanner lector = new Scanner(System.in);

 		System.out.println("Ingresa dos numeros para sumarlos");
 		byte num1 = lector.nextByte();
 		byte num2 = lector.nextByte();

 		int suma = num1 + num2;
 		System.out.println("El resultado es "+ suma);



 	} 
 }
