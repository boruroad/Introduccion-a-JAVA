import java.util.Scanner;
public class Gretel {
	public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);

		
		System.out.println("Hola, introduce un número");
		int num1 =  entrada.nextInt();

System.out.println("Hola, introduce otro número");
int num2 =  entrada.nextInt();

int suma = num1 +num2;


		while(suma>2){
			System.out.println("la suma es mayor que 2");
		}
		

		//Imprimimos el nombre dado y mensaje 
			//System.out.println("Hola " + nombreUsuario+", introduce tu edad porfavor");
			//int edad = entrada.nextInt();




			//System.out.println(nombreUsuario.length());

			//Vamos a imprimir la edad del usuario para el siguiente año
		 //System.out.println("Wujuuu, el año que viene tendrás "+(edad+1)+ " años");

	}
}