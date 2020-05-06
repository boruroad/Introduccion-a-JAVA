import java.util.Scanner;
/**
 * Programa para generar mensajes Telegraficos
 * Objetivo: Utilizar objetos de la clase String
 * @author Bonilla Ruiz Roberto Adrian 
 * @version 1.0
 */
   
public class Telegrafo {
	public static void main (String [] args) {
		Scanner lector = new Scanner(System.in);
				
		//Define aqui las referencias a objetos que necesites

		//Define aqui las variables que necesites
		String nombrePersona, profEnvi, m, lic, mens, calle, numero, ciudad,cP, profesion, destinatario, profReci, mensaje;
		String urgente = "Urgente ";
		int costo, posicion;

		//Recaba informacion
		System.out.println("\nEscriba su nombre");
		nombrePersona = lector.nextLine();
		nombrePersona = nombrePersona.trim();



		System.out.println("\nEscriba su profesion");
		profEnvi = lector.nextLine();
		profEnvi = profEnvi.trim();

		posicion = 0;
		profesion = profEnvi.substring(posicion, posicion+3);  




		System.out.println("\nEscriba el nombre de la persona a quien desea enviar el telegrama");
		destinatario = lector.nextLine();
		destinatario = destinatario.trim();

		System.out.println("\nEscriba la profesion del destinatario");
		profReci = lector.nextLine();
		profReci = profReci.trim();
		profReci = profReci.toLowerCase();

		posicion = 0;
		lic = profReci.substring(posicion, posicion+3);


		System.out.println("\nEscriba la direccion del destinatario:" );
		System.out.println("Calle");
		calle = lector.nextLine();
		calle = calle.trim(); 

		System.out.println("\nNumero");
		numero = lector.nextLine();
		numero = numero.trim();

		System.out.println("\nCiudad");
		ciudad = lector.nextLine();
		ciudad = ciudad.trim();

		System.out.println("\nCP");
		cP =  lector.nextLine();
		cP = cP .trim(); 
		

		System.out.println("\nEscriba su mensaje");
		mensaje = lector.nextLine();
		mens = urgente.concat(mensaje);
		m = mens.replace("Urgente", "necesario");





		System.out.println("\nNombre del remitente: "+nombrePersona);
		System.out.println("Profesion del remitente: "+profEnvi);
		System.out.println("Nombre del destinatario: "+destinatario);
		System.out.println("Profesion del destinatario: "+profReci);
		System.out.println("Direccion del destinatario: "+calle+". "+numero+"."+ciudad+"."+cP+". ");
		System.out.println("Mensaje: "+mens);

		System.out.println("\n\t\t***Telegrama***");

		System.out.println("\nDe: "+profesion+". "+nombrePersona.toUpperCase());
		System.out.println("Para: "+lic+". "+destinatario.toUpperCase());
		System.out.println("Mensaje: ");
		System.out.println(m);
		System.out.println("\n\nCosto: $"+(2*m.length())+".0");

		System.out.println("\n"+m.length()+" letras. Costo por letra $2.00");
		System.out.println("\nDireccion: "+"\n\t"+calle+" "+numero);
		System.out.println("\t"+ciudad+" "+"\n\t"+cP+". ");
			
		
	}
}
