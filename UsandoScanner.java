import java.util.Scanner;
public class UsandoScanner {
	public static void main(String[] args) {

		//Scanner como clase
			Scanner entrada = new Scanner(System.in);

		//Con nextLIne estas guardando un STring (una cadena de caracteres)
			System.out.println("Hola, introduce tu nombre porfavor");

			//Se guarda el nombre del usuario en la variable "entrada" la cual es del tipo String
		String nombreUsuario =  entrada.nextLine();

		//Imprimimos el nombre dado y mensaje 
			System.out.println("Hola " + nombreUsuario+", introduce tu edad porfavor");
			int edad = entrada.nextInt();

			System.out.println(nombreUsuario.length());

			//Vamos a imprimir la edad del usuario para el siguiente año
		 System.out.println("Wujuuu, el año que viene tendrás "+(edad+1)+ " años");

	}
}