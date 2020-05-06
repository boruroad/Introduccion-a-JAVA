/**
 * Programa para  escribir las instrucciones de asignación compuesta
 * @author Roberto Adrián Bonilla Ruiz
 * @version 1.0
 */

public class AsignacionCompuesta {
    public static void main (String[] pps) {
	int a = 5;
	int b = 2;
	int c = 3;
	int x = 0;
	String mensaje = "El valor de x es ";

	x = x + (3 * c);
	System.out.println(mensaje + x);
	x+= -b + 87;
	System.out.println(mensaje + x);
	x+= c + a;
	System.out.println(mensaje + x);
	x*= (c + 40);
	System.out.println(mensaje + x);
	x/= (c + 54);
	System.out.println(mensaje + x);
    }
}
