import java.util.Scanner;
public class Cond1 {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese un número del 0 al 100");

		int numU= lector.nextInt();
		//System.out.println("Tu número es " + numU);*/

		if(numU>=0 && 100>=numU){
			System.out.println("Correcto");
		}else{
			System.out.println("Número inválido");	
		}
	}
}