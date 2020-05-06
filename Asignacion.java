/**
 * Manejo de Expresiones Aritméticas
 * @author Roberto Adrian Bonilla Ruiz
 * @version 1.0
 */

public class Asignacion {
    public static void main(String[] pps) {
	int a = 5;
	int b = 2;
	int c = 3;
	int resultado = 0;

	int resultado1 = a + b+ c+ a * b + c;
	int resultado2 = (a + b ) * c;
	int resultado3 = (a + b * c);

	System.out.println("\nLa variable a vale "+a);
	System.out.println("La variable b vale "+b);
	System.out.println("La variable c vale "+c);

	System.out.println("\nEL resutado es "+resultado1);
	System.out.println("EL resutado es "+resultado2);
	System.out.println("EL resutado es "+resultado3);
    }
}
