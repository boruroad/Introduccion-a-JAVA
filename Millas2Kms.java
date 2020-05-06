/**
 * Convertidores
 * @author Roberto Adrian Bonilla Ruiz
 * @version 1.0
 */

public class Millas2Kms {
    public static void main(String[] pps) {
	// Variable real real llamada millas
    	double millas = 202;

	// Constante real llamada MILLAS_A_KILOMETROS
    	final double millas_a_Kilometros = 1.609;

	// Variable real llamada kilometros
    	double kilometros = millas*millas_a_Kilometros;

	// Asignacion de valor a la variable kilometros
	System.out.println("\t\n\t***Convertidor millas a kilometros***\n");

	System.out.println("La distancia de Londres a Liverpool es de "+kilometros+" kilómetros"); //Completar esta linea
    }
}
