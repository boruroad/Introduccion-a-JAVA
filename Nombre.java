import java.util.Scanner;

public class Nombre {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu nombre");


		String nombre = entrada.nextLine();
		System.out.println("Ingresa tu edad");
		int edad = entrada.nextInt();
		System.out.println("Nombre" +nombre + "edad" +edad);
	}

}	