import java.util.Scanner;

/**
 * Creacion y uso de objetos de la clase String 
 * @author Roberto Adrian Bonilla Ruiz 
 * @version 1.0
 */

public class RFC{
	public static void main(String [] args){
		Scanner lector = new Scanner(System.in);
		String nombreCompleto, aPaterno, aMaterno, nombre, nacimiento, dia, mes, año;
		int posicion;

		System.out.print("Obtenga su RFC");
		System.out.println("\t\nPorfavor, ingrese su nombre completo");

		//Guarda el dato del usuario en la variable nombreCompleto
		nombreCompleto = lector.nextLine();

		//ELimina los espacios en blanco al final de la cadena
		nombreCompleto = nombreCompleto.trim();
		

		System.out.println("\nFecha de nacimiento en formato \"dd/mm/aa\"");
		//Guarda el dato escrito por el usuario
		nacimiento = lector.nextLine();
		nacimiento = nacimiento.trim();

		posicion = nombreCompleto.indexOf(" ");
		aPaterno = nombreCompleto.substring(posicion+1, posicion+3);
		aPaterno = aPaterno.toUpperCase(); 

		posicion = nombreCompleto.lastIndexOf(" ");
		aMaterno = nombreCompleto.substring(posicion+1, posicion+2);
		aMaterno = aMaterno.toUpperCase();

		posicion = 0;
		nombre = nombreCompleto.substring(posicion, posicion+1);
		nombre = nombre.toUpperCase();

		posicion = 0;
		dia = nacimiento.substring(posicion, posicion+2);

		posicion = nacimiento.indexOf("/");
		mes = nacimiento.substring(posicion+1, posicion+3);

		posicion = nacimiento.lastIndexOf("/");
		año = nacimiento.substring(posicion+1, posicion + 3);

		System.out.println("El RFC de "+nombreCompleto+" es: "+aPaterno+aMaterno+nombre+año+mes+dia);







	} 
}