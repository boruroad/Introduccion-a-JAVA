import java.util.Scanner;
/**
 * Programa para tener sesiones con un psicologo
 * @author Roberto Adrian Bonilla Ruiz
 * @version 1.0
 */
public class Psicologo {
    public static void main(String [] pps) {
	//Declarar variables
    Scanner lector = new Scanner(System.in);
    String nombre;
    String respuesta;
    String respuesta2;

    // Dar bienvenida al paciente y solicitar su nombre
    System.out.println("\nBienvenido, cual es su nombre ?");
    nombre = lector.nextLine();

    //Saludar al paciente y preguntar cual es su problema.
    System.out.println("Buenas tardes "+nombre+"."+"\nDigame, cual es su problema en la vida?");
    respuesta = lector.nextLine();

    //Contestar "MMMM... ya veo", en otra linea "Y dime...Por que dices ...
    System.out.println("MMMM... ya veo"+"\nY digame "+nombre+" \nPor que dice \""+respuesta+"\"?");
    respuesta2 = lector.nextLine();

    //Contestar Muy interesante!!, Hablaremos de ello con  mas detalle en la siguiente sesion.
    System.out.println("Muy interesante !! Hablaremos de ello con mas detalle en la siguiente sesion.");

    }
}
